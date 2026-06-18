Algoritmo Relación3_Ejercicio10
	
	//Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es aquella
	//que se lee igual adelante que atrás.
	
	// Declaración de variables
	Definir cad1, cadSinEspacios, cadInvertida como cadena	
	Definir i como Entero
	Escribir Sin Saltar "Introduce una cadena de caracteres:"
	Leer cad1
	
	// Eliminar espacios (opcional, para comparar solo letras)
	cadSinEspacios <- ""
	Para i <- 0 Hasta Longitud(cad1) - 1 Hacer
		Si subcadena(cad1,i,i) <> " " Entonces
			cadSinEspacios <- concatenar(cadSinEspacios,subcadena(cad1,i,i))
		FinSi
	Fin Para
	
	// Convertir a minúsculas para que la comparación no sea sensible a mayúsculas/minúsculas
	cadSinEspacios <- Minusculas(cadSinEspacios)
	
	// Invertir la cadena
	cadInvertida <- ""
	Para i<-Longitud(cadSinEspacios) - 1 Hasta 0 Con Paso -1 Hacer
		cadInvertida <- Concatenar(cadInvertida,subcadena(cadSinEspacios,i,i))
	Fin Para
	
	// Verificar si es palíndromo
	Si cadInvertida = cadSinEspacios Entonces
		Escribir "La cadena ES un palídromo"
	SiNo
		Escribir "La cadena NO es un palídromo"
	FinSi
	
FinAlgoritmo
