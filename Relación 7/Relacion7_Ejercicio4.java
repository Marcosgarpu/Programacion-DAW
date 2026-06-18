/* Crea un programa que reciba dos Arrays, y devuelva un Array con los valores 
máximos en cada una de las posiciones. Se debe tener en cuenta que los
Arrays podrán ser de tamaños distintos. */

public class Relacion7_Ejercicio4 {
    public static void main(String[] args) {
        int[] array1 = {1, 6, 4, 9, 3};
        int[] array2 = {3, 8, 1};
        int maxLength, minLength;

        if (array1.length > array2.length) {
            maxLength = array1.length;
            minLength = array2.length;
        }
        else {
            maxLength = array2.length;
            minLength = array1.length;
        }

        // Se declara el array a rellenar con el tamaño del array mayor.
        int[] array3 = new int[maxLength];

        // Primero rellena hasta el array mas corto
        for (int i = 0; i < minLength; i++ ){
            if (array1[i] > array2[i])
                array3[i] = array1[i];
            else 
                array3[i] = array2[i];
        }

        // a continuación, rellena con lo que queda del más largo
        for (int i = minLength - 1; i < maxLength; i++){
            
            if (array1.length > array2.length) 
                array3[i] = array1[i];
            else
                array3[i] = array2[i];

            /*  array3[i] = array1[i]; */ // Rellenas directamente
        }

        // Mostrar resultado
        System.out.print("El array resultante es: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
