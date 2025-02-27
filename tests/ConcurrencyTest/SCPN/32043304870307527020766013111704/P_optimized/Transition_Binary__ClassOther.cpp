/************************************************************

	Transition_Binary__ClassOther.cpp  -  generated by CodeGenerator r$Rev$

************************************************************/

#include "Transition_Binary__ClassOther.h"

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

Transition_Binary__ClassOther::Transition_Binary__ClassOther(int uniqueid, const char* name, NetClass* net, PlaceIdentMap places, string pagePath, double firingWeight, int priority, bool exp, bool takeFirst, bool isInfinite, bool hasLocalGuard) :
	Transition(uniqueid, name, net, places, pagePath, firingWeight, priority, exp, takeFirst, isInfinite, hasLocalGuard)
,
	x_Place ( *(net->getPlace( &places, "Binary_data_gen"))),
	nona1_Place ( *(net->getPlace( &places, "Binary_cf")))
{
}

Transition_Binary__ClassOther::~Transition_Binary__ClassOther()
{
}

bool Transition_Binary__ClassOther::globalGuard()
{
	return true;
}
void Transition_Binary__ClassOther::initGlobalGuards()
{
}

void Transition_Binary__ClassOther::moveTokens(TokenList &binding)
{
	TokenList::iterator binding_it = binding.begin();

	SMARTPTR(Token_Data) token_x = UPCAST_MACRO(Token_Data)(*binding_it ++);
	x_Place.removeToken(token_x);

	{
		// Handle token 1 of 1

		// Transfering Token: 1'x(tL=2.0)
		{
			long newValue_0;
			{
				// Orig Expression: 
				// C++  Expression: 2.0

				newValue_0 = (long)(2.0);
			}
			token_x->set_tL(newValue_0);
			nona1_Place.addToken(token_x);
		}
	}
}

TempBindingList* Transition_Binary__ClassOther::generateBindingList()
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

void Transition_Binary__ClassOther::log(TokenList &binding)
{
}

double Transition_Binary__ClassOther::display(TokenList &binding)
{
	return 0.0;
}

Seconds_T Transition_Binary__ClassOther::getFiringDelay(TokenList &binding) const
{
	return Transition::getFiringDelay(binding);
}

bool Transition_Binary__ClassOther::hasTimeguard() const
{
	return false;
}

Seconds_T Transition_Binary__ClassOther::Timeguard(const DateTime& now)
{
	return 0.0;
}

