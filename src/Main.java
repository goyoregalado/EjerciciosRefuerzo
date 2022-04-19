import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int MAX_ELEMENTOS = 10;
        SegundoEjercicio []listaObjetos = new SegundoEjercicio[MAX_ELEMENTOS];
	    boolean salir = false;

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        while(!salir) {
            System.out.println("1.- Añadir 10 objetos con todos los atributos aleatorios y mostrarlos");
            System.out.println("2.- Añadir 10 objetos con el atributo \"b\" aleatorio y mostrarlos");
            System.out.println("3.- Salir");

            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    for (int i = 0; i < MAX_ELEMENTOS; i++) {
                        listaObjetos[i] = new SegundoEjercicio(Math.random(), Math.random());
                        System.out.println(listaObjetos[i]);
                    }
                    break;
                case 2:
                    for (int i = 0; i < MAX_ELEMENTOS; i++) {
                        listaObjetos[i] = new SegundoEjercicio(Math.random());
                        System.out.println(listaObjetos[i]);
                    }
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Seleccione una opción válida");

            }
        }
    }
}
