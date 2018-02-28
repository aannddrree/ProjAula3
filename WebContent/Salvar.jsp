<%@page import="br.com.proj.dados.MotoDB"%>
<%@page import="br.com.proj.entidade.Moto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

int id = Integer.parseInt(request.getParameter("id"));
String descricao = request.getParameter("descricao");
int ano = Integer.parseInt(request.getParameter("ano"));

Moto moto = new Moto();

moto.setId(id);
moto.setDescricao(descricao);
moto.setAno(ano);

MotoDB db = new MotoDB();

if (db.insert(moto)){
	System.out.println("Inserido Com sucesso!");	
}else{
	System.out.println("Erro!");
}
%>


</body>
</html>