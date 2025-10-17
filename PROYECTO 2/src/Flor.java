public class Flor {
    String nombre;
    int precio;
    String color;
    int largo;
    public void informcion(){
        System.out.printf("Nombre: "+ nombre+"\n");
        System.out.printf("Color:  "+ color+"\n");
        System.out.printf("Largo:  "+ largo+" cm\n");
        System.out.printf("Precio: "+ precio+" $\n\n");
    }
}