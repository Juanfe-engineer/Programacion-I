import java.util.ArrayList;  // Importar ArrayList para usar listas
import java.util.Collections; // Importar Collections para ordenar los numeros

public class OrdenarLista {
    public static void main(String[] args) {

        // Crear Lista
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(4);
        numeros.add(3);
        numeros.add(6);
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);

        // Numeros antes de ordenar
        System.out.println("Números antes de ordenar: " + numeros);

        // Ordenar los números de forma ascendente con el metodo Sort
        Collections.sort(numeros);

        // Numeros Ordenados
        System.out.println("Números después de ordenar: " + numeros);
    }
}

