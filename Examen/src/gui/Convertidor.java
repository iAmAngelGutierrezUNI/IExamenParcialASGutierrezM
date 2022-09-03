package gui;

import java.util.Scanner;

public class Convertidor {
	Scanner scan = new Scanner(System.in);
	public void show() {
			int opcion = 0;
			do {
			
			System.out.println("Escriba el numero de opcion que desee realizar ");
			System.out.println("1. Convertir bytes a kilobytes.");
			System.out.println("2. Convertir kilobytes a megabytes.");
			System.out.println("3. Salir.");
			opcion = scan.nextInt();
			switch (opcion) {
			
			case 1: 
				ConvertirBAK bytes = new ConvertirBAK();
				bytes.BytesAKilobytes();
				break;
			case 2: ConvertirKAM kilobytes = new ConvertirKAM();
					kilobytes.KilobytesAMegabytes();
						break;
				default: System.out.println("Opcion invalida");
					break;
			}
			
			}while(opcion!=3);
		}
}
