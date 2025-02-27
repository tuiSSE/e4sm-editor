/************************************************************

	Transition_Canny__ready.cpp  -  generated by CodeGenerator r$Rev$

************************************************************/

#include "Transition_Canny__ready.h"

#include "MeasureObj_Execution__thread__pool__in__use.h"

Transition_Canny__ready::Transition_Canny__ready(int uniqueid, const char* name, NetClass* net, PlaceIdentMap places, string pagePath, double firingWeight, int priority, bool exp, bool takeFirst, bool isInfinite, bool hasLocalGuard) :
	Transition(uniqueid, name, net, places, pagePath, firingWeight, priority, exp, takeFirst, isInfinite, hasLocalGuard)
,
	pool_Place ( *(net->getPlace( &places, "Execution_thread_pool"))),
	x_Place ( *(net->getPlace( &places, "Canny_in_1"))),
	nona1_Place ( *(net->getPlace( &places, "Canny_main")))
{
}

Transition_Canny__ready::~Transition_Canny__ready()
{
}

bool Transition_Canny__ready::globalGuard()
{
	return true;
}
void Transition_Canny__ready::initGlobalGuards()
{
}

void Transition_Canny__ready::moveTokens(TokenList &binding)
{
	TokenList::iterator binding_it = binding.begin();

	SMARTPTR(Token_int) token_pool = UPCAST_MACRO(Token_int)(*binding_it ++);
	pool_Place.removeToken(token_pool);
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

TempBindingList* Transition_Canny__ready::generateBindingList()
{
	TokenList* tok;
	TempBindingList* tempBindings =  new TempBindingList();

	const TokenList &pool_tokenList = getPlaceMarking(pool_Place);
	TokenList::const_iterator pool_iterator;
	const TokenList &x_tokenList = getPlaceMarking(x_Place);
	TokenList::const_iterator x_iterator;

	for (pool_iterator=pool_tokenList.begin(); pool_iterator!=pool_tokenList.end(); ++pool_iterator) {
		for (x_iterator=x_tokenList.begin(); x_iterator!=x_tokenList.end(); ++x_iterator) {
			SMARTPTR(Token_int) token_pool = UPCAST_MACRO(Token_int)(*pool_iterator);
			SMARTPTR(Token_Data) token_x = UPCAST_MACRO(Token_Data)(*x_iterator);
			
			// Check nulls 
			if (token_pool == 0) {
				continue;
			}
			if (token_x == 0) {
				continue;
			}
			
			{
				
				// Check nulls 
				
			}

			// All local guards passed:
			tok = new TokenList();
			tok->push_back(UPCAST_MACRO(Token_int)(*pool_iterator));
			tok->push_back(UPCAST_MACRO(Token_Data)(*x_iterator));
			tempBindings->push_back(tok);
			return tempBindings;
		}
	}
	return tempBindings;
}

void Transition_Canny__ready::log(TokenList &binding)
{
}

double Transition_Canny__ready::display(TokenList &binding)
{
	return 0.0;
}

Seconds_T Transition_Canny__ready::getFiringDelay(TokenList &binding) const
{
	return Transition::getFiringDelay(binding);
}

bool Transition_Canny__ready::hasTimeguard() const
{
	return false;
}

Seconds_T Transition_Canny__ready::Timeguard(const DateTime& now)
{
	return 0.0;
}

