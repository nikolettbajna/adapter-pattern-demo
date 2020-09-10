package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		UKElectricalSocket ukelectricalSocket = new UKElectricalSocket();
		EUElectricalSocket euelectricalSocket = new EUElectricalSocket();
		
		UKPlugConnector ukplug = new EUtoUKConnectorAdapter(euelectricalSocket);
		EUPlugConnector euplug = new UKtoEUConnectorAdapter(ukelectricalSocket);
		
		System.out.println("Its an UK plug, no adapter");
		ukelectricalSocket.provideElectricity();
		System.out.println("Its an EU plug, no adapter");
		euelectricalSocket.provideElectricity();
		
		System.out.println("EU plug with EU to UK adapter");
		useUKforEUAdapter(euplug);
		System.out.println("UK plug with UK to EU adapter");
		useEUforUKAdapter(ukplug);
	}
	
	public static void useEUforUKAdapter(UKPlugConnector plug) {
        plug.provideElectricity();
    }

    public static void useUKforEUAdapter(EUPlugConnector plug) {
    	plug.provideElectricity();
    }
}
