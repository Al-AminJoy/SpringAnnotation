package com.alamin.SpringAnnotation;

import org.springframework.stereotype.Component;

@Component

public class Snapdragon implements MobileProcessor {

	public void processing() {
		System.out.println("Snapdragon Is Processing");
		
	}
	

}
