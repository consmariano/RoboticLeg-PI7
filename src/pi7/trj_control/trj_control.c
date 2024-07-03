/**
 * Modulo: Controlador de trajetoria (exemplo!!)
 *
 */

/*
 * FreeRTOS includes
 */
#include "FreeRTOS.h"
#include "queue.h"

#include <stdio.h>

// Header files for PI7
#include "trj_control.h"
#include "../trj_program/trj_program.h"
#include "../trj_state/trj_state.h"
#include "../comm_pic/comm_pic.h"

// local variables
int tcl_status;
extern xQueueHandle qCommPIC;

#define NUM_STEPS 20

void tcl_generateSetpoint() {
  int currLine;
  tpr_Data line1, line2;
  pic_Data toPic;
  float pt1x, pt1y, pt2x, pt2y;
  float deltaX, deltaY;
  int step = tst_getStep();


  // Adiciona uma mensagem indicando que a função foi chamada
  //printf("Entrando em tcl_generateSetpoint\n");
  //fflush(stdout);


  if (tcl_status != STATUS_RUNNING) {
    return;
  }

  if (step == 0) {
      currLine = tst_getCurrentLine();
      printf("CurrLine %d\n", currLine);
      line1 = tpr_getLine(currLine);
      currLine++;
      tst_setCurrentLine(currLine);
      line2 = tpr_getLine(currLine);

      pt1x = line1.x;
      pt1y = line1.y;
      pt2x = line2.x;
      pt2y = line2.y;

      deltaX = (line2.x - line1.x) / NUM_STEPS;
      deltaY = (line2.y - line1.y) / NUM_STEPS;
      
      tst_setDeltaX(deltaX); 
      tst_setDeltaY(deltaY);

      printf("Linha 1: x = %f, y = %f\n", pt1x, pt1y);
      printf("Linha 2: x = %f, y = %f\n", pt2x, pt2y);
      fflush(stdout);

  } else {
      deltaX = tst_getDeltaX();
      deltaY = tst_getDeltaY();  
  }

  float interpolatedX = pt1x + step * deltaX;
  float interpolatedY = pt1y + step * deltaY;

  toPic.setPoint1 = interpolatedX;
  toPic.setPoint2 = interpolatedY;

  printf("Step: %d, pt1x: %f, pt1y: %f, deltaX: %f, deltaY: %f, interpolatedX: %f, interpolatedY: %f\n", step, pt1x, pt1y, deltaX, deltaY, interpolatedX, interpolatedY);
  fflush(stdout);

  //toPic.setPoint3 = line.z;
  xQueueSend(qCommPIC, &toPic, portMAX_DELAY);
  currLine++;

  //tst_setCurrentLine(currLine);
  if (step == NUM_STEPS) {
    step = 0;
  }

  tst_setStep(step);
} // trj_generateSetpoint


void tcl_processCommand(tcl_Data data) {

  if ((data.command == CMD_SUSPEND) || (data.command == CMD_STOP)) {
    tcl_status = STATUS_NOT_RUNNING;
  }

  if ((data.command == CMD_START) || (data.command == CMD_RESUME)) {
    printf("starting trajectory\n");
    tcl_status = STATUS_RUNNING;
  }

  if (data.command == CMD_START) {
    tst_setCurrentLine(0);
  }

} // trj_executeCommand

void tcl_init() {
  tcl_status = STATUS_NOT_RUNNING;
} // init
