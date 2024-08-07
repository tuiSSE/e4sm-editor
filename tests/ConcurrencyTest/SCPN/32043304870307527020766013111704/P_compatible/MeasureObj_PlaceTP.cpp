/************************************************************

	MeasureObj_PlaceTP.cpp  -  generated by CodeGenerator r$Rev$

************************************************************/

#include "Token_int.h"
#include "Token_bool.h"
#include "Token_real.h"
#include "Token_string.h"
#include "Token_DateTime.h"
#include "Token_Data.h"
#include "MeasureObj_C1__in__use.h"
#include "MeasureObj_Binary__accuracy.h"
#include "MeasureObj_Binary__specificity.h"
#include "MeasureObj_Binary__recall.h"
#include "MeasureObj_Binary__precision.h"
#include "MeasureObj_Binary__f1Score.h"
#include "MeasureObj_fsdf.h"
#include "MeasureObj_PlaceTP.h"

MeasureObj_PlaceTP* measure_PlaceTP;

MeasureObj_PlaceTP::MeasureObj_PlaceTP(NetClass* net) : MeasureObj("PlaceTP", net, true)
{
}

double MeasureObj_PlaceTP::measure(double dt=-1)
{
	// Orig Expression: #Binary_tp
	// C++  Expression: #P000065
	Place *P000065 = net->getPlace("Binary_tp");

	double rate = (P000065->getMarkingSize());

	return rate;
}

void MeasureObj_PlaceTP::accum(const Binding *binding, double weight) {}
MeasureObj_PlaceTP::~MeasureObj_PlaceTP()
{
}

