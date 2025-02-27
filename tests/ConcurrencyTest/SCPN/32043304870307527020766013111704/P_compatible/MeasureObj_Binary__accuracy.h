/************************************************************

	MeasureObj_Binary__accuracy.h  -  generated by CodeGenerator r$Rev$

************************************************************/

#ifndef _MEASURE_OBJ_Binary__accuracyHEADER
#define _MEASSURE_OBJ_Binary__accuracyHEADER

#include "gmnet.h"
#include "MeasureObj.h"

class MeasureObj_Binary__accuracy : public MeasureObj {
public:
	MeasureObj_Binary__accuracy(NetClass* net);
	~MeasureObj_Binary__accuracy();

	bool accumulative() {return false;}
	bool timeaverage() {return false;}
	double measure(double dt);
	void accum(const Binding *binding, double weight);
};

extern MeasureObj_Binary__accuracy* measure_Binary__accuracy;
#endif
