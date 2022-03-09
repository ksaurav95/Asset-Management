package com.db.awmd.challenge.event;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class GenericEvent<Payload> extends ApplicationEvent {

	public GenericEvent(Payload payload) {
		super(payload);
	}

	@SuppressWarnings("unchecked")
	public Payload payload() {
		//noinspection unchecked
		return (Payload) getSource();
	}
}
