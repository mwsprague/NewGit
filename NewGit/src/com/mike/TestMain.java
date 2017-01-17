package com.mike;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Trying out GIT");
		System.out.println("This is change one");
		System.out.println("This is change two");
		
		Speaker_data sd = new Speaker_data();
		
		
//		try {
//			sd.readJson();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		Speaker speakers[] = sd.getSpeakers();
		
		//sd.findSimilar(speakers[9], 15);
		
	//	GetUSSpeakerData gd = new GetUSSpeakerData();
	//	gd.get12DriverLinks();
		
		GetEminenceData ed = new GetEminenceData();
		ed.get12DriverLinks();

		Speaker s = ed.getSpeakerFromMap();
		
		float f = s.getDriver_RMSPower();
		p("RMS Watts: " + f);

		f = s.getDriver_ProgramPower();
		p("Program Power: " + f);

		int i = s.getDriver_FreqResponseLow();
		p("Freq Resp Low: " + i);

		i = s.getDriver_FreqResponseHigh();
		p("Freq Resp Low: " + i);
		
		f = s.getDriver_Sensitivity();
		p("Sensitivity: " + f);
		
		f = s.getDriver_VCDiameter();
		p("VC Diameter: " + f);
		
		f = s.getDriver_Re();
		p("DC resistance (Re): " + f);

		f = s.getDriver_Fs();
		p("Resonant Freq(Fs): " + f);

		f = s.getDriver_Vd();
		p("Displacement (Vd): " + f);

		f = s.getDriver_Qms();
		p("Mechanical Q (Qms): " + f);

		f = s.getDriver_Qes();
		p("Electrical Q (Qes): " + f);
		
		f = s.getDriver_Qts();
		p("Total Q (Qts): " + f);

		f = s.getDriver_Xmax();
		p("(Xmax)mm: " + f);

		f = s.getDriver_Sd();
		p("Cone Area(Sd)cm2: " + f);
		
		f = s.getDriver_Le();
		p("Coil Inductance (Le) mh: " + f);
	
		f = s.getDriver_Vas();
		p("(Vas) Liters: " + f);
		
		f = s.getDriver_Cms();
		p("Mechanical Compliance of Suspension (Cms)" + f);
		
		f = s.getDriver_MagWeight();
		p("Magnet Weight oz: " + f);

		f = s.getDriver_NetWeight();
		p("Net Weight lbs: " + f);

	}
	
	public static void p(String s)
	{
		System.out.println(s);
	}

}
