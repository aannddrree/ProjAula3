package br.com.proj.teste;

import br.com.proj.util.Conexao;

public class TesteConexao {

	public static void main(String[] args) {

		System.out.println("Inicio");

		Conexao.getConnection();

		System.out.println("Fim");

	}

}
