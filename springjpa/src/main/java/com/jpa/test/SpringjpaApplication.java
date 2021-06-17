package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class SpringjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringjpaApplication.class, args);
		UserRepository bean = context.getBean(UserRepository.class);
		
		          //saving single User to database
		
//		User user=new User();
//		user.setName("Dhiraj  Maurya");
//		user.setCity("Greater");
//		user.setStatus("java Developer");
//	    User user2 = bean.save(user);   // saving single User to database
//    	System.out.println(user2);
	
		
//	User user2=new User();
//	user2.setName("Amar ");
//	user2.setCity("Greater Noida");
//	user2.setStatus("Senior Developer");
//	
//	User user3=new User();
//	user3.setName("Amar ");
//	user3.setCity("Greater Noida");
//	user3.setStatus("Senior Developer");
//	
//                      	//Saving multiple user
		
//	List<User> of = List.of(user2,user3);
//	Iterable<User> saveAll = bean.saveAll(of);    //saving multiple User to database
//	saveAll.forEach(user->{
//		System.out.println(user);
//	});
//	}
	
	                   //Update user byId
//	try {
//	Optional<User> findById = bean.findById(10);
//	User user = findById.get();
//	//System.out.println(user);
//	user.setName("Chandan");
//	user.setCity("Bhatni");
//	user.setStatus("PHP Developer");
//	User save = bean.save(user);
//	System.out.println(save);
//	}catch(Exception e) {
//		System.out.println(e);
//	}
		            //Find all data
		
//		Iterable<User> findAll = bean.findAll();
//		Iterator<User> iterator = findAll.iterator();
//	//1to print 	
////		while (iterator.hasNext()) {
////			User user=iterator.next();
////			System.out.println(user);
//		//2to print 
//		iterator.forEachRemaining( new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//			
//		});
//		//3to print 
//		iterator.forEachRemaining(user->System.out.println(user));
		
						//	***delete data from data base****
		
//		bean.deleteById(3);
//		System.out.println("deleted");
		
				//		***delete all data from data base****
//		Iterable<User> findAll = bean.findAll();
//		findAll.forEach(user->System.out.println(user));
//		bean.deleteAll(findAll);
		
//		List<User> findByName = bean.findByName("Chandan");
//		findByName.forEach(user->System.out.println(user));
		
//		List<User> findByName = bean.findByNameAndCity( "Dhiraj",	"Greater");
//		findByName.forEach(user->System.out.println(user));
		
		List<User> getAllUser = bean.getAllUser();
		
		getAllUser.forEach(user->System.out.println(user));
		System.out.println("-------------------------------------------");
		List<User> userByName = bean.getUserByName("Chandan","Bhatni");
		
		userByName.forEach(user->System.out.println(user));
		System.out.println("-------------------------------------------");
		bean.getUser().forEach(user->System.out.println(user));
	}
}
