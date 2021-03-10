package br.bllip.take.tests;

import org.junit.Test;

import br.bllip.take.core.BaseTest;
import br.bllip.take.pages.TakeBlipPage;


public class TakeBlipTest extends BaseTest {

	TakeBlipPage page = new TakeBlipPage();

	@Test
	public void LoginComSucesso() {
		
		page.AcessarTelaTakeBlip();
		page.InserirEmail("ifm@teste.com");
		page.InserirSenha("123");
		page.Entrar();
		page.CapturarMensagem("Logado com Sucesso");

	}

	@Test
	public void LoginComEmailInvalido() {

		page.AcessarTelaTakeBlip();
		page.InserirEmail("xxx@yyy");
		page.InserirSenha("123");
		page.Entrar();
		page.CapturarMensagem("Email/Senha Inválidos");

	}

	@Test
	public void CadastroComSucesso() {

		page.AcessarTelaTakeBlip();
		page.InserirNome("Maria");
		page.InserirEmail("maria@teste.com");
		page.InserirSenha("123");
		page.InserirTelefone("9999-9999");
		page.InserirSiteEmpresa("www.teste.com");
		page.SelecionaTamanhoEmpresa("Multinacional");
		page.MarcarTermoServico();
		page.Cadastrar();
		page.CapturarMensagem("Cadastro realizado com sucesso");
	}

	@Test
	public void CadastroEmailInvalido() {

		page.AcessarTelaTakeBlip();
		page.InserirNome("Joana");
		page.InserirEmail("yyy@UUU");
		page.InserirSenha("123");
		page.InserirTelefone("9999-9999");
		page.InserirSiteEmpresa("www.teste.com");
		page.SelecionaTamanhoEmpresa("Multinacional");
		page.MarcarTermoServico();
		page.Cadastrar();
		page.CapturarMensagem("Email/Senha Inválidos");
	}

	@Test
	public void CadastroSemInserirCamposObrigatórios() {

		page.AcessarTelaTakeBlip();
		page.InserirNome("");
		page.InserirEmail("");
		page.InserirSenha("");
		page.InserirTelefone("");
		page.InserirSiteEmpresa("");
		page.SelecionaTamanhoEmpresa("Multinacional");
		page.MarcarTermoServico();
		page.Cadastrar();
		page.CapturarMensagem("Campos Obrigatórios Não Informados");
	}

}
