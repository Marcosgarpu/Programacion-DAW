Algoritmo Relación3_Ejercicio9
	
	//Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se
	//introducen por teclado.
	
	Definir cad1, cad2 como cadena	
	Escribir Sin Saltar "Escribe una cadena de caracteres"
	Leer cad1
	Escribir Sin Saltar "Escribe una cadena de caracteres, para identificar cuantas veces se encuentra la cadena a introducir en la primera cadena introducida."
	Leer cad2
	
	Definir i como entero
	Definir vecesEncontrada Como Entero
	vecesEncontrada <- 0
	Para i<-0 Hasta Longitud(cad1) - Longitud(cad2) Hacer
		Si Subcadena(cad1,i,(i + Longitud(cad2) - 1)) = cad2 Entonces
			vecesEncontrada <- vecesEncontrada + 1
		FinSi
	Fin Para
	
	Escribir "La segunda cadena ha sido encontrada ", vecesEncontrada, " veces."
	
FinAlgoritmo
