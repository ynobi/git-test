package com.nest.dock;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
	
	int rand = getRand();
	
	@GetMapping("/testdock")
	@ResponseBody
	public String doSomething() {
		System.out.println(">>>>  testdock-"+rand);
		return "YES-"+rand;
	}
	
	private static int getRand() {
		
		System.out.println("%%%%   in getRand");
		Random rand = new Random(); 
		  
        return rand.nextInt(1000); 
    
	}

}
