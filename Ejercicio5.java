import java.util.*;

public class Ejercicio5{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		int cantidadDatos;
		int cantidadHombres=0;
		int cantidadMujeres=0;

		System.out.println("Para determinar cuantas mujerse son mayor de edad y cuantos hombres son menor de edad ingrese la cantidad de datos que dese ingresar: ");
		cantidadDatos = entrada.nextInt();

		for(int i=0; i<cantidadDatos; i++){
			int edad;
			char sexo;

			System.out.print("Ingrese sexo F (femenino) o M (masculino): ");
			sexo = entrada.next().charAt(0);
			System.out.print("Ingrese la edad: ");
			edad = entrada.nextInt();

			if(edad <18 && (sexo == 'm' || sexo== 'M')) {
				cantidadHombres++;
			}else if(edad>= 18 && (sexo == 'f' || sexo== 'F')){
				cantidadMujeres++;
			}
		}

		System.out.println("El total de mujerse mayores de edad es: "+cantidadMujeres);
		System.out.println("El total de hombres menores de edad es: "+cantidadHombres);
	}
}