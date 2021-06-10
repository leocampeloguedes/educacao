<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Educação Empreendedora</title>
</head>
<body>
		<h3>Formulário de Cadastro do Evento</h3><br/>
		<form action="SalvarCadastroServlet" method="post">
			Nome Completo: <input type="text" id="nome" name="nome"><br/>
			Gênero: <input type="text" id="genero" name="genero"><br/>
      		CPF: <input type="text" id="cpf" name="cpf"><br/>
      		Telefone: <input type="text" id="telefone" name="telefone"><br/>
      		Data de Nascimento: <input type="text" id="data_nascimento" name="data_nascimento"><br/>
      		Email: <input type="text" id="email" name="email"><br/>
      		Cidade: <input type="text" id="id_cidade" name="id_cidade"><br/>
      		Escola: <input type="text" id="id_escola" name="id_escola"><br/>
      
      	<input type="submit" value="Salvar">
      </form>
</body>
</html>