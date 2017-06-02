<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar Produto</title>
</head>
<body>

	<hr>
	<h3>Incluir Produto</h3>
	<hr>
	<form action="incluirProduto" method="post">
		<p>
			Código: <br /> <input type="text" name="codigo" />
		</p>
		<p>
			Descrição: <br /> <input type="text" name="descricao" />
		</p>
		
		<p>
			Preço de Custo: <br /> <input type="text" name="precoCusto" />
		</p>
		
		<p>
			Preço de Venda: <br /> <input type="text" name="precoVenda" />
		</p>
		
		<p>
			Garantia: <br /> <input type="text" name="garantia" />
		</p>
		
		<p>
			Quantidade: <br /> <input type="text" name="quantidade" />
		</p>
		
		<p>
			<input type="submit" value="Inserir">
		</p>
	</form>
</body>
</html>