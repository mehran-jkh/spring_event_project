package listener;

import events.BigBangEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MehranListener implements ApplicationListener<BigBangEvent> {
	@Override
	public void onApplicationEvent(BigBangEvent event) {
		System.out.println("mehran see the episode number "+event.getEpisode_number()+" !!!");
	}
}
