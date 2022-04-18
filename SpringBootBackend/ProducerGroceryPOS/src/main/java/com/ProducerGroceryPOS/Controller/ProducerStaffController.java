package com.ProducerGroceryPOS.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ProducerGroceryPOS.Entity.ProducerGrocery;
import com.ProducerGroceryPOS.Service.ProducerStaffService;
import java.util.*;



@RestController
@RequestMapping("/api/customer")
@CrossOrigin("*")
public class ProducerStaffController {

	@Autowired
	private ProducerStaffService staffService;
	
	
		@PostMapping("/saveuser")
		public ResponseEntity<String> saveUser(@RequestBody ProducerGrocery producergrocery) throws Exception
	{
			
			long tempphnum=producergrocery.getPhnum();
			
			if(tempphnum != 0)
			{
				ProducerGrocery userDetails=staffService.fetchUserByPhnum(tempphnum);
				
				if(userDetails == null)
				{
					ProducerGrocery userdetails=staffService.saveUser(producergrocery);
					if(userdetails== null)
					{
						throw new Exception("Cannot Reach Database");
					}					
				}
				else
				{
					long newcount=producergrocery.getPurchasecount();
					newcount=newcount+1;
					producergrocery.setPurchasecount(newcount);
					
					int Userdetails=staffService.updatecount(newcount,tempphnum);
					
					return new ResponseEntity<>("Regular Customer",HttpStatus.OK);
				}
			}
			
			else
			{
			
				return new ResponseEntity<>("Phone Number Is Mandatory!!!",HttpStatus.OK);
				
			}
	
			return new ResponseEntity<>("Success!!!",HttpStatus.OK);
									
	}
		
		
		@GetMapping("/searchcustomers/{phnum}")
		public ResponseEntity<String> searchcustomers(@PathVariable(value= "phnum") String phnum) throws Exception
		{
			long ph=Long.parseLong(phnum);
			System.out.println(ph);
			ProducerGrocery userdetails=staffService.getuserByphnum(ph);
			String email=userdetails.getEmail();
			
			if(userdetails== null)
			{
				throw new Exception("User Cannot Found");
			}
				
			return new ResponseEntity<>(email,HttpStatus.OK);
			
		}
		
		
		@GetMapping("/viewcustomers")
		public ResponseEntity<List<ProducerGrocery>> viewCustomers() throws Exception
		{
			List<ProducerGrocery> userdetails=staffService.viewAllCustomers();
			
			if(userdetails == null)
			{
				throw new Exception("Database Access Failed!!!!!!");
			}
			
			return new ResponseEntity<>(userdetails,HttpStatus.OK);
		}
	
		@DeleteMapping("/deletecustomers/{phnum}")
		public ResponseEntity<Integer> deleteCustomers(@PathVariable(value= "phnum") long phnum) throws Exception
		{
			 Integer i=staffService.deleteuserByphnum(phnum);
			
			if(i == null)
			{
				throw new Exception("User Details Cannot Be Deleted");
			}
				
			return new ResponseEntity<>(i,HttpStatus.OK);
			
		}

		
		@PutMapping("/updatecustomers/{phnum}")
		public ResponseEntity<String> updatecustomersByPhnum(@PathVariable(value= "phnum") long phnum,@RequestBody ProducerGrocery producergrocery) throws Exception
		{
			String name=producergrocery.getName();
			long numofproducts=producergrocery.getNumOfProducts();
		
			int userdetails=staffService.updateuserByphnum(name,numofproducts,phnum);
			
			if(userdetails== 0)
			{
				throw new Exception("User Cannot Found");
			}
				
			return new ResponseEntity<>("Updated",HttpStatus.OK);
			
		}
		
		
		@PutMapping("/updatecustomer/{email}")
		public ResponseEntity<String> updatecustomersByEmail(@PathVariable(value= "email") String email,@RequestBody ProducerGrocery producergrocery) throws Exception
		{
			String name=producergrocery.getName();
			long numofproducts=producergrocery.getNumOfProducts();
			
			int userdetails=staffService.updateuserByEmail(name,numofproducts,email);
			
			System.out.println("Hello");
			
			
			if(userdetails== 0)
			{
				throw new Exception("User Cannot Found");
			}
				
			return new ResponseEntity<>("Updated",HttpStatus.OK);
			
		}
		
		
	
	
	
	
	
	
		//@RequestMapping(value="/saveuser", method= {RequestMethod.GET,RequestMethod.POST})
		//@RequestMapping(method = RequestMethod.POST, value = "/saveuser", produces = { MediaType.APPLICATION_JSON_VALUE})
		//@RequestMapping(value="/saveuser", method = RequestMethod.OPTIONS)

	
	
	
	
	
//	@GetMapping("/getid/{id}")
//	//@RequestMapping(value="/api/grocery/saveuser", method= {RequestMethod.POST,RequestMethod.GET})
//	public int findById(@PathVariable(value = "id") ProducerGrocery id) throws Exception
//	{
//		int userdetails= staffService.findById(id);
//		System.out.println("Hello");
//		int userid=id.getId();
//		System.out.println(userid);
//		
//		if(userdetails!=0)
//		{
//			throw new Exception("User Cannot Found");
//		}
//			
//		return 1 ;
		
//	}
	
//	@GetMapping("/saveuser/{id}")
//	public String saveUser(@PathVariable(value="id") long userid)
//	{
//		System.out.println("Hello");
		//String name=user.getName();
		//System.out.println(name);
			
//		return "hello";//staffService.saveUser(user);
//	}
	
//	@GetMapping("/customers")
//	public List<Object> getCustomers()
//	{
//		Object[] customers=restTemplate.getForObject("http://Grocery-Search/customers", Object[].class);
//		return Arrays.asList(customers);
//	}
		
		

//		@RequestMapping(value="/saveuser", method = RequestMethod.OPTIONS)
//		   ResponseEntity<?> collectionOptions() 
//		   {
//			 return ResponseEntity
//			          .ok()
//			          .allow(HttpMethod.GET,HttpMethod.GET, HttpMethod.OPTIONS)
//			              .build();
//		   }
		
		
		
//		@PutMapping("/updatecustomers/{phnum}")
//		public ResponseEntity<Integer> updatecustomers(@PathVariable(value= "phnum") long phnum,String name,int numOfProducts,ProducerGrocery producergrocery) throws Exception
//		{
//			
//			Integer userdetails=staffService.updateuserByphnum(name, numOfProducts);
//			System.out.println("Hello");
//			
//			if(userdetails== null)
//			{
//				throw new Exception("User Cannot Found");
//			}
//				
//			return new ResponseEntity<>(userdetails,HttpStatus.OK);
//			
//		}
		
//		@PutMapping("/updatecustomers/{phnum}")
//		public String updatecustomers(@PathVariable(value= "phnum") long phnum,@RequestBody ProducerGrocery producergrocery) throws Exception
//		{
//			int i=staffService.updateuserByphnum(phnum, name, numOfProducts);
//			System.out.println("Hello");
//			
//			if(i== 0)
//			{
//				throw new Exception("User Cannot Found");
//			}
//				
//			
//			
//		}
		
//		ProducerGrocery userdetails=staffService.saveUser(producergrocery);
//		System.out.println("Hello");
//		String name=producergrocery.getName();
//		System.out.println(name);
//		
//		if(userdetails== null)
//		{
//			throw new Exception("Cannot Reach Database");
//		}
//			
//		return new ResponseEntity<>(producergrocery,HttpStatus.OK);
		
}	
