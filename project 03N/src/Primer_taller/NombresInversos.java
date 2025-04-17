import java.util.ArrayList;

public class NombresInversos {
    public static void main(String[] args) {

        String nombre1 = "Juan";
        String nombre2 = "Carlos";
        String nombre3 = "Ana";
        String nombre4 = "Sofía";
        String nombre5 = "Pedro";

        // Crear lista
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add(nombre1);
        nombres.add(nombre2);
        nombres.add(nombre3);
        nombres.add(nombre4);
        nombres.add(nombre5);

        // Mostrar los nombres en orden inverso
        System.out.println("Nombres en orden inverso:");
        for (int i = nombres.size() - 1; i >= 0; i--) {
            System.out.println(nombres.get(i));
        }
    }
}

// Usamos un FOR decreciente

// nombres.size() - 1       obtiene la última posición de la lista.
// i--     hace que el ciclo vaya en orden inverso (de mayor a menor).
// nombres.get(i)     obtiene cada nombre en la posición i.






