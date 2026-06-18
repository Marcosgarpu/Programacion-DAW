Algoritmo Ejercicio6
	
	//Realizar un algoritmo que muestre la tabla de multiplicar de un número introducido por teclad.
	
	Definir num, contador Como Entero
	Escribir "Introduzca el número del que desea saber su tabla de multiplicar"
	Leer num
	contador <- 0
	
	Definir i como entero
	Para i <- 0 Hasta 10 Hacer
		contador <- num * i
		Escribir contador
	FinPara
	
FinAlgoritmo
