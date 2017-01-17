package com.mike;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetEminenceData {
	
	Map<String, String> m = null;
	
	public GetEminenceData() {
		m = new HashMap<String, String>();
	}


	public void get12DriverLinks()
	{
		Document doc = null;
		
		
		
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

	Speaker getSpeakerFromMap()
	{
		return getSpeakerFromMap(m); 
	}
	
	Speaker getSpeakerFromMap(Map<String, String> m)
	{
		Speaker s = new Speaker();
		
		String v, str;
		
		
		//
		//  Get RMS power  
		//
		v = m.get("Program Power"); 
		str = v.replaceAll("\\D+","");
		s.setDriver_ProgramPower(Integer.parseInt(str));
		s.setDriver_RMSPower(s.getDriver_ProgramPower()/2);
		
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
		str = v.replaceAll("[\\D+&&[^\\.]]","");            // replace all non-digits except a dot
		s.setDriver_Sensitivity(Float.parseFloat(str));
		
		//
		// VC Diameter
		//
		v = m.get("Voice Coil Diameter");
		//p("VC String: " + v);
		str = v.replaceAll("\".*", "");  // 4", 102 mm
		//p("VC: " + str);		
		s.setDriver_VCDiameter(Float.parseFloat(str));
		
		//DC Resistance (Re)
		v = m.get("DC Resistance (Re)");
		str = v.replaceAll("[\\D+&&[^\\.]]","");   //5.52 ?
		s.setDriver_Re(Float.parseFloat(str));
		
		//Resonant Frequency (fs)
		v = m.get("Resonant Frequency (fs)");
		str = v.replaceAll("[\\D+&&[^\\.]]","");   //51 Hz
		s.setDriver_Fs(Float.parseFloat(str));

		//"Driver Volume Displaced (Vd)", "0.106 cu.ft. / 3 liters"
		v = m.get("Driver Volume Displaced");
		str = v.replaceAll("cu.*","");   //"0.106 cu.ft. / 3 liters"
		s.setDriver_Vd(Float.parseFloat(str));
		
		//"Mechanical Q (Qms)", "11.03"
		v = m.get("Mechanical Q (Qms)");
		str = v.replaceAll("[\\D+&&[^\\.]]","");   //Not really needed but just in case other characters show up
		s.setDriver_Qms(Float.parseFloat(str));
		
		//"Electromagnetic Q (Qes)", "0.36"
		v = m.get("Electromagnetic Q (Qes)");
		str = v.replaceAll("[\\D+&&[^\\.]]","");   //Not really needed but just in case other characters show up
		s.setDriver_Qes(Float.parseFloat(str));
		
		//"Total Q (Qts)", "0.35"
		v = m.get("Total Q (Qts)");
		str = v.replaceAll("[\\D+&&[^\\.]]","");   //Not really needed but just in case other characters show up
		s.setDriver_Qts(Float.parseFloat(str));
		
		//Maximum Linear Excursion (Xmax)", "6.2 mm
		v = m.get("Maximum Linear Excursion (Xmax)");
		str = v.replaceAll("[\\D+&&[^\\.]]","");   //
		s.setDriver_Xmax(Float.parseFloat(str));
		
		//Surface Area of Cone (Sd)", "545.4 cm2
		v = m.get("Surface Area of Cone (Sd)");
		str = v.replaceAll("[\\D+&&[^\\.]]","");   //
		s.setDriver_Sd(Float.parseFloat(str));
		
		//Coil Inductance (Le)", "0.95m H
		v = m.get("Coil Inductance (Le)");
		str = v.replaceAll("[\\D+&&[^\\.]]","");   //
		s.setDriver_Le(Float.parseFloat(str));
		
		//Compliance Equivalent Volume (Vas)", "53.68 liters / 1.9 cu.ft.
		v = m.get("Compliance Equivalent Volume (Vas)");
		str = v.replaceAll("liters.*","");   //
		s.setDriver_Vas(Float.parseFloat(str));
		
		//Mechanical Compliance of Suspension (Cms)", "0.13 mm/N
		v = m.get("Mechanical Compliance of Suspension (Cms)");
		str = v.replaceAll("[\\D+&&[^\\.]]","");   //
		s.setDriver_Cms(Float.parseFloat(str));
		
		//Magnet Weight", "109 oz.
		v = m.get("Magnet Weight");
		str = v.replaceAll("[\\D+&&[^\\.]]","");   //
		s.setDriver_MagWeight(Float.parseFloat(str));
		
		//Net Weight", "22.5 lbs, 10.21 kg"
		v = m.get("Net Weight");
		str = v.replaceAll("lbs.*","");   //
		s.setDriver_NetWeight(Float.parseFloat(str));
		
		
		return s;
	}
}
