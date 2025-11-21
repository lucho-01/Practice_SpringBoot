package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.infrastructure.adapter.in.clients.PilarClient;

@SpringBootApplication
public class Application {

	@Autowired
	private PilarClient pilarClient;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		}
	public void run(String... args) throws Exception {
        
        pilarClient.session();

}
}