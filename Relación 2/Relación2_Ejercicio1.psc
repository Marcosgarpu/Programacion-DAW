Algoritmo Ejercicio1
	
	//Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1
	//al 100. A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o
	//menor que el introducido, además de los intentos que te quedan (tienes 10 intentos para acertarlo). El
	//programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado),
	//si se llega al límite de intentos te muestra el número que había generado.
	
	//Datos de entrada
	Definir numeroAleatorio, numero1, numeroIntentos Como Real
	numeroAleatorio<-Azar(101)
	numeroIntentos<-0
	Escribir numeroAleatorio
	Repetir
		numeroIntentos<- numeroIntentos + 1
		Escribir "Escribe un numero del 1 al 100"
		Leer numero1
		Si numero1>numeroAleatorio y numeroIntentos<10 Entonces
			Escribir "El número introducido es menor"
		FinSi
		Si numero1<numeroAleatorio y numeroIntentos<10 Entonces
			Escribir "El número introducido es mayor"
		FinSi
		Si numero1==numeroAleatorio Entonces 
			Escribir "Has acertado el numero aleatorio, el número de intentos han sido ", numeroIntentos, "."
		FinSi
		Si numeroIntentos=10 Entonces
			Escribir "Has llegado al límite de los intentos, el número aleatorio es ", numeroAleatorio, "."
		FinSi
	Hasta Que numero1==numeroAleatorio o numeroIntentos=10
	
	
FinAlgoritmo
