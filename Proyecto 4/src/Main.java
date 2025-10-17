public class Main {
    public static void main(String[] args) {
        // Crear dos objetos Empleado
        Empleado empleado1 = new Empleado("Juan", "Pérez", 2875.50);
        Empleado empleado2 = new Empleado("Ana", "García", 3200.00);

        // --- Mostrar salarios anuales iniciales ---
        System.out.println("--- Salarios Anuales Iniciales ---");
        System.out.printf("Salario anual de %s %s: $%.2f%n",
                empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(), empleado1.getSalarioAnual());

        System.out.printf("Salario anual de %s %s: $%.2f%n",
                empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(), empleado2.getSalarioAnual());

        System.out.println("\n"); // Línea en blanco para separar

        // --- Proporcionar un aumento del 10% a cada empleado ---
        System.out.println("--- Aplicando un aumento del 10% ---");
        empleado1.darAumento(10);
        empleado2.darAumento(10);
        System.out.println("Aumento aplicado exitosamente.");

        System.out.println("\n"); // Línea en blanco para separar

        // --- Mostrar salarios anuales después del aumento ---
        System.out.println("--- Salarios Anuales Después del Aumento ---");
        System.out.printf("Nuevo salario anual de %s %s: $%.2f%n",
                empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(), empleado1.getSalarioAnual());

        System.out.printf("Nuevo salario anual de %s %s: $%.2f%n",
                empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(), empleado2.getSalarioAnual());
    }
}