package com.mike;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetUSSpeakerData {
	
	public void get12DriverLinks()
	{
		Document doc = null;
		try {
			doc = Jsoup.connect("http://www.usspeaker.com/12.htm").get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//Element content = doc.getElementById("content");
		Elements links = doc.getElementsByTag("a");
		for (Element link : links) {
		  String linkHref = link.attr("href");
		  p(linkHref);
		  String linkText = link.text();
		  p(linkText);
		  
		}
		
	}
	
	static void p(String str)
	{
		System.out.println(str);
	}


}
