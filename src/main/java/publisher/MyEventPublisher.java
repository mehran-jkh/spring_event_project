package publisher;


import events.BigBangEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublisher  {

	@Autowired
	ApplicationEventPublisher applicationEventPublisher;

	public void stream_bigbang_event(String episode_number)
	{
		applicationEventPublisher.publishEvent(new BigBangEvent(this , episode_number));
	}

}
