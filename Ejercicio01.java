import java.util.Scanner;

public class Matriz {
    private static Scanner scanner = new Scanner(System.in);
    private static int filas=0;
    private static int cols=0;
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = obtenerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 2);
    }
    private static void mostrarOpciones() {
        System.out.println("\n============Bienvenido=================");
        System.out.println("Llenar matriz");
        System.out.println("salir");
    }
    private static int obtenerOpcion() {
        return Integer.parseInt(scanner.nextLine());
    }
    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> ejecucion();
            case 2 -> System.out.println("  Hasta luego...");
            default -> System.out.println(" Opcion invalida...");
        }
    }
    private static void ejecucion(){
        pedirFilasyColumnas();
        validarDimensiones(int filas, int cols);
        crearmatriz();

    }


    private static void pedirFilasyColumnas() {
        System.out.println("ingrese la cantidad de:");
        System.out.println("filas: ");
        filas= Integer.parseInt(scanner.nextLine());
        System.out.println("Columnas: ");
        cols= Integer.parseInt(scanner.nextLine());
            }

    public static boolean validarDimensiones(int filas, int cols) {

        if (fila >= 0 & cols >= 0) {
            return true;
        } else {
            System.out.println("ocurrio un error");
            return false;

        }

    }
    public int crearMatriz(int filas, in cols){

    }

}



}
