package br.com.ifpe.estoque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.ifpe.estoque.model.Produto;
import br.com.ifpe.estoque.model.ProdutoDao;

@Controller
public class ProdutoController {

	@RequestMapping("/in")
	public String ola() {
		return "produto/inicial";
	}

	@RequestMapping("incluirProduto")
	public String incluirProduto(Produto produto) {
		ProdutoDao dao = new ProdutoDao();
		dao.salvar(produto);
		return "produto/produtoSucesso";
	}
}
