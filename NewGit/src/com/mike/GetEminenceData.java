package com.mike;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetEminenceData {
	
	public void get12DriverLinks()
	{
		Document doc = null;
		
		Map<String, String> m = new HashMap<String, String>();
		
		try {
			doc = Jsoup.connect("http://www.eminence.com/speakers/speaker-detail/?model=Definimax_4012HO").get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		p("reading from table");
		
		Element table = doc.select("table").get(0); //select the first table.
		Elements rows = table.select("tr");
 
		p("Num of Rows: " + rows.size());
		
		for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
		    Element row = rows.get(i);
		    Elements cols = row.select("td");
		    p(cols.get(0).text());
		    if(cols.size() >1)
		    {
		    	m.put(cols.get(0).text(), cols.get(1).text());
		    	p(cols.get(1).text());
		    }

		    //if (cols.get(7).text().equals("down")) {
		    //    p(cols.get(5).text());
		    //}
		}
		 p("done");
		 
		 dumpMap(m);
		  
		}
		
	
	static void p(String str)
	{
		System.out.println(str);
	}

	
	static void dumpMap(Map<String, String> m)
	{
		m.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
	}

	Speaker getSpeakerFromMap(Map<String, String> m)
	{
		Speaker s = new Speaker();
		
		String v, str;
		
		
		//
		//  Get RMS power  
		//
		v = m.get("Watts"); 
		str = v.replaceAll("\\D+","");
		s.setDriver_RMSPower(Integer.parseInt(str));
		
		// 
		//  Freq Range
		//
		v = m.get("Usable Frequency Range"); 
		String lower = v.substring(0, v.indexOf("-"));
		String upper = v.substring(v.indexOf("-"), v.length());
		str = lower.replaceAll("\\D+","");
		s.setDriver_FreqResponseLow(Integer.parseInt(str));
		str = upper.replaceAll("\\D+","");
		s.setDriver_FreqResponseHigh(Integer.parseInt(str)*100);
		
		// 
		//  Sensitivity*
		//
		v = m.get("Sensitivity*"); 
		str = v.replaceAll("\\D+","");
		s.setDriver_Sensitivity(Float.parseFloat(str));
		
		
		
		return s;
	}
}
