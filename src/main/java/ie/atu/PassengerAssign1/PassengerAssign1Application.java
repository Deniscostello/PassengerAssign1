package ie.atu.PassengerAssign1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@RequestMapping("api/passenger")
public class PassengerAssign1Application {

	public static void main(String[] args) {
		SpringApplication.run(PassengerAssign1Application.class, args);
	}

	@GetMapping
	public List<Passenger> getPassengers()
	{
		List<Passenger> myPassengers = List.of(
				new Passenger("Mr", "Paul", "12345678901", "09871234", 23),
				new Passenger("Mr", "Paul2", "1230987632", "08712321", 93),
				new Passenger("Mr", "Paul3", "129988776532", "09212343", 53));
		return myPassengers;
	}

	@GetMapping("/{passengerID}")
	public Passenger getPassenger(@PathVariable String passengerID) {
		Passenger myPassenger = new Passenger("Mr", "Denis", "12332145", "09875323", 24);
		return myPassenger;
	}

}
