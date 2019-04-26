package com.strands.interviews.eventsystem;

public class NewEvent implements InterviewEvent {
	private Object source;
	
	public NewEvent(Object source) {
		this.source = source;
	}
	
	@Override
	public Object getSource() {
		// TODO Auto-generated method stub
		return null;
	}
}
