public class Proveedor {
    String RUC;
    String razonSocial;
    String direccion = "Nayon S/N";

    public Proveedor() {
    }

    public Proveedor(String RUC, String razonSocial) {
        this.RUC = RUC;
        this.razonSocial = razonSocial;
    }
    //Metodos
    public void detalle1(){
        System.out.println("El ruc es: "+this.RUC);
        System.out.println("La razon social es: "+this.razonSocial);
        System.out.println("El direccion es: "+this.direccion);
    }
}
