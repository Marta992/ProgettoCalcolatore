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
					boolean condizioneLatoQ=true;//condizione per uscire dalla sezione
					do {
						System.out.print("Inserisci il valore del lato: ");
						if(!input.hasNextDouble()) {//check double
							System.out.println("Inserisci un dato valido!");
							input.next();
						}else {
							double latoQuadrato=input.nextDouble();
							if (latoQuadrato>0) {//se il lato è positivo si può proseguire
							System.out.println("Il perimetro del quadrato è uguale a: "+latoQuadrato*4+
									"\nL'area del quadrato è uguale a:: "+latoQuadrato*latoQuadrato);
							condizioneLatoQ=false;
							}
							else {
								System.out.println("Inserisci un dato valido!");
							}
						}
					}while(condizioneLatoQ);
					break;
				case 2:
					boolean condizioneBaseR=true;
					boolean condizioneAltezzaR=true;
					do {
						System.out.print("Inserisci il valore della base: ");
						if(!input.hasNextDouble()) {
							System.out.println("Inserisci una scelta valida");
							input.next();
						}else {
							double baseR=input.nextDouble();
							if(baseR>0) {
								do {
									System.out.print("Inserisci il valore dell'altezza: ");
									if(!input.hasNextDouble()) {
										System.out.println("Inserisci una scelta valida");
										input.next();
									}else {
										double altezzaR=input.nextDouble();
										if(altezzaR>0) {
										System.out.println("Il perimetro del rettangolo è uguale a: "+(altezzaR+baseR)*2+
												"\nL'area del rettangolo è uguale a:: "+baseR*altezzaR);
										condizioneAltezzaR=false;
										}else {
											System.out.println("Inserisci una scelta valida");
										}
									}
								}while(condizioneAltezzaR);
								condizioneBaseR=false;
	
								}else {
									System.out.println("Inserisci una scelta valida");
								}
						}
					}while(condizioneBaseR);
					break;
				case 3:
					boolean condizioneRaggioC=true;
					do {
						System.out.print("Inserire il raggio del cerchio: ");
						if(!input.hasNextDouble()) {
							System.out.println("Inserire un dato valido!");
							input.next();

						}else {
							double raggioCerchio=input.nextDouble();
							if(raggioCerchio>0) {
							System.out.println("Il circonferenza del cerchio è uguale a: "+(raggioCerchio*2*3.14)+
									"\nL'area del cerchio è uguale a:: "+(raggioCerchio*raggioCerchio*3.14));
							condizioneRaggioC=false;
							}else {
								System.out.println("Inserisci una scelta valida");
							}
						}
					}while(condizioneRaggioC);
					break;
				case 4:
					boolean condizioneLatoT=true;
					boolean condizioneAltezzaT=true;
					do {
						System.out.print("Inserisci il valore del lato: ");
						if(!input.hasNextDouble()) {
							System.out.println("Inserisci una scelta valida");
							input.next();
						}else {
							double latoTriangolo=input.nextDouble();
							if(latoTriangolo>0) {
							do {
								System.out.print("Inserisci il valore dell'altezza: ");
								if(!input.hasNextDouble()) {
									System.out.println("Inserisci una scelta valida");
									input.next();
								}else {
									double altezzaTriangolo=input.nextDouble();
									if (altezzaTriangolo>0) {
									System.out.println("Il perimetro del triangolo equilatero è uguale a: "+latoTriangolo*3+
											"\nL'area del rettangolo è uguale a:: "+latoTriangolo*altezzaTriangolo/2);
									condizioneAltezzaT=false;
									}else {
										System.out.println("Inserisci una scelta valida");
									}
								}
							}while(condizioneAltezzaT);
							condizioneLatoT=false;
							}else {
								System.out.println("Inserisci una scelta valida");
							}
						}
					}while (condizioneLatoT);
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
