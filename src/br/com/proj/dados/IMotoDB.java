package br.com.proj.dados;

import java.util.List;
import br.com.proj.entidade.Moto;

public interface IMotoDB {

	boolean insert(Moto moto);
	boolean update(Moto moto);
	boolean delete(Moto moto);
	List<Moto> select ();
}
//CTRL + SHIFT + O -> IMPORT DE DEPENDENCIAS
//CTRL + SHIFT + F -> IDENTAR CODIGO