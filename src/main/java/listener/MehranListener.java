package listener;

import events.BigBangEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MehranListener  {
	@EventListener
	public void onApplicationEvent(BigBangEvent event) {
		System.out.println("mehran see the episode number "+event.getEpisode_number()+" !!!");
	}
}
