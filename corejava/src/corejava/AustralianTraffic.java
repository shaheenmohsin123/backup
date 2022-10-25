package corejava;

import demopack.CentralTraffic;
import demopack.ContinentTraffic;

public class AustralianTraffic implements CentralTraffic,ContinentTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CentralTraffic a= new AustralianTraffic();
     a.greenGo();
     a.redstop();
     a.Flashyellow();
	AustralianTraffic at =new AustralianTraffic();
	at.walkonsymbol();
	ContinentTraffic ct =new AustralianTraffic();
	ct.Trainsymbol();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greengo implementation");
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implementation");
	}

	@Override
	public void Flashyellow() {
		// TODO Auto-generated method stub
		System.out.println("flashyellow implementation");
	}
    public void walkonsymbol() {
    	System.out.println("walk on symbol implementation");
    }

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("trainsymbol implementation");
	}
	
	
}
