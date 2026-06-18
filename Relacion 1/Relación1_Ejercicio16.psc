Algoritmo Ejercicio16
	
	//Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia d. El que
	//está detrás viaja a una velocidad mayor. Se pide hacer un algoritmo para ingresar la distancia entre los
	//dos vehículos (km) y sus respectivas velocidades (km/h) y con esto determinar y mostrar en qué
	//tiempo (minutos) alcanzará el vehículo más rápido al otro.
	
	
	//Datos de entrada
	Definir v1, v2, distancia, tiempo Como Entero
	Escribir "Introduce la velocidad del primer vehículo"
	Leer v1
	Escribir "Introduce la velocidad del segundo vehículo"
	Leer v2
	Si v1<v2 Entonces
		Escribir "La velocidad del primer vehículo debe de ser mayor"
		Repetir
			Escribir "Introduce la velocidad del primer vehículo"
			Leer v1
			Escribir "Introduce la velocidad del segundo vehículo"
			Leer v2
		Hasta Que v1>v2
	FinSi
	
	Escribir "¿A que distacia están separados los vehículos"
	Leer distancia
	
	
FinAlgoritmo
