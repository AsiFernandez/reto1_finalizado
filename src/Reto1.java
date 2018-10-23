import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) throws InterruptedException {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("------------------------------------------------------------");
		System.out.println("---------- Bienvenido al Programa del Primer Reto ----------");
		System.out.println("------------------------------------------------------------");
		int opcion = 0;
		
		do {
			System.out.println("1- Numero positivo y determinar la cantidad de digitos (si se leen numeros negativos descartar)");
			System.out.println("2- Introducir un numero y un digito y contar el digito cuantas veces aparece");
			System.out.println("3- Introducir un numero y mostrarlo al reves");
			System.out.println("4- Calcular el factorial de un numero");
			System.out.println("5- Piramide de asteriscos");
			System.out.println("6- ");
			System.out.println("7- Contador de vocales en una frase");
			System.out.println("8- Tablas de multiplicar del 1 al 10");
			opcion = scan.nextInt();
			
			switch (opcion) {
// Inicio del case 1 
			
			case 1:
				System.out.println("Has elegedio la primera opcion. 'Cantidad de digitos', Empezemos.");
				Thread.sleep(2000); // pequeña pausa despues de la introduccion
				
				int numero1;
				do {
					System.out.println("Introduce un numero Por Favor" );
					numero1 = scan.nextInt();
					int digitos = (int) (Math.log10(numero1)+1);
					if(numero1 > 0) {
					System.out.println("El numero introducido tiene un total de " + digitos + " digitos" + "\n\n");
					}
				}while(numero1 <=0); {
					
				}			
			break;
			
// final del case 1
// Inicio del case 2
			
			case 2:
				Scanner scan2 = new Scanner(System.in);
				
				System.out.println("Veo que has elegido la opcion 2. Contar un digito en un numero");									
				Thread.sleep(2000); 																									// pequeña pausa despues de la introduccion
				
				System.out.println("Introduce un numero Por Favor");																	//pedir datos
				Long numero2 = scan2.nextLong();
				System.out.println("Ahora debes introducir el numero que quieres que comprobemos cuanto se repite");
				int numeroRepite = scan2.nextInt();
				
				int repeticiones = 0;																									//contador para ver las veces que se repite
				
			    String num = String.valueOf(numero2);																					//conversion de long a string para poder comparar los caracteres del numero con el que le decimos insertamos	
			       
			    
			            for(int i = 0; i < num.length(); i++) {
			                if(Integer.valueOf(String.valueOf(num.charAt(i))) == numeroRepite) {
			                    repeticiones++;
			                }
			            }
			            System.out.println("el numero se repite " + repeticiones + " veces");
			        
			       
			break;

//final del case 2
//Inicio del case 3
			case 3:
				
				int numero3, resto;
				System.out.println("Hola, has accedido a la opcion 3 aqui introduciras un numero y lo mostrare al reves.");
				System.out.println("Introduce el numero que quieras por favor");
				numero3 = scan.nextInt();
				
				while(numero3 != 0) {
					resto = numero3%10;
					System.out.print(resto);
					numero3 = numero3/10;
				}
				
			System.out.println("\n");
									
			break;
			
// final del case 3
//Inicio del case 4
			case 4:
				System.out.println("Estas dentro de la cuarta opcion aqui calcularemos el factorial de un numero");
				System.out.println("Introduce el numero que quieras por favor");
				int numero4 = scan.nextInt();
				int factorial = 1;
				
				for(int i = 1; i <= numero4; i++) {
					factorial = factorial * i;
				}
				System.out.println(factorial);
				
			break;
// final del case 4
//inicio del case 5
			case 5:
				System.out.println("Veo que optas por la opcion 5, dame un numero y hare una piramide de esa cantidad");
				System.out.println("Introduce el numero que quieras por favor");
				int numero5 = scan.nextInt();
				
				for(int i = 0; i < numero5; i++) {
					for (int j = 0; j< i+1; j++) {
						System.out.print("*");
					}
					System.out.println("");
				}
				break;
//final del case 5
				
				
				
				
//Inicio del case 6
			case 6:
				Scanner scan6 = new Scanner(System.in);
				Boolean numeroBinarioB = true;
				int numeroBinario, potencia;
				
				System.out.println("introduce un numero");
				numeroBinario = scan6.nextInt();
				
				String numeroBinarioS = String.valueOf(numeroBinario);
				
				int mostrar = Integer.parseInt(numeroBinarioS, 2);
				
				System.out.println(mostrar);
				
			break;
//final del case 6
			
//inicio del case 7
			case 7:
				Scanner lector= new Scanner(System.in);
				System.out.println("Has elegedio la sexta opcion. vocales en una frase, Empezemos.");
				Thread.sleep(2000); // pequeña pausa despues de la introduccion
				System.out.println("Introduce una frase por favor");
				String frase6 = lector.nextLine();
				frase6.toLowerCase();
				
				int contador7 = 0;
				
				for(int i = 0; i< frase6.length(); i++) {
					if(frase6.charAt(i)=='a' || frase6.charAt(i)== 'e' || frase6.charAt(i)== 'i' || frase6.charAt(i)== 'o' || frase6.charAt(i) == 'u') {
						contador7++;
					}
				}
				System.out.println(contador7);
				break;
//final del case 7
				
				
				
				
//Inicio del case 8
			case 8:
			System.out.println("Bienvenido a la octava opcion aqui te voy a mostrar las tablas de multiplicar");
			Thread.sleep(2000);
			
			for(int i=1; i<= 10; i++) {
				for(int j=1; j<=10; j++) {
					System.out.println(i + "*" + j + "=" + i*j );
				}
			}
				
			break;
//final del case 8
			case 9:
				break;
			default:
			System.out.println("ese numero no es una opcion");
				break;
			}
		} while (opcion != 8);
	}

}
