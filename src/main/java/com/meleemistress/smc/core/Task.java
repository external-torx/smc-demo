package com.meleemistress.smc.core;

public final class Task implements TaskEventListener, TimerEventListener {

	
	private final TaskFSM _fsm;
	public Task() {
		_fsm = new TaskFSM(this);
	}
	
	public void startFSM() {
		_fsm.enterStartState();
		TaskManager.addListener(this);
	}
	
	public void start(long timeSlice) {
		_fsm.Start(timeSlice);
	}
	
	public void suspend() {
		_fsm.Suspend();
	}
	
	public void block() {
		_fsm.Block();
	}
	
	public void unblock() {
		_fsm.Unblock();
	}
	
	public void stop() {
		_fsm.Stop();
	}
	
	public void delete() {
		_fsm.Delete();
	}
	
	
	public void handleTimeout(TimerEvent event) {
		_fsm.Suspend();
	}
	
	//----------- STATE MACHINE ACTIONS----------
	void continueTask() {
		return;
	}
	
	void suspendTask() {
		return;
	}
	
	void startSliceTimer(long timeslice) {
		return;
	}
	
	void stopSliceTimer() {
		return;
	}
	
	void releaseResources() {
		return;
	}

	
	void blockTask() {
		return;
	}
	
	void stopTask() {
		return;
	}
}
