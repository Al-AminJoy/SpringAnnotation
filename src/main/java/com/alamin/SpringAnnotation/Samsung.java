package com.alamin.SpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Samsung {
	@Autowired
	//This Annotation for specify which class of interface will work
	@Qualifier("mediaTech")
	private MobileProcessor processor;
	
	public MobileProcessor getProcessor() {
		return processor;
	}

	public void setProcessor(MobileProcessor processor) {
		this.processor = processor;
	}

	public void config(){
		processor.processing();
	}

}
