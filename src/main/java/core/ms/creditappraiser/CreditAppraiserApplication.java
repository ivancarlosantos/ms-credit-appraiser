package core.ms.creditappraiser;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;

@Slf4j
@SpringBootApplication
public class CreditAppraiserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditAppraiserApplication.class, args);
		log.info("Application UP ["+ HttpStatus.OK+"]");
	}
}
