package Exercicios;

import java.io.Serializable;

public class pessoa implements Serializable{
	public String nome;
	public int idade;
	public char sexo;
	pessoa(String nome, int idade, char sexo)
	{
		this.nome=nome;
		this.idade=idade;
		this.sexo=sexo;
	}
}
