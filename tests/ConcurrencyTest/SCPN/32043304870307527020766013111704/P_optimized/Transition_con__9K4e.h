/************************************************************

	Transition_con__9K4e.h  -  generated by CodeGenerator r$Rev$

************************************************************/

#ifndef TRANSITION_con__9K4e_H_FILE
#define TRANSITION_con__9K4e_H_FILE

#include "MSVCC.h"
#include "Transition.h"
#include "Token_Data.h"
#include "Token_int.h"


class Transition_con__9K4e : public Transition {
public:
	Transition_con__9K4e(int uniqueid, const char* name, NetClass* net, PlaceIdentMap places, string pagePath="", double firingWeight=0, int priority=0, bool exp=true, bool takeFirst=false, bool hasLocalGuard=false, bool isInfinite=false);
	~Transition_con__9K4e();
protected:
	//ingoing places for this transition
	Place& x_Place;

	//outgoing places for this transition
	Place& nona1_Place;

	void initGlobalGuards();
	bool globalGuard();
	void moveTokens(TokenList &binding);
	TempBindingList* generateBindingList();
	bool hasTimeguard() const;
	Seconds_T Timeguard(const DateTime& now);
	Seconds_T getFiringDelay(TokenList &binding) const;
	double display(TokenList &binding);
	void log(TokenList &binding);
};

#endif