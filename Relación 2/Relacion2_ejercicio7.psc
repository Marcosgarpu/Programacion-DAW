Algoritmo Relacion2_ejercicio7
	
	//programa que pida el limite mayor y menor de un intervalo
	//si limite inferior es mayor al superior Repetir
	//pedir numeros hasta teclear 0
	//suma de todo
	//cuantos numeros se quedan fuera del intervalo
	//cuantos numeros iguales a los intervalos
	
	//datos de entrada
	definir num, limMayor, limMenor Como Entero

	//datos de salida
	definir contadorFuera, contadorIgual, suma Como Entero
		
	suma<-0
	contadorFuera<-0
	contadorIgual<-0
	
	escribir "Introduce el limite mayor"
	leer limMayor
	escribir "Introduce el limite menor"
	leer limMenor
	
	Mientras limMenor >= limMayor 
		escribir "El limite menor no puede ser superior o igual al limite mayor"
		escribir "Introduce otro limite mayor"
		leer limMayor
		escribir "Introduce limite menor"
		leer limMenor
	FinMientras
	
	escribir "Introduce un numero (introduce 0 para terminar):"
	leer num
	
	Mientras num <> 0 Hacer
			
		si num > limMenor y num < limMayor Entonces
			suma<- num + suma
		sino
			si num = limMayor o num = limMenor entonces 
				contadorIgual<- contadorIgual + 1
			SiNo
				contadorFuera<- contadorFuera + 1
			fin si
		FinSi
		
		escribir "Introduce un numero (introduce 0 para terminar):"
		leer num
	Fin Mientras
	
	escribir "La suma de los numeros que estan dentro del intervalo es :", suma
	escribir "Estan fuera un total de :", contadorFuera, " numeros."
	escribir "Coinciden con los valores un total de :", contadorIgual, " numeros."
	
FinAlgoritmo
