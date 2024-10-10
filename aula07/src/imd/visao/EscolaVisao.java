package imd.visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import imd.modelo.Escola;
import imd.modelo.Evento;


public class EscolaVisao{
	
	public static void main(String args []) throws ParseException {
		
		Escola escola = new Escola();
		Evento evento = new Evento();
		
		Scanner ler = new Scanner(System.in);
		
		String descrição = "";
		String date = "00-00-0000";
		
		System.out.printf("Informe a descrição do evento: ");
		descrição = ler.next();
		
		System.out.print("Informe a data do evento: ");
		date = ler.next();
		
		//DataFormat can be put in Control 
		Date dt = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		dt = formato.parse(date);
		
		evento.setName(descrição);
		evento.setDate(dt);
		
		escola.setEvento(evento);
		mostrarEvento(escola);
		
		ler.close();
	}
	
	public static void mostrarEvento(Escola escola) {
		System.out.println("----------------------------------");
		System.out.println("Evento: " + escola.getEvento().getName());
		System.out.println("Data: " + escola.getEvento().getDate());
		System.out.println("----------------------------------");
	}
}
