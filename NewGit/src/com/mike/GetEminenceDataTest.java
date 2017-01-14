package com.mike;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GetEminenceDataTest {

	@Test
	public void testGetSpeakerFromMap()
	{
		GetEminenceData ed = new GetEminenceData();
		
		Map<String, String> testmap = new HashMap<String, String>(); 
		
		//testmap.put(key, value)
		testmap.put("Cone Edge Composition", "Cloth cone edge");
		testmap.put("Efficiency Bandwidth Product (EBP)", "142");
		testmap.put("Maximum Linear Excursion (Xmax)", "6.2 mm");
		testmap.put("Gap Height Value", "0.37\", 9.5 mm");
		testmap.put("Compliance Equivalent Volume (Vas)", "53.68 liters / 1.9 cu.ft.");
		testmap.put("Magnet Composition", "Ferrite magnet");
		testmap.put("Basket Materials", "Die-cast aluminum basket");
		testmap.put("Cone Composition", "Water resistant paper cone");
		testmap.put("Overall Diameter", "12.38\", 314.5 mm");
		testmap.put("Voice Coil Diameter", "4\", 102 mm");
		testmap.put("DC Resistance (Re)", "5.52 ?");
		testmap.put("Resonant Frequency (fs)", "51 Hz");
		testmap.put("Mounting Holes Diameter", "0.27\", 6.9mm");
		testmap.put("Maximum Mechanical Limit (Xlim)", "11.2 mm");
		testmap.put("BL Product (BL)", "19.56 T-M");
		testmap.put("Driver Volume Displaced", "0.106 cu.ft. / 3 liters");
		testmap.put("Depth", "5.32\", 135.1 mm");
		testmap.put("Core Details", "Undercut with aluminum shorting ring and Core Periphery Ventilation");
		testmap.put("Rear Sealing Gasket", "Yes");
		testmap.put("Usable Frequency Range", "48 Hz - 2.7 kHz");
		testmap.put("Sensitivity*", "96.2 dB");
		testmap.put("Diaphragm Mass Inc. Airload (MMs)", "78 grams");
		testmap.put(" ", " ");
		testmap.put("Mechanical Q (Qms)", "11.03");
		testmap.put("Electromagnetic Q (Qes)", "0.36");
		testmap.put("Mechanical Compliance of Suspension (Cms)", "0.13 mm/N");
		testmap.put("Sealed", "25.49-76.46 liters / 0.9-2.7 cu.ft.");
		testmap.put("Program Power", "1200 W");
		testmap.put("Baffle Hole Diameter", "11.06\", 280.9 mm");
		testmap.put("Coil Former", "Kapton former");
		testmap.put("Peak Diaphragm Displacement Volume (Vd)", "338.2 cc");
		testmap.put("Surface Area of Cone (Sd)", "545.4 cm2");
		testmap.put("Dust Cap Composition", "Water resistant treated paper dust cap");
		testmap.put("Nominal Basket Diameter", "12\", 305 mm");
		testmap.put("Coil Inductance (Le)", "0.95m H");
		testmap.put("Shipping Weight", "24.8 lbs, 11.25 kgs");
		testmap.put("Front Sealing Gasket", "Yes");
		testmap.put("Vented", "33.98-99.11 liters / 1.2-3.5 cu.ft.");
		testmap.put("Resonance", "51 Hz");
		testmap.put("Total Q (Qts)", "0.35");
		testmap.put("Coil Construction", "Edge wound copper voice coil");
		testmap.put("Mounting Holes B.C.D.", "11.69\", 296.9mm");
		testmap.put("Net Weight", "22.5 lbs, 10.21 kg");
		testmap.put("Nominal Impedance*", "8 ?");
		testmap.put("Watts", "600 W");
		testmap.put("Magnet Weight", "109 oz.");

		
		Speaker s = ed.getSpeakerFromMap(testmap);
		int i = s.getDriver_RMSPower();
		p("RMS power: " + i);
		
		
		fail("Not yet implemented");
	}

	
	static void p(String s)
	{
		System.out.println(s);
	}
}
