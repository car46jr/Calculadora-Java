package javaapplication3;


import java.util.Scanner;


public class Main {
	static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
	static int select = -1; //opción elegida del usuario
	static int num1 = 0, num2 = 0; //Variables
	
	public static void main(String[] args) {
		
		//Mientras la opción elegida sea 0, preguntamos al usuario
		while(select != 0){
			//Try catch para evitar que el programa termine si hay un error
			try{
				System.out.println("""
                                                   Elige opci\u00f3n:
                                                   1.- Sumar
                                                   2.- Restar
                                                   3.- Multiplicar
                                                   4.- Dividir
                                                   0.- Salir""");
				//Recoger una variable por consola
				select = Integer.parseInt(scanner.nextLine()); 
	
				//Ejemplo de switch case en Java
				switch(select){
				case 1 -> {
                                    pideNumeros();
                                    System.out.println(num1+" + "+num2+" = "+(num1+num2));
                                }
				case 2 -> {
                                    pideNumeros();
                                    System.out.println(num1+" - "+num2+" = "+(num1-num2));
                                }
				case 3 -> {
                                    pideNumeros();
                                    System.out.println(num1+" * "+num2+" = "+(num1*num2));
                                }
				case 4 -> {
                                    pideNumeros();
                                    System.out.println(num1+" / "+num2+" = "+(num1/num2));
                                }
				case 0 -> System.out.println("Adios!");
				default -> System.out.println("Número no reconocido");
				}
				
				System.out.println("\n"); //Mostrar un salto de línea en Java
				
			}catch(NumberFormatException e){
				System.out.println("Uoop! Error!");
			}
		}

	}
	
	//Método para recoger variables por consola
	public static void pideNumeros(){
		System.out.println("Introduce número 1:");
		num1 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Introduce número 2:");
		num2 = Integer.parseInt(scanner.nextLine());

		//Mostrar un salto de línea en Java
		System.out.println("\n"); 
	}
}