package com.meleemistress.smc.core;

public class AppClass {

	private final AppClassContext _fsm;
	
	public AppClass() {
		//instantiate FSM
		
		_fsm = new AppClassContext(this);
	}
	
	
	//only do this once
	public void startWorking() {
		_fsm.enterStartState();
		return;
	}
	
}
