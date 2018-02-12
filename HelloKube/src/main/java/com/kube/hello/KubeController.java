package com.kube.hello;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class KubeController {
	String a="";	
	@RequestMapping(path="/hello", method =RequestMethod.GET )
    public String cabRegister(){
		a = "Hello bangalore !!!"+"welcome to it world" ;
			return a;    	 
    }

}
