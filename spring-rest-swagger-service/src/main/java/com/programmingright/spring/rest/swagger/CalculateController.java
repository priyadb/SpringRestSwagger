package com.programmingright.spring.rest.swagger;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

    @RequestMapping(value="/calculate",method=RequestMethod.GET)
    public Calculate calculate(@RequestParam long input1, @RequestParam long input2, @RequestParam String operation) {
        if(StringUtils.isEmpty(operation)){
        	operation = "add";       	
        }   	 
        if(operation.equals("add")){
        	return new Calculate(operation,input1+input2);
        }else if(operation.equals("subtract")){
        	return new Calculate(operation,input1-input2);
        }else if(operation.equals("multiply")){
        	return new Calculate(operation,input1*input2);
        }else if(operation.equals("divide")){
        	return new Calculate(operation,input1/input2);
        }
       return new Calculate("Invalid operation",0);
    }
}