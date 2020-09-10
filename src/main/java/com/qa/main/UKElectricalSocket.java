package com.qa.main;

public class UKElectricalSocket implements UKPlugConnector {
	
	//@Override
	public void provideElectricity() {
		System.out.println("It is an UK socket");
	}
}
