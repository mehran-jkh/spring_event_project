package listener;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class FrameworkEventsListener {

	@EventListener
	public void handle_context_started_event(ContextStartedEvent event)
	{
		System.out.println("application context initialized with start() method...");
		System.out.println(event);
	}


	@EventListener
	public void handle_context_stopped_event(ContextStoppedEvent event)
	{
		System.out.println("application context stopped with stop() method...");
		System.out.println(event);
	}

	@EventListener
	public void handle_context_closed_event(ContextStoppedEvent event)
	{
		System.out.println("application context closed with close() method...");
		System.out.println(event);
	}


}
