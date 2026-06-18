Algoritmo Relación2_Ejercicio4
	
	//Algoritmo que pida caracteres e imprima 'VOCAL' si son vocales y 'NO VOCAL' en caso contrario, el
	//programa termina cuando se introduce un espacio.
	
	Definir carac Como Caracter
	
	Repetir
		Escribir "Introduce un caracter(para terminar introduzca un espacio)."
		Leer carac
		Si carac = "a" o carac = "e" o carac = "i" o carac ="o" o carac ="u" o carac = "A" o carac="E" o carac="I" o carac="O" o carac="U" Entonces
			Escribir "El caracter introducido es una VOCAL"
		SiNo
			Escribir "El caracter introducido NO es VOCAL"
		FinSi
	Hasta Que carac = " "
	
FinAlgoritmo
