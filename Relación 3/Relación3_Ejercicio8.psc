Algoritmo Relación3_Ejercicio8
	
	//Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y
	//viceversa.
	
	Definir cad, resultado como cadena
	Definir letra Como Caracter
	Escribir Sin Saltar "Introduzca una cadena (las letras mayúsculas serán cambiadas por minúsculas"
	Leer cad
	resultado <- ""
	
	Definir i Como Entero
	Para i<-0 Hasta Longitud(cad) - 1 Hacer
		letra <- Subcadena(cad,i,i)
		Si letra = Mayusculas(letra) Entonces
			letra <- Minusculas(letra)
		SiNo 
			Si	letra = Minusculas(letra) Entonces
				letra <- Mayusculas(letra)
			FinSi
		FinSi
		resultado <- Concatenar(resultado, letra)
	Fin Para
	
	Escribir Sin Saltar "La conversión es: ", resultado "."
	
FinAlgoritmo
