/************************************************************

	Transition_Binary__execution.cpp  -  generated by CodeGenerator r$Rev$

************************************************************/

#include "Transition_Binary__execution.h"

#include "MeasureObj_C1__in__use.h"
#include "MeasureObj_Binary__accuracy.h"
#include "MeasureObj_Binary__specificity.h"
#include "MeasureObj_Binary__recall.h"
#include "MeasureObj_Binary__precision.h"
#include "MeasureObj_Binary__f1Score.h"
#include "MeasureObj_fsdf.h"
#include "MeasureObj_PlaceTP.h"

Transition_Binary__execution::Transition_Binary__execution(int uniqueid, const char* name, NetClass* net, PlaceIdentMap places, string pagePath, double firingWeight, int priority, bool exp, bool takeFirst, bool isInfinite, bool hasLocalGuard) :
	Transition(uniqueid, name, net, places, pagePath, firingWeight, priority, exp, takeFirst, isInfinite, hasLocalGuard)
,
	x_Place ( *(net->getPlace( &places, "Binary_main"))),
	nona1_Place ( *(net->getPlace( &places, "Binary_executed"))),
	nona2_Place ( *(net->getPlace( &places, "Binary_in_data")))
{
}

Transition_Binary__execution::~Transition_Binary__execution()
{
}

bool Transition_Binary__execution::globalGuard()
{
	return true;
}
void Transition_Binary__execution::initGlobalGuards()
{
}

void Transition_Binary__execution::moveTokens(TokenList &binding)
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

		// Copying Token: 1'copy x
		{
			SMARTPTR(Token_Data) copy = NEW_MACRO(Token_Data, Token_Data(*(token_x),false));
			nona2_Place.addToken(copy);
		}
	}
}

TempBindingList* Transition_Binary__execution::generateBindingList()
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

void Transition_Binary__execution::log(TokenList &binding)
{
}

double Transition_Binary__execution::display(TokenList &binding)
{
	return 0.0;
}

Seconds_T Transition_Binary__execution::getFiringDelay(TokenList &binding) const
{
	// Orig Expression: Exp(1.0)
	// C++  Expression: 1.0

	TokenList::iterator binding_it = binding.begin();

	SMARTPTR(Token_Data) token_x = UPCAST_MACRO(Token_Data)(*binding_it ++);
	return delay.Exp(1.0);
}

bool Transition_Binary__execution::hasTimeguard() const
{
	return false;
}

Seconds_T Transition_Binary__execution::Timeguard(const DateTime& now)
{
	return 0.0;
}
