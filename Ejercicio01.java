import java.util.Scanner;
private static Scanner scanner = new Scanner(System.in);
private static int filas = 0;
private static int cols = 0;

public class Matriz {


    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = obtenerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 5);
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
            case 1 -> pedirFilasyColumnas();
            case 2 -> mostrarmatriz();
            case 3 -> verificarmatrizCero();
            case 4 -> mostrarfila();
            case 5 -> System.out.println("  Hasta luego...");
            default -> System.out.println(" Opcion invalida...");
        }
    }



    }


    private static void pedirFilasyColumnas() {
        System.out.println("ingrese la cantidad de:");
        System.out.println("filas: ");
        filas = Integer.parseInt(scanner.nextLine());
        System.out.println("Columnas: ");
        cols = Integer.parseInt(scanner.nextLine());
        validarDimensiones( int filas, int cols);
    }

    public static boolean validarDimensiones(int filas, int cols) {

        if (fila >= 0 && cols >= 0) {
            return true;
        } else {
            System.out.println("ocurrio un error");
            return false;

        }

    }
    public static void mostrarmatriz(int [][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j]);
        }
    }
    }


    public static int[][] crearMatriz(int filas, int cols){
        return new int [filas][cols];
}
    public static void llenarmatriz (int [][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random()*10);
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
    public static int verificarCero() {
        for (int x = 0; x < matriz.length; x++){
            for (int y = 0; y < matriz.length; y++) {
            }

    }

}


