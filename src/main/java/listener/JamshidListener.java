package listener;

import events.BigBangEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class JamshidListener {
	@EventListener
	public void onApplicationEvent(BigBangEvent event) {
		System.out.println("jamshid see the episode number "+event.getEpisode_number()+" !!!");
	}
}
