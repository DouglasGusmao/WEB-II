package br.com.ifpe.estoque.testes;

import java.util.Date;

import org.junit.Test;

import br.com.ifpe.estoque.model.Produto;
import br.com.ifpe.estoque.model.ProdutoDao;

public class TesteProduto {

	@Test
	public void testeInserir() {
		Produto p = new Produto();
		p.setCodigo("cod12");
		p.setDescricao("Produto teste");
		p.setPrecoCusto(10);
		p.setPrecoVenda(20);
		p.setGarantia(new Date());
		p.setQuantidade(3);
		
		ProdutoDao dao = new ProdutoDao();
		
		dao.salvar(p);
	}

}
