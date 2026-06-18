Algoritmo Ejercicio8
	
	//Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque
	//por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.
	
	Definir base, resultado Como Real
	Definir exponente como Entero 
	Escribir "Escribe la base de la potencia (puede tener decimales)."
	Leer base 
	Escribir "Escribe el exponente de la potencia (debe de ser entero)"
	Leer exponente
	resultado <- 1
	
	Definir i Como Entero
	Para i <- 1 Hasta exponente Hacer
		resultado <- resultado * base
	Fin Para
	
	Escribir "El resultado es: ", resultado "."
	
FinAlgoritmo
