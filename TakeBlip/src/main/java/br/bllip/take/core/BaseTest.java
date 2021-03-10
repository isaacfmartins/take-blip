package br.bllip.take.core;

import static br.bllip.take.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Before;

import br.bllip.take.pages.TakeBlipPage;

public class BaseTest {
	
	private TakeBlipPage takeblip = new TakeBlipPage();
	
	
	@Before
	public void InicializaTakeBlip() {
		
		
		takeblip.AcessarTelaTakeBlip();
		
	}	
	
	
	@After
	public void Finaliza() {
		killDriver();
	}

}
