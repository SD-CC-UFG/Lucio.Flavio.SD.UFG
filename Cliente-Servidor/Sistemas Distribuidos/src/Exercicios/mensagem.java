package Exercicios;

import java.io.Serializable;

public class mensagem implements Serializable{
	public String mensagem;
	mensagem(String in1)
	{
		this.mensagem=in1;
	}
	String print()
	{
		return mensagem;
	}
}
