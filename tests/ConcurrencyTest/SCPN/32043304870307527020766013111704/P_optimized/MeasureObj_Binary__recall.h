/************************************************************

	MeasureObj_Binary__recall.h  -  generated by CodeGenerator r$Rev$

************************************************************/

#ifndef _MEASURE_OBJ_Binary__recallHEADER
#define _MEASSURE_OBJ_Binary__recallHEADER

#include "gmnet.h"
#include "MeasureObj.h"

class MeasureObj_Binary__recall : public MeasureObj {
public:
	MeasureObj_Binary__recall(NetClass* net);
	~MeasureObj_Binary__recall();

	bool accumulative() {return false;}
	bool timeaverage() {return false;}
	double measure(double dt);
	void accum(const Binding *binding, double weight);
};

extern MeasureObj_Binary__recall* measure_Binary__recall;
#endif