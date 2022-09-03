package gui;

import java.util.Scanner;

import dol.Calculos;

public class ConvertirBAK {
	private Scanner scan = new Scanner(System.in);
	public void BytesAKilobytes() {
		Calculos calculos = new Calculos();
		System.out.println("Ha elegido calcular Bites a Kilobytes");
		System.out.println("Porfavor ingrese los datos");
		calculos.bites = scan.nextDouble();
		calculos.resultadoB = calculos.bites / 1000;
		
		System.out.println(calculos.bites+" Bites son: "+calculos.resultadoB+" Kilobytes");
		
		
	}

}
