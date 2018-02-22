package br.com.proj.dados;

import java.util.List;

import br.com.proj.entidade.Moto;

public class MotoDB implements IMotoDB{
	
	public MotoDB(){
		//ABERTURA DA CONEXÃO COM A BASE DE DADOS
	}

	@Override
	public boolean insert (Moto moto){
		
		System.out.println("Id: "+ moto.getId());
		System.out.println("Descrição: "+ moto.getDescricao());
		System.out.println("Ano: "+ moto.getAno());
		
		//IMPLEMENTAÇÃO DO INSERT NA BASE DE DADOS
		
		return true;
	}

	@Override
	public boolean update(Moto moto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Moto moto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Moto> select() {
		// TODO Auto-generated method stub
		return null;
	}
}
