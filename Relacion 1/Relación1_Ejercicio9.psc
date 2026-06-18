Algoritmo Ejercicio9
	
	//Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuánto
	//deberá pagar finalmente por su compra.
	
	//Datos de entrada
	Definir precioCompra, compra, rebaja Como Real
	
	//Datos de salida 
	Escribir "Introduce el precio del producto del que se desea saber el precio total"
	Leer precioCompra
	rebaja<-precioCompra*0.15
	compra<-precioCompra-rebaja
	Escribir "El precio total es de ", compra, "."
	
FinAlgoritmo
