public class MayorDeTres {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 20;
        int num3 = 30;

        if (num1 == num2 && num2 == num3) {
            System.out.println("Los tres números son iguales.");
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }
    }
}
