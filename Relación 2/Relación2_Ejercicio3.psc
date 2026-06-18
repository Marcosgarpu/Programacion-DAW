Algoritmo Ejercicio3
	
	//Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). El
	//programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e
	//iguales a 0.
	
	//Datos de entrada
	Definir num, contMayor, contMenor,numVeces Como Real
	contMayor<-0
	contMenor<-0
	numVeces<-5
	//Datos de salida
	Repetir
		Escribir "Introduce un numero 5 veces"
		Leer num
		Si num > 0 Entonces
			contMayor<- contMayor + 1
		SiNo
			contMenor<-contMenor + 1
		FinSi
		numVeces<-numVeces - 1
	Hasta Que numVeces = 0
	
	Escribir "Has introducido ",contMayor " números mayores que 0."
	Escribir "Has introducido ",contMenor " números menores que 0."
	
FinAlgoritmo
