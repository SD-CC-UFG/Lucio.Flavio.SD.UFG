package Exercicios;

import java.io.*;
import java.net.*;
import java.util.*;

public class Cliente {
	public static void main(String[] args) throws ClassNotFoundException
	{
				try
				{
					Socket servidor = new Socket("localhost", 3344);
					Scanner teclado = new Scanner(System.in);
					ObjectOutputStream pedido= new ObjectOutputStream (servidor.getOutputStream());
					ObjectInputStream resposta= new ObjectInputStream (servidor.getInputStream());
					System.out.print("conectado com sucesso");
					//ler nome
					System.out.print("Digite nome: ");
					String nome=new String();
					nome=teclado.nextLine();
					System.out.print("Digite idade: ");
					//ler epso
					int idade;
					idade=teclado.nextInt();
					//ler altura
					System.out.print("Digite genero: ");
					char sexo;
					sexo=teclado.next().charAt(0);
					
					
					pessoa A=new pessoa(nome,idade,sexo);				
					pedido.writeObject(A);
					teclado.next();
					System.out.print("34");
					teclado.next();
					
					mensagem  B= (mensagem)  resposta.readObject();
					System.out.print("36");
					
					
					System.out.println(B.print());
					
					servidor.close();
					
					
					
				}catch(UnknownHostException ex)
				{
					System.err.println(ex);
				}
				catch(IOException ex)
				{
					System.err.println(ex);
				}
       }
}

