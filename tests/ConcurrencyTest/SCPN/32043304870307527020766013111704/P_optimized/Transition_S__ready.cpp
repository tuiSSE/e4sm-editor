/************************************************************

	Transition_S__ready.cpp  -  generated by CodeGenerator r$Rev$

************************************************************/

#include "Transition_S__ready.h"

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

Transition_S__ready::Transition_S__ready(int uniqueid, const char* name, NetClass* net, PlaceIdentMap places, string pagePath, double firingWeight, int priority, bool exp, bool takeFirst, bool isInfinite, bool hasLocalGuard) :
	Transition(uniqueid, name, net, places, pagePath, firingWeight, priority, exp, takeFirst, isInfinite, hasLocalGuard)
,
	pool_Place ( *(net->getPlace( &places, "P_thread_pool"))),
	nona1_Place ( *(net->getPlace( &places, "S_executed")))
{
}

Transition_S__ready::~Transition_S__ready()
{
}

bool Transition_S__ready::globalGuard()
{
	return true;
}
void Transition_S__ready::initGlobalGuards()
{
}

void Transition_S__ready::moveTokens(TokenList &binding)
{
	TokenList::iterator binding_it = binding.begin();

	SMARTPTR(Token_int) token_pool = UPCAST_MACRO(Token_int)(*binding_it ++);
	pool_Place.removeToken(token_pool);

	{
		// Handle token 1 of 1

		// Generate Token: {}
		{
			SMARTPTR(Token_Data) newToken_0 = NEW_MACRO(Token_Data, Token_Data());
			nona1_Place.addToken(newToken_0);
		}
	}
}

TempBindingList* Transition_S__ready::generateBindingList()
{
	TokenList* tok;
	TempBindingList* tempBindings =  new TempBindingList();

	const TokenList &pool_tokenList = getPlaceMarking(pool_Place);
	TokenList::const_iterator pool_iterator;

	for (pool_iterator=pool_tokenList.begin(); pool_iterator!=pool_tokenList.end(); ++pool_iterator) {
		SMARTPTR(Token_int) token_pool = UPCAST_MACRO(Token_int)(*pool_iterator);
		
		// Check nulls 
		if (token_pool == 0) {
			continue;
		}
		
		{
			
			// Check nulls 
			
		}

		// All local guards passed:
		tok = new TokenList();
		tok->push_back(UPCAST_MACRO(Token_int)(*pool_iterator));
		tempBindings->push_back(tok);
		return tempBindings;
	}
	return tempBindings;
}

void Transition_S__ready::log(TokenList &binding)
{
}

double Transition_S__ready::display(TokenList &binding)
{
	return 0.0;
}

Seconds_T Transition_S__ready::getFiringDelay(TokenList &binding) const
{
	// Orig Expression: Exp(1.0)
	// C++  Expression: 1.0

	TokenList::iterator binding_it = binding.begin();

	SMARTPTR(Token_int) token_pool = UPCAST_MACRO(Token_int)(*binding_it ++);
	return delay.Exp(1.0);
}

bool Transition_S__ready::hasTimeguard() const
{
	return false;
}

Seconds_T Transition_S__ready::Timeguard(const DateTime& now)
{
	return 0.0;
}
