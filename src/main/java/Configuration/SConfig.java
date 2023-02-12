package Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import springExercise.sBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class SConfig {

	@Primary
	@Bean
	public sBean sBean1() {
		return new sBean();
	}
	@Bean
	public sBean sBean2() {
		return new sBean();
	}
}
