package com.prominent.restservice;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prominent.dto.EmployeeMaster;
import com.prominent.service.ProminentService;

@RestController
@RequestMapping("/prominent")
public class ProminentRestController {
	
	@Autowired
	ProminentService proService;
	
	
	
	//Save  JSON  data
	@GetMapping(value="/save")
	public String saveJsonData() {
		String fileName = "Bath&Bristol_Sample.json";
        ClassLoader classLoader = getClass().getClassLoader();
 
        File file = new File(classLoader.getResource(fileName).getFile());
		EmployeeMaster mainData = null;
		ObjectMapper mapper = new ObjectMapper();
	      try
	      {
	    	  mainData =  mapper.readValue(file, EmployeeMaster.class);
	    	  proService.saveData(mainData);
	    	  return "Sucessfully insert JSON data to MySql Database";
	      } catch (Exception e)
	      {
	         e.printStackTrace();
	         return e.getMessage();
	      } 
		
		
		
		
	}

}
