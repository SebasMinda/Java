//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //istanciar automovil con el objeto auto1
    Automovil auto1=new Automovil();
    //crear atributos
        auto1.marca= "BMW\n";
        auto1.modelo= "320\n";
        auto1.color= "Blanco\n";
        auto1.cilindraje=300;
        auto1.numeropuertas=4;
        //selecionar atributos
        //metoddo
        auto1.informacion();
        //normal
        System.out.printf("Marca:  " + auto1.marca);
        System.out.printf("Modelo: " + auto1.modelo);
        System.out.printf("Color:  " + auto1.color);
        System.out.printf("Cilindraje: " + auto1.cilindraje+"\n\n\n");
        //Nuevop objeto
    Automovil deportivo=new Automovil();
    deportivo.marca = "Bugatti";
    deportivo.modelo= "Chiron";
    deportivo.color = "Rojo";
    deportivo.cilindraje= 1934;
    deportivo.numeropuertas= 2;
        System.out.printf("NUEVO OBJETO\n");
        System.out.printf("Marca:             " + deportivo.marca+"\n");
        System.out.printf("Modelo:            " + deportivo.modelo+"\n");
        System.out.printf("Color:             " + deportivo.color+"\n");
        System.out.printf("Cilindraje:        " + deportivo.cilindraje+"\n");
        System.out.printf("Numero de Puertas: " + deportivo.cilindraje+"\n");
    }
}