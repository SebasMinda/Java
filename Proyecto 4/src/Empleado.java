// Archivo: Empleado.java

public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    // Constructor para inicializar las variables de instancia
    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;

        // Valida que el salario sea positivo al crear el objeto
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    // --- Métodos establecer (setters) ---

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    // El método establecer para el salario valida que no sea negativo
    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    // --- Métodos obtener (getters) ---

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    // --- Métodos adicionales para la funcionalidad ---

    /**
     * Calcula y devuelve el salario anual del empleado.
     * @return el salario mensual multiplicado por 12.
     */
    public double getSalarioAnual() {
        return this.salarioMensual * 12;
    }

    /**
     * Aplica un aumento porcentual al salario mensual del empleado.
     * @param porcentajeAumento El porcentaje de aumento (ej. 10 para 10%).
     */
    public void darAumento(double porcentajeAumento) {
        if (porcentajeAumento > 0) {
            double aumento = this.salarioMensual * (porcentajeAumento / 100.0);
            this.salarioMensual += aumento;
        }
    }
}