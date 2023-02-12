package Configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SProgram {
	
    @Bean
    public List<Car> cars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("red"));
        cars.add(new Car("blue"));
        cars.add(new Car("green"));
        return cars;
    }

    @Bean
    public Car blueCar(List<Car> cars) {
        return cars.stream()
                .filter(car -> car.getColor().equals("blue"))
                .findFirst()
                .orElse(null);
    }
}
