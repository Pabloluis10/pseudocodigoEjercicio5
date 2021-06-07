Algoritmo HombresYMujeres
	Escribir "Para determinar cuantas mujerse son mayor de edad y cuantos hombres son menor de edad ingrese la cantidad de datos que dese ingresar"
	Leer cantida;
	
	CantidadMujeres = 0;
	CantidadHombres = 0;
	
	Para i=1 Hasta cantida Con Paso 1 Hacer
		Escribir "Ingrese el tipo de sexo m (masculino) f (Femenino)";
		Leer sexo;
		Escribir "Ingrese la edad";
		Leer edad;
		
		Segun sexo Hacer
			"M"o"m":
				Si edad < 18 Entonces
					CantidadHombres = CantidadHombres +1;
				Fin Si
			"F"o"f":
				Si edad >= 18 Entonces
					CantidadMujeres = CantidadMujeres +1;
				FinSi
			De Otro Modo:
				Escribir "No ha ingresado un sexo que sea reconocido";
		Fin Segun
	Fin Para
	Escribir "El total de mujer mayores de edad es: ",CantidadMujeres;
	Escribir "El total de hombres menores de edad es: ",CantidadHombres;
FinAlgoritmo
