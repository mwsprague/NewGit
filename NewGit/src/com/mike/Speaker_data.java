package com.mike;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Speaker_data {
	
	public void readJson() throws IOException
	{
	
	   byte[] jsonData = Files.readAllBytes(Paths.get("speakers_12_all.json"));
	   
	   ObjectMapper objectMapper = new ObjectMapper();
	   
	  //convert json string to object
	  //Speaker speaker = objectMapper.readValue(jsonData, Speaker.class);
	  Speaker speaker[] = objectMapper.readValue(jsonData, Speaker[].class);
	  
	  System.out.println("Speaker Name: " + speaker[0].getDriver_model());
	  System.out.println("Speaker Name: " + speaker[1].getDriver_model());
	
	}

}
