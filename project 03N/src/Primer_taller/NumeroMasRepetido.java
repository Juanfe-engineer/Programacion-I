import java.util.ArrayList;


public class NumeroMasRepetido {
    public static void main(String[] args) {

        int num1 = 3, num2 = 7, num3 = 3, num4 = 2, num5 = 7, num6 = 3;

        // Crear lista
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(num1);
        numeros.add(num2);
        numeros.add(num3);
        numeros.add(num4);
        numeros.add(num5);
        numeros.add(num6);

        int numMasRepetido = numeros.get(0);
        int maxRepeticiones = 0;

        // Recorrer la lista y contar repeticiones con un doble ciclo
        for (int i = 0; i < numeros.size(); i++) {
            int actual = numeros.get(i);
            int contador = 0;

            // Comparar con todos los números en la lista
            for (int j = 0; j < numeros.size(); j++) {
                if (numeros.get(j) == actual) {
                    contador++;
                }
            }

            // Si encontramos un número con más repeticiones, lo actualizamos
            if (contador > maxRepeticiones) {
                numMasRepetido = actual;
                maxRepeticiones = contador;
            }
        }

        // Mostrar el resultado
        System.out.println("El número que más se repite es: " + numMasRepetido);
        System.out.println("Se repite " + maxRepeticiones + " veces.");
    }
}


// El primer for toma cada número de la lista.
//El segundo for lo compara con todos los demás y cuenta cuántas veces aparece.

//Tambien se puede usar con Hashmap y es mucho mas eficiente y rapido.

// Numeros.get() sirve para obtener un elemento en una posición específica de una lista (ArrayList).
// Numeros.size() sirve para devolver la cantidad de elementos en la lista. (Es como un Len(lista) en python.