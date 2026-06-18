Algoritmo Ejercicio3
	//
	
	//Datos de entrada 
	Definir cad como cadena
	Definir carac Como caracter
	
	//Definir contadores
	Definir i Como Entero
	Definir contadorLetras Como Entero
	
	Escribir "Introduce una cadena de caracteres"
	Leer cad
	Escribir "Introduce un caracter"
	Leer carac
	
	Mientras Longitud(carac) <> 1 Hacer
		Escribir "Introduce un solo caracter"
		Leer carac
	Fin Mientras
	
	//Inicializar contador
	contadorLetras<-0
	Para i <- 0 Hasta Longitud(cad) - 1 Hacer
		Si Subcadena(cad,i,i) = carac Entonces
			contadorLetras<- contadorLetras + 1
		FinSi
	Fin Para
	
	Escribir "El caracter, ", carac, ", aparece ", contadorLetras, " veces."
	
FinAlgoritmo
