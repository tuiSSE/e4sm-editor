/************************************************************

	MeasureObj_Binary__f1Score.h  -  generated by CodeGenerator r$Rev$

************************************************************/

#ifndef _MEASURE_OBJ_Binary__f1ScoreHEADER
#define _MEASSURE_OBJ_Binary__f1ScoreHEADER

#include "gmnet.h"
#include "MeasureObj.h"

class MeasureObj_Binary__f1Score : public MeasureObj {
public:
	MeasureObj_Binary__f1Score(NetClass* net);
	~MeasureObj_Binary__f1Score();

	bool accumulative() {return false;}
	bool timeaverage() {return false;}
	double measure(double dt);
	void accum(const Binding *binding, double weight);
};

extern MeasureObj_Binary__f1Score* measure_Binary__f1Score;
#endif
