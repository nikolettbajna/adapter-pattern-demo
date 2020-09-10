package com.qa.main;

public class UKtoEUConnectorAdapter implements EUPlugConnector {

    UKPlugConnector plug;
	
	public UKtoEUConnectorAdapter(UKPlugConnector plug) {
		this.plug = plug;
	}
	
	//@Override
	public void provideElectricity() {
		plug.provideElectricity();
	}
	
}
