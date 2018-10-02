package Exercicios;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Servidor {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
        
		try{
			ServerSocket servidor = new ServerSocket(3344);
	        while(true)
	        {
	        	System.out.println("escutando");
	        	Socket dado=servidor.accept();
	        	System.out.println("chegou pedido");
	        	ObjectOutputStream resposta= new ObjectOutputStream (dado.getOutputStream());
				ObjectInputStream pedido= new ObjectInputStream (dado.getInputStream());
				System.out.println("leu dados");
				pessoa A=(pessoa) pedido.readObject();
				
				
				
				String res="dado foi lido como sucesso "+A.nome+" "+A.idade;
				mensagem retorno=new mensagem(res);
				
				
				
				resposta.writeObject(retorno);
				dado.close();
	        }
		}catch(UnknownHostException ex)
		{
			System.err.println(ex);
		}catch(IOException ex)
		{
			System.err.println(ex);
		}
    }
}
