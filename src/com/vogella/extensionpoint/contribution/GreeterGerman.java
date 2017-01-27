package com.vogella.extensionpoint.contribution;

import com.vogella.extensionpoint.definition.*;

public class GreeterGerman implements IGreeter {

	public GreeterGerman() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void greet() {
		System.out.println("Moin, moin!");
		
	}

}
