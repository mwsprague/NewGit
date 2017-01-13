package com.mike;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Speaker_data {
	
	Speaker speakers[];
	
	public void readJson() throws IOException
	{
	
	   byte[] jsonData = Files.readAllBytes(Paths.get("speakers_12_all.json"));
	   
	   ObjectMapper objectMapper = new ObjectMapper();
	   
	  //convert json string to object
	  //Speaker speaker = objectMapper.readValue(jsonData, Speaker.class);
	  speakers = objectMapper.readValue(jsonData, Speaker[].class);
	  
	  for(Speaker s:speakers)
	  {
	     System.out.println("Speaker Name: " + s.getDriver_model());	  
	  }
	
	}
	
	public Speaker[] getSpeakers()
	{
		return speakers;
	}

	public void findSimilar(Speaker ref, float distance)
	{
		float current_distance = 0.0f;
		int i = 0;  // keep track of which speakers match
		
	    float ref_Fs = ref.getDriver_Fs();
	    float ref_Re = ref.getDriver_Re();
	    float ref_Qes= ref.getDriver_Qes();
	    float ref_Qms = ref.getDriver_Qms();
	    float ref_Qts = ref.getDriver_Qts();
	    float ref_Vas = ref.getDriver_Vas();
	    
	    float driver_Fs = 0;
	    float driver_Re = 0;
	    float driver_Qes= 0;
	    float driver_Qms = 0;
	    float driver_Qts = 0;
	    float driver_Vas = 0;

	    float a, b, c, d, e, f;
		
		// calculate distance
		for(Speaker s:speakers)
		{
		    driver_Fs = s.getDriver_Fs();
		    driver_Re = s.getDriver_Re();
		    driver_Qes= s.getDriver_Qes();
		    driver_Qms = s.getDriver_Qms();
		    driver_Qts = s.getDriver_Qts();
		    driver_Vas = s.getDriver_Vas();
			a = (float) Math.pow((ref_Fs - driver_Fs), 2.0f);
			b = (float) Math.pow((ref_Re - driver_Re), 2.0f);
			c = (float) Math.pow((ref_Qes - driver_Qes), 2.0f);
			d = (float) Math.pow((ref_Qms - driver_Qms), 2.0f);
			e = (float) Math.pow((ref_Qts - driver_Qts), 2.0f);
			f = (float) Math.pow((ref_Vas - driver_Vas), 2.0f);
			
			current_distance = (float) Math.sqrt((double) a+b+c+d+e+f);
			System.out.println(ref.getDriver_model() + " compared to: " + s.getDriver_model() + " distance is: " + current_distance);

//			System.out.println("Distance = " + current_distance);
//
//			if(current_distance <= distance)
//			{
//				System.out.println(ref.getDriver_model() + " is similar to: " + s.getDriver_model());
//			}
			i++;
		}
		
	}
}
