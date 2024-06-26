package test;

import java.util.Scanner;

public class ProgettoCalcolatore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean condizione = true;
		System.out.println("Benvenuto, scegli una figura.");
		do {
			System.out.println("\n1.Quadrato");
			System.out.println("2.Rettangolo");
			System.out.println("3.Cerchio");
			System.out.println("4.Triangolo Equilatero");
			System.out.println("5.Triangolo Rettangolo");
			System.out.println("6.Trapezio");
			System.out.println("7.Rombo");
			System.out.println("8.Parallelogramma");
			System.out.println("9.Pentagono Regolare");
			System.out.println("10.Esagono Regolare");
			System.out.println("0.Esci \n");

			System.out.print("Inserisci la tua scelta: ");
			if (input.hasNextInt()) {
				int scelta = input.nextInt();

				switch (scelta) {
				case 1:

					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

					break;
				case 6:

					break;
				case 7:

					break;
				case 8:

					break;
				case 9:
					// area pentagono regolare A=p·a/2 dividendo per due il prodotto tra il
					// perimetro e l'apotema
					// perimetro p= L*5 fine

					boolean condizioneLatoP = true;
					do {
						System.out.print("inserisci il valore del lato: ");
						if (input.hasNextDouble()) {
							double perimetro = input.nextDouble() * 5;
							condizioneLatoP = false;
							boolean condizioneApotemaP = true;
							do {
								System.out.print("inserisci il valore dell'apotema: ");
								if (input.hasNextDouble()) {
									double apotema = input.nextDouble();
									System.out.println("Il perimetro del pentagono è: " + perimetro);
									System.out.println("L'area del pentagono è: " + (perimetro * apotema) / 2);
									condizioneApotemaP = false;
								} else {
									input.next();
									System.out.println("Inserisci una scelta valida");
								}
							} while (condizioneApotemaP);
						} else {
							input.next();
							System.out.println("Inserisci una scelta valida");
						}
					} while (condizioneLatoP);

					break;
				case 10:
					boolean condizioneLatoE = true;
					do {
						System.out.print("inserisci il valore del lato: ");
						if (input.hasNextDouble()) {
							double perimetro = input.nextDouble() * 6;
							condizioneLatoE = false;
							boolean condizioneApotemaE = true;
							do {
								System.out.print("inserisci il valore dell'apotema: ");
								if (input.hasNextDouble()) {
									double apotema = input.nextDouble();
									System.out.println("Il perimetro dell'esagono è: " + perimetro);
									System.out.println("L'area dell'esagono è: " + (perimetro * apotema) / 2);
									condizioneApotemaE = false;
								} else {
									input.next();
									System.out.println("Inserisci una scelta valida");
								}
							} while (condizioneApotemaE);
						} else {
							input.next();
							System.out.println("Inserisci una scelta valida");
						}
					} while (condizioneLatoE);

					break;
				case 0:
					System.out.println("Arrivederci");
					condizione = false;
					break;
				default:
					System.out.println("Inserisci una scelta valida");

				}
			} else {
				input.next();
				System.out.println("Inserisci una scelta valida");

			}

		} while (condizione);
	}

}
