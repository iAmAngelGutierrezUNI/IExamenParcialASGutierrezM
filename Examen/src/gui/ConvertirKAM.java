package gui;

import java.util.Scanner;

import dol.Calculos;

public class ConvertirKAM {
	private Scanner scan = new Scanner(System.in);
	public void KilobytesAMegabytes() {
		Calculos cal = new Calculos();
		System.out.println("Ha elegido convertir de kilobytes a Megabytes.");
		cal.kilobites = scan.nextDouble();
		cal.resultadoK = cal.kilobites / 1024;
		System.out.println(cal.kilobites+" Kilobytes son: "+cal.resultadoK+"Megabites.");
		
	}
	}
