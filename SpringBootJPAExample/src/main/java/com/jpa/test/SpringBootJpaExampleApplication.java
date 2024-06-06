package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class SpringBootJpaExampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringBootJpaExampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		//User user = new User();
		//user.setName("Durgesh Kumar Tiwari");
		//user.setCity("Delhi");
		//user.setStatus("Java Developer");
		
		//User user1 = userRepository.save(user);
		
		//System.out.println(user1);
		
  		
        // Create Object of User
/*		User user1 = new User();
		user1.setName("Uttam");
		user1.setCity("City1");
		user1.setStatus("Python Programmer");
		
		User user2 = new User();
		user2.setName("Ankit");
		user2.setCity("City2");
		user2.setStatus("Java Programmer");
		
		// saving single user
		//User resultUser = userRepository.save(user2);
		//System.out.println("Saved User : "+resultUser);
		
		// saving multiple Objects
		List<User> users = List.of(user1,user2);  // List.of() Method present in java9
		Iterable<User> result = userRepository.saveAll(users);
		
		result.forEach(user->{
			System.out.println(user);
		});
		
		System.out.println("done"); */
		
		
		
		// Update    the user of id 53
	/*	Optional<User> optional = userRepository.findById(53);
		
		User user = optional.get();
		 user.setName("Ankit Tiwari");
		 User result = userRepository.save(user);
		
		System.out.println(result);   */
		
		// how to get the Data
		//findById(id) - return Optional Containing your data
		
	//	Iterable<User> itr = userRepository.findAll();
		// 1st way
	   /* Iterator<User> iterator = itr.iterator();
		
	    while (iterator.hasNext()) {
			User user = iterator.next();
			System.out.println(user);
		}*/
		
		// 2nd way
	/*	itr.forEach(new Consumer<User>() {

			@Override
			public void accept(User t) {
			System.out.println(t);	
				
			}
			
		}); */
		
		// 3rd way
	//	itr.forEach(user->System.out.println(user));
		
		
		// deleting the user element
		//userRepository.deleteById(52);
		//System.out.println("deleted");
		
	/*	Iterable<User> allusers = userRepository.findAll();
		
		allusers.forEach(user->System.out.println(user));
		
		userRepository.deleteAll(allusers);   */
		
		// Custom Finder Methods or Derived Query Methods
		
		//List<User> user = userRepository.findByName("Ankit");
		
		//user.forEach(x->System.out.println(x));
		
		//List<User> user2 = userRepository.findByNameAndCity("Uttam", "City1");
		//user2.forEach(e->System.out.println(e));
		
		//List<User> allUser = userRepository.getAllUser();
		//allUser.forEach(e->System.out.println(e));
		
		
		List<User> userByName = userRepository.getUserByName("Uttam","City1");
		userByName.forEach(e->System.out.println(e));
		
		System.out.println("-----------------------");
		
		userRepository.getUsers().forEach(e->System.out.println(e));
		
	}

}
