import config.configurations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import publisher.MyEventPublisher;

public class Main {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(configurations.class);
		context.start();
		MyEventPublisher publisher=context.getBean("myEventPublisher" , MyEventPublisher.class);
		publisher.stream_bigbang_event("87");
		context.stop();
		context.close();



	}



}
