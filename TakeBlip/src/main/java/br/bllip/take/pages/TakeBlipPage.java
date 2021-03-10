package br.bllip.take.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;


import br.bllip.take.core.BasePage;
import br.bllip.take.core.DriverFactory;


public class TakeBlipPage extends BasePage {

	public void AcessarTelaTakeBlip() {

		DriverFactory.getDriver().get("https://www.takeblip.net");
	}
	
	public void InserirNome(String texto) {

		DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 escrever("nome", texto);	 
		 
	}

	public void InserirEmail(String texto) {

		DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 escrever("email", texto);	 
		 
	}
	
	public void InserirSenha(String texto) {

		DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 escrever("senha", texto);	 
		 
	}
	
	public void InserirTelefone(String texto) {

		DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 escrever("telefone", texto);	 
		 
	}
	
	public void InserirSiteEmpresa(String texto) {

		DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 escrever("site", texto);	 
		 
	}
	
	public void MarcarTermoServico() {

		DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicar("termo");
	}

	public void Entrar() {

		DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicar("entrar");
	}
	
	public void Cadastrar() {

		DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clicar("entrar");
	}
	
	public void SelecionaTamanhoEmpresa(String valor) {

		DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		selecionarCombo("empresa", valor);
	}
	
	public void CapturarMensagem(String texto) {
		
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String mensagem = capturarTexto("mensagem");
		
		Assert.assertEquals(mensagem, texto);
	}
	

}
