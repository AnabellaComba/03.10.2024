import java.util.Scanner;

class calcAle {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int resultado;
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int operando1 = sc.nextInt();
        System.out.print("Ingresa un segundo número: ");
        int operando2 = sc.nextInt();
        System.out.printf("Ingresa una opción \n1 - suma\n2 - resta\n3 - multiplicación\n4. - división\n");
        opcion = sc.nextInt();

        resultado = (opcion == 1) ? (operando1 + operando2)
                : (opcion == 2) ? (operando1 - operando2)
                        : (opcion == 3) ? (operando1 * operando2) : (operando2 != 0) ? (operando1 / operando2) : (-99);

        if (resultado == -99) {
            System.out.println("No fue posible realizar la división. El segundo operando fue 0.");
        }

        System.out.printf("El resultado de la operación es: %d", resultado);
        sc.close();
    }
}