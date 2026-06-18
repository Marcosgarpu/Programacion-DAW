Algoritmo Relación3_Ejercicio6
	
	//Realizar un programa que dada una cadena de caracteres por caracteres, genere otra cadena
	//resultado de invertir la primera.
	
	Definir cad1, cad2 como cadena	
	Escribir Sin Saltar "Introduce una cadena de caracteres:"
	Leer cad1
	cad2 <- ""
	Definir i como Entero
	Para i <- Longitud(cad1) - 1 Hasta 0 Con Paso -1 Hacer
		cad2 <- Concatenar(cad2,Subcadena(cad1,i,i))
	Fin Para
	
	Escribir "La cadena inversa de la cadena introducida es la siguiente: ", cad2 "."
	
FinAlgoritmo
