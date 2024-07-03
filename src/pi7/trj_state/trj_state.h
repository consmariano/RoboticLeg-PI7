#ifndef __trj_state_h
#define __trj_state_h

// external interface
extern int tst_getCurrentLine();
extern void tst_setCurrentLine(int line);
extern float tst_getX();
extern float tst_getY();
//extern float tst_getZ();
extern void tst_setX(float x);
extern void tst_setY(float y);
//extern void tst_setZ(float z);
extern void tst_init();

extern int tst_getStep();
extern void tst_setStep(int step);
extern float tst_getDeltaX();
extern void tst_setDeltaX(float deltaX);
extern float tst_getDeltaY();
extern void tst_setDeltaY(float deltaY);
#endif
