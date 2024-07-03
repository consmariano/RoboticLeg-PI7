/*
 * Modulo: Programa Trajetoria
 * Armazena o programa da trajetoria a ser executada
 */

// max NC program size
#define MAX_PROGRAM_LINES 50

#include "trj_program.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "../gcode_parser/gcode_parser.h" 

// structure to store NC program
tpr_Data tpr_program[MAX_PROGRAM_LINES];

void tpr_storeProgram(char* filename) {
  FILE *file = fopen(filename, "r");
  if (!file) {
    perror("Erro ao abrir o arquivo.");
    return;
  }

  char line[256];
  int line_index = 0;

  while (fgets(line, sizeof(line), file) && line_index < MAX_PROGRAM_LINES) {
        GCode gcode = parse_gcode(line);
        if (gcode.has_x && gcode.has_y) {
            tpr_program[line_index].x = gcode.x;
            tpr_program[line_index].y = gcode.y;
            printf("Linha %d: x = %f, y = %f, z = %f\n", line_index, gcode.x, gcode.y, gcode.z);
            line_index++;
        }
    }

    fclose(file);

    /*int line = 0;
    float x, y;
    char* token;
    char* rest = texto;

    // Analisa o texto linha por linha
    while ((token = strtok_r(rest, "\n", &rest)) && line < MAX_PROGRAM_LINES) {
        // Analisa cada linha para x, y, z
        if (sscanf(token, "%f %f", &x, &y) == 2) {
            tpr_program[line].x = x;
            tpr_program[line].y = y;
            line++;
        }
  
	}*/
} // tpr_storeProgram

tpr_Data tpr_getLine(int line) {
	return tpr_program[line];
} // tpr_getLine

void tpr_init() {
  int i;

  for (i=0; i<MAX_PROGRAM_LINES;i++) {
	  tpr_program[i].x = 0;
	  tpr_program[i].y = 0;
  }
} //tpr_init
