Algoritmo Ejercicio5
	
	//Si tenemos una cadena con un nombre y apellidos, realizar un programa que muestre las iniciales en
	//mayúsculas.
	
	//Datos de entrada
	Definir cad1, iniciales como cadena
	Escribir "Escribe tu nombre y apellidos"
	Leer cad1
	// Convertimos toda la cadena a mayúsculas
	cad1<-Mayusculas(cad1)
	iniciales <- Subcadena(cad1,0,0)
	
	Definir i como entero
	Para i <- 0 Hasta longitud(cad1) - 1 Hacer
		Si Subcadena(cad1,i-1,i-1) = " " Entonces
			iniciales<-Concatenar(iniciales,Subcadena(cad1,i,i)) 	
		FinSi
	Fin Para
	
	Escribir "Las iniciales del nombre y los apellidos son ", iniciales
	
FinAlgoritmo
