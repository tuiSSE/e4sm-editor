/************************************************************

	MeasureObj_Binary__precision.cpp  -  generated by CodeGenerator r$Rev$

************************************************************/

#include "Token_int.h"
#include "Token_bool.h"
#include "Token_real.h"
#include "Token_string.h"
#include "Token_DateTime.h"
#include "Token_Data.h"
#include "MeasureObj_C1__in__use.h"
#include "MeasureObj_AReady.h"
#include "MeasureObj_Act1Ready.h"
#include "MeasureObj_Act2Ready.h"
#include "MeasureObj_A3Ready.h"
#include "MeasureObj_Binary__accuracy.h"
#include "MeasureObj_Binary__specificity.h"
#include "MeasureObj_Binary__recall.h"
#include "MeasureObj_Binary__precision.h"
#include "MeasureObj_Binary__f1Score.h"

MeasureObj_Binary__precision* measure_Binary__precision;

MeasureObj_Binary__precision::MeasureObj_Binary__precision(NetClass* net) : MeasureObj("Binary_precision", net, false)
{
}

double MeasureObj_Binary__precision::measure(double dt=-1)
{
	// Orig Expression: #Binary_tp / (0.00000001 + #Binary_tp + #Binary_fp)
	// C++  Expression: #P000061/ ( 1.0E-8+#P000062+#P000063 ) 
	Place *P000061 = net->getPlace("Binary_tp");
	Place *P000062 = net->getPlace("Binary_tp");
	Place *P000063 = net->getPlace("Binary_fp");

	double rate = (P000061->getMarkingSize()/ ( 1.0E-8+P000062->getMarkingSize()+P000063->getMarkingSize() ) );

	return rate;
}

void MeasureObj_Binary__precision::accum(const Binding *binding, double weight) {}
MeasureObj_Binary__precision::~MeasureObj_Binary__precision()
{
}

