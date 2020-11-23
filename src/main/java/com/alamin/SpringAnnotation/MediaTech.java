package com.alamin.SpringAnnotation;

import org.springframework.stereotype.Component;

@Component
public class MediaTech implements MobileProcessor {

	public void processing() {
		System.out.println("Media Tech Is Processing");
		
	}

}
