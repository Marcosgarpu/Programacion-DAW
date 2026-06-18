Algoritmo Ejercicio2
	//Realizar un programa que comprueba si una cadena leída por teclado comienza por una subcadena
	//introducida por teclado.
	
	//Datos de entrada
	Definir cadena1, cadena2 como cadena	
	
	//Contadores
	Definir i como Entero
	
	Escribir "Introduce una primera cadena de caracteres:"
	Leer cadena1
	
	Escribir "Introduce la segunda cadena: "
	Leer cadena2
	
	Si cadena2 = Subcadena(cadena1,0,Longitud(cadena2) - 1) Entonces
		Escribir "La primera cadena comienza con la segunda cadena."
	SiNo
		Escribir "La primera cadena no comienza con la segunda cadena."
	FinSi
	
	
FinAlgoritmo
