package events;

import org.springframework.context.ApplicationEvent;

public class BigBangEvent {

	private String episode_number;


	public BigBangEvent( String episode_number)
	{

		this.episode_number=episode_number;
	}







	public String getEpisode_number() {
		return episode_number;
	}

	public void setEpisode_number(String episode_number) {
		this.episode_number = episode_number;
	}
}
