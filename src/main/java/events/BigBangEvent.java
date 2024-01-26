package events;

import org.springframework.context.ApplicationEvent;

public class BigBangEvent extends ApplicationEvent {

	private String episode_number;

	public BigBangEvent(Object source)
	{
		super(source);
	}

	public BigBangEvent(Object source , String episode_number)
	{
		super(source);
		this.episode_number=episode_number;
	}







	public String getEpisode_number() {
		return episode_number;
	}

	public void setEpisode_number(String episode_number) {
		this.episode_number = episode_number;
	}
}
