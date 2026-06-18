Algoritmo Ejercicio8
	
	//Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas, el vendedor desea
	//saber cuánto dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes y
	//el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.
	
	//Datos de entrada
	Definir venta1, venta2, venta3, sueldo, comision, sueldoTotal Como Real
	
	//Datos de salida
	Escribir "Escribe la ganacia de la primera venta"
	Leer venta1
	Escribir "Escribe la ganacia de la segunda venta"
	Leer venta2
	Escribir "Escribe la ganancia de la tercera venta"
	Leer venta3
	
	sueldo<-venta1+venta2+venta3
	comision<-sueldo*0.10
	sueldoTotal<-sueldo+comision
	
	Escribir "El sueldo total es ", sueldoTotal, "."
	
	
FinAlgoritmo
