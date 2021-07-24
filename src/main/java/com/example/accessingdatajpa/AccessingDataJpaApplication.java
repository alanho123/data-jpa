package com.example.accessingdatajpa;

import com.example.accessingdatajpa.model.Address;
import com.example.accessingdatajpa.model.User;
import com.example.accessingdatajpa.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@Slf4j
public class AccessingDataJpaApplication {

//	private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

	public AccessingDataJpaApplication(MealRepository mealRepository, Meal2In1Repository meal2In1Repository, UserRepository userRepository) {
		this.mealRepository = mealRepository;
		this.meal2In1Repository = meal2In1Repository;
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataJpaApplication.class);
	}

	private final MealRepository mealRepository;
	private final Meal2In1Repository meal2In1Repository;
	private final UserRepository userRepository;

	@Bean
	public CommandLineRunner test() {
		return (args) -> {
			// Cleanup database tables.
//			userRepository.deleteAll();
//
//			// Insert a user with multiple phone numbers and addresses.
//			Set<String> phoneNumbers = new HashSet<>();
//			phoneNumbers.add("+91-9999999999");
//			phoneNumbers.add("+91-9898989898");
//
//			Set<Address> addresses = new HashSet<>();
//			addresses.add(new Address("747", "Golf View Road", "Bangalore",
//					"Karnataka", "India", "560008"));
//			addresses.add(new Address("Plot No 44", "Electronic City", "Bangalore",
//					"Karnataka", "India", "560001"));
//
//			User user = new User("Rajeev Kumar Singh", "rajeev@callicoder.com",
//					phoneNumbers, addresses);
//
//			userRepository.save(user);

			for (User user : userRepository.findAll()) {
				log.info(" user tentno - {}", user.getTentno());
				for (Address address : user.getAddresses()) {
					log.info(" address tent name- {}", address.getTentName());
				}
			}
		};
	}

//	@Bean
//	public CommandLineRunner test() {
//		return (args) -> {
//			log.info("###### 2 tables join test");
//
////			for (Meal meal : mealRepository.findAll()) {
////				log.info("meal id - {}, tentname - {}", meal.getId(), meal.getAllergens().getTentName());
////			}
//
//			for(Meal2In1 meal2In1 : meal2In1Repository.findAll()) {
//				log.info("meal2In1 id - {}, size - {}", meal2In1.getId(), meal2In1.getEmbeddableAllergens().size());
//			}
//		};
//	}

//	@Bean
//	public CommandLineRunner demo(CustomerRepository repository) {
//		return (args) -> {
//			// save a few customers
//			repository.save(new Customer("Jack", "Bauer"));
//			repository.save(new Customer("Chloe", "O'Brian"));
//			repository.save(new Customer("Kim", "Bauer"));
//			repository.save(new Customer("David", "Palmer"));
//			repository.save(new Customer("Michelle", "Dessler"));
//
//			// fetch all customers
//			log.info("Customers found with findAll():");
//			log.info("-------------------------------");
//			for (Customer customer : repository.findAll()) {
//				log.info(customer.toString());
//			}
//			log.info("");
//
//			// fetch an individual customer by ID
//			Customer customer = repository.findById(3L);
//			log.info("Customer found with findById(3L):");
//			log.info("--------------------------------");
//			log.info(customer.toString());
//			log.info("");
//
//			// fetch customers by last name
//			log.info("Customer found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			repository.findByLastName("Bauer").forEach(bauer -> {
//				log.info(bauer.toString());
//			});
//			// for (Customer bauer : repository.findByLastName("Bauer")) {
//			// 	log.info(bauer.toString());
//			// }
//			log.info("###### run...");
//		};
//	}

}
