/************************************************************

	Transition_P__ready.cpp  -  generated by CodeGenerator r$Rev$

************************************************************/

#include "Transition_P__ready.h"

#include "MeasureObj_C1__in__use.h"
#include "MeasureObj_Binary__accuracy.h"
#include "MeasureObj_Binary__specificity.h"
#include "MeasureObj_Binary__recall.h"
#include "MeasureObj_Binary__precision.h"
#include "MeasureObj_Binary__f1Score.h"
#include "MeasureObj_fsdf.h"
#include "MeasureObj_PlaceTP.h"

Transition_P__ready::Transition_P__ready(int uniqueid, const char* name, NetClass* net, PlaceIdentMap places, string pagePath, double firingWeight, int priority, bool exp, bool takeFirst, bool isInfinite, bool hasLocalGuard) :
	Transition(uniqueid, name, net, places, pagePath, firingWeight, priority, exp, takeFirst, isInfinite, hasLocalGuard)
,
	x_Place ( *(net->getPlace( &places, "P_in_1"))),
	y_Place ( *(net->getPlace( &places, "P_in_2"))),
	nona1_Place ( *(net->getPlace( &places, "P_main")))
{
}

Transition_P__ready::~Transition_P__ready()
{
}

bool Transition_P__ready::globalGuard()
{
	return true;
}
void Transition_P__ready::initGlobalGuards()
{
}

void Transition_P__ready::moveTokens(TokenList &binding)
{
	TokenList::iterator binding_it = binding.begin();

	SMARTPTR(Token_Data) token_x = UPCAST_MACRO(Token_Data)(*binding_it ++);
	x_Place.removeToken(token_x);
	SMARTPTR(Token_Data) token_y = UPCAST_MACRO(Token_Data)(*binding_it ++);
	y_Place.removeToken(token_y);

	{
		// Handle token 1 of 1

		// Transfering Token: 1'x
		{
			nona1_Place.addToken(token_x);
		}
	}
}

TempBindingList* Transition_P__ready::generateBindingList()
{
	TokenList* tok;
	TempBindingList* tempBindings =  new TempBindingList();

	const TokenList &x_tokenList = getPlaceMarking(x_Place);
	TokenList::const_iterator x_iterator;
	const TokenList &y_tokenList = getPlaceMarking(y_Place);
	TokenList::const_iterator y_iterator;

	for (x_iterator=x_tokenList.begin(); x_iterator!=x_tokenList.end(); ++x_iterator) {
		for (y_iterator=y_tokenList.begin(); y_iterator!=y_tokenList.end(); ++y_iterator) {
			SMARTPTR(Token_Data) token_x = UPCAST_MACRO(Token_Data)(*x_iterator);
			SMARTPTR(Token_Data) token_y = UPCAST_MACRO(Token_Data)(*y_iterator);
			
			// Check nulls 
			if (token_x == 0) {
				continue;
			}
			if (token_y == 0) {
				continue;
			}
			
			{
				
				// Check nulls 
				
			}

			// All local guards passed:
			tok = new TokenList();
			tok->push_back(UPCAST_MACRO(Token_Data)(*x_iterator));
			tok->push_back(UPCAST_MACRO(Token_Data)(*y_iterator));
			tempBindings->push_back(tok);
			return tempBindings;
		}
	}
	return tempBindings;
}

void Transition_P__ready::log(TokenList &binding)
{
}

double Transition_P__ready::display(TokenList &binding)
{
	return 0.0;
}

Seconds_T Transition_P__ready::getFiringDelay(TokenList &binding) const
{
	return Transition::getFiringDelay(binding);
}

bool Transition_P__ready::hasTimeguard() const
{
	return false;
}

Seconds_T Transition_P__ready::Timeguard(const DateTime& now)
{
	return 0.0;
}
