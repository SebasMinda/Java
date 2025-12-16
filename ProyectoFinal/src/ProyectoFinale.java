import java.util.Scanner;

public class ProyectoFinale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("-----Menu de opciones-----");
            System.out.println("1. Gestionar Clientes");
            System.out.println("2. Gestionar Productos");
            System.out.println("3. Gestionar Ventas");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion: ");
            opc = sc.nextInt();

        }while (opc != 4);
    }
}
