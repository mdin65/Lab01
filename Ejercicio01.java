import java.util.Scanner;



public class Ejercicio01 {
    static int filas = 0;
    static int fila =0;
    static int cols = 0;
    static int[][] miMatriz;
    static Scanner scanner = new Scanner(System.in);
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
        System.out.println("escoge una opción: ");
        System.out.println("1. escoger filas y columnas");
        System.out.println("2. Mostrar matriz");
        System.out.println("3. verificar matriz cero");
        System.out.println("4. Mostrar una fila");
        System.out.println("5. salir");
    }

    private static int obtenerOpcion() {
        return Integer.parseInt(scanner.nextLine());
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> opcion1();
            case 2 -> opcion2();
            case 3 -> opcion3();
            case 4 -> opcion4();
            case 5 -> System.out.println("  Hasta luego...");
            default -> System.out.println(" Opcion invalida...");
        }
    }

    private static void opcion1(){
        pedirFilasyColumnas();
        while (!(validarDimensiones(filas,cols))){
            pedirFilasyColumnas();
            validarDimensiones(filas, cols);
        }
        System.out.println("datos ingresados con éxito");

    }

    private static void pedirFilasyColumnas() {
        System.out.println("ingrese la cantidad de:");
        System.out.println("filas: ");
        filas = Integer.parseInt(scanner.nextLine());
        System.out.println("Columnas: ");
        cols = Integer.parseInt(scanner.nextLine());
    }


    public static boolean validarDimensiones(int filas, int cols) {
        boolean valido = filas >= 0 && cols >= 0;
        if (valido) {
            System.out.println("las dimensiones son invalidas");
            return !valido;
        }else {
            return valido;
        }
    }
    private static void opcion2(){
        miMatriz= crearMatriz(filas, cols);
        llenarmatriz(miMatriz);
        mostrarmatriz(miMatriz);

    }
    public static int[][] crearMatriz(int filas, int cols) {
        return new int[filas][cols];
    }

    public static void llenarmatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void mostrarmatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void opcion3(){
        if(!(verificarmatrizCero(miMatriz))) {
            System.out.println("la matriz no es una matriz cero");
        }
        {
            System.out.println("la matriz es una matriz cero");
        }
    }
    public static boolean verificarmatrizCero(int [][]matriz) {
        int totalElementos = matriz.length * matriz[0].length;
        int contadorCeros = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    contadorCeros++;
                }
            }
        }
        return contadorCeros > (totalElementos / 2);
    }
    private static void opcion4(){
        fila= preguntarfila();
        mostrarfila(miMatriz, fila);
    }

    private static int preguntarfila(){
        System.out.println("ingresa el numero de la fila:");
        return Integer.parseInt(scanner.nextLine());
    }
    private static void mostrarfila(int [][] matriz, int fila){
        if (fila>=0 && fila < matriz.length) {
            System.out.print("Fila" + fila + ":");
            for (int j = 0; j < matriz[fila].length; j++) {
                System.out.print(matriz[fila][j] + " ");
            }
        }else{
            System.out.println("fila no encontrada");
        }
    }
}



