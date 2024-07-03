/*
 * Modulo: Estado Trajetoria
 * Contem as variaveis de estado da trajetoria e de controle da maquina em geral
 */

#include "trj_state.h"
#include <stdio.h>

int tst_line;
float tst_x;
float tst_y;
float tst_z;
float tst_deltaX;
float tst_deltaY;
int tst_step;

int tst_getCurrentLine() {
	return tst_line;
} // tst_getCurrentLine

void tst_setCurrentLine(int line) {
	tst_line = line;
} // tst_setCurrentLine

float tst_getX() {
	return tst_x;
} // tst_getX

float tst_getY() {
	return tst_y;
} // tst_getY

void tst_setX(float x) {
	tst_x = x;
} // tst_setX

void tst_setY(float y) {
	tst_y = y;
} // tst_setY

// Funções para delta e step
float tst_getDeltaX() {
	return tst_deltaX;
} // tst_getDeltaX

float tst_getDeltaY() {
	return tst_deltaY;
} // tst_getDeltaY

void tst_setDeltaX(float deltaX) {
	tst_deltaX = deltaX;
} // tst_setDeltaX

void tst_setDeltaY(float deltaY) {
	tst_deltaY = deltaY;
} // tst_setDeltaY

int tst_getStep() {
	return tst_step;
} // tst_getStep

void tst_setStep(int step) {
	tst_step = step;
} // tst_setStep

void tst_init() {
	tst_line = 0;
	tst_x = 0.0f;
	tst_y = 0.0f;
	tst_z = 0.0f;
	tst_deltaX = 0.0f;
	tst_deltaY = 0.0f;
	tst_step = 0;
} // tst_init

