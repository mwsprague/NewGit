package com.mike;

import java.io.IOException;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Trying out GIT");
		System.out.println("This is change one");
		System.out.println("This is change two");
		
		Speaker_data sd = new Speaker_data();
		
		
		try {
			sd.readJson();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Speaker speakers[] = sd.getSpeakers();
		
		sd.findSimilar(speakers[0], 15);

	}

}
