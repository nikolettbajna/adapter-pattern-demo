package com.qa.main;

public class EUtoUKConnectorAdapter implements UKPlugConnector {
	
	EUPlugConnector plug;
	
	public EUtoUKConnectorAdapter(EUPlugConnector plug) {
		this.plug = plug;
	}
	
	//@Override
	public void provideElectricity() {
		plug.provideElectricity();
	}

}
