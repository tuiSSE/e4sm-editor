/************************************************************

	Transition_con__9K4e.cpp  -  generated by CodeGenerator r$Rev$

************************************************************/

#include "Transition_con__9K4e.h"

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

Transition_con__9K4e::Transition_con__9K4e(int uniqueid, const char* name, NetClass* net, PlaceIdentMap places, string pagePath, double firingWeight, int priority, bool exp, bool takeFirst, bool isInfinite, bool hasLocalGuard) :
	Transition(uniqueid, name, net, places, pagePath, firingWeight, priority, exp, takeFirst, isInfinite, hasLocalGuard)
,
	x_Place ( *(net->getPlace( &places, "P_out1"))),
	nona1_Place ( *(net->getPlace( &places, "Act1_in_1")))
{
}

Transition_con__9K4e::~Transition_con__9K4e()
{
}

bool Transition_con__9K4e::globalGuard()
{
	return true;
}
void Transition_con__9K4e::initGlobalGuards()
{
}

void Transition_con__9K4e::moveTokens(TokenList &binding)
{
	TokenList::iterator binding_it = binding.begin();

	SMARTPTR(Token_Data) token_x = UPCAST_MACRO(Token_Data)(*binding_it ++);
	x_Place.removeToken(token_x);

	{
		// Handle token 1 of 1

		// Transfering Token: 1'x
		{
			nona1_Place.addToken(token_x);
		}
	}
}

TempBindingList* Transition_con__9K4e::generateBindingList()
{
	TokenList* tok;
	TempBindingList* tempBindings =  new TempBindingList();

	const TokenList &x_tokenList = getPlaceMarking(x_Place);
	TokenList::const_iterator x_iterator;

	for (x_iterator=x_tokenList.begin(); x_iterator!=x_tokenList.end(); ++x_iterator) {
		SMARTPTR(Token_Data) token_x = UPCAST_MACRO(Token_Data)(*x_iterator);
		
		// Check nulls 
		if (token_x == 0) {
			continue;
		}
		
		{
			
			// Check nulls 
			
		}

		// All local guards passed:
		tok = new TokenList();
		tok->push_back(UPCAST_MACRO(Token_Data)(*x_iterator));
		tempBindings->push_back(tok);
		return tempBindings;
	}
	return tempBindings;
}

void Transition_con__9K4e::log(TokenList &binding)
{
}

double Transition_con__9K4e::display(TokenList &binding)
{
	return 0.0;
}

Seconds_T Transition_con__9K4e::getFiringDelay(TokenList &binding) const
{
	// Orig Expression: Exp(1.0)
	// C++  Expression: 1.0

	TokenList::iterator binding_it = binding.begin();

	SMARTPTR(Token_Data) token_x = UPCAST_MACRO(Token_Data)(*binding_it ++);
	return delay.Exp(1.0);
}

bool Transition_con__9K4e::hasTimeguard() const
{
	return false;
}

Seconds_T Transition_con__9K4e::Timeguard(const DateTime& now)
{
	return 0.0;
}
