Algoritmo Relación2_Ejercicio5
	
	//Escribir un programa que imprima todos los números pares entre dos números que se le pida al
	//usuario.
	
	Definir a, b Como Real
	Escribir "Este programa introduce los numeros pares que se encuentran entre los números que se introduzcan a continuación."
	
	Definir i como entero
	Repetir
		Escribir "Escribe un número"
		Leer a
		Escribir "Escribe otro número"
		Leer b
		Para i<-a Hasta b Hacer
			Si i MOD 2 = 0 Entonces 
			Escribir i 
		FinSi
	Fin Para
	Hasta Que a > b 

FinAlgoritmo
