Algoritmo Ejercicio2
	
	//Algoritmo que pida números hasta que se introduzca un cero. Debe imprimir la suma y la media de
	//todos los números introducidos.
	
	//Datos de entrada
	Definir suma, num Como Real
	suma<-0
	//Datos de salida
	Repetir
		Escribir "Introduzca un numero, si desea saber la suma de todos los números introducidos introduzca un 0"
		Leer num
		suma<-suma + num
	Hasta Que num=0
	
	Escribir "La suma de los numeros introducidos es ", suma, "."
	
FinAlgoritmo
