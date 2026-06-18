Algoritmo Ejercicio1
	//Escribir por pantalla cada carácter de una cadena introducida por teclado.
	
	
	//Datos de entrada
	Definir i Como Entero
	
	//Datos de salida
	Definir caden,carácter1 Como Cadena
	Escribir "Introduce una cadena de carácteres"
	Leer caden
	Para i<-0 Hasta Longitud(caden) - 1 Hacer
		Escribir subcadena(caden,i,i)
	Fin Para
	
FinAlgoritmo
