import config.configurations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import publisher.MyEventPublisher;

public class Main {

	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(configurations.class);
		MyEventPublisher publisher=context.getBean("myEventPublisher" , MyEventPublisher.class);
		publisher.stream_bigbang_event("87");

	}



}
