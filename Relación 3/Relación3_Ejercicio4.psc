Algoritmo Ejercicio4
	
	//Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras
	//separadas por espacios), realiza un programa que cuente cuántas palabras tiene.
	
	//Datos de entrada
	Definir cad1 como cadena
	Escribir "Introduce una cadena para contar sus palabras"
	Leer cad1
	
	//Contador
	Definir contadorPalab Como Entero
	contadorPalab <- 0
	Definir i como entero
	Para i <- 0 Hasta Longitud(cad1) - 1 Hacer
		Si subcadena(cad1,i,i) = " " Entonces
			contadorPalab <- contadorPalab + 1
		FinSi
	Fin Para
	
	Escribir "El número de palabras de la cadena es ", contadorPalab + 1, "."
	
FinAlgoritmo
