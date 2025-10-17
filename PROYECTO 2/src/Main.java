//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //objeto 1
    Flor flor1=new Flor();
    flor1.nombre= "Rosa";
    flor1.largo = 60;
    flor1.color= "Rojo";
    flor1.precio= 8;
        flor1.informcion();
    //objeto 2
        Flor flor2 =new Flor();
        flor2.nombre= "Clavel";
        flor2.largo = 70;
        flor2.color= "Blanco";
        flor2.precio= 4;
       flor2.informcion();
        //objeto 3
        Flor flor3 =new Flor();
        flor3.nombre= "Girasol";
        flor3.largo = 150;
        flor3.color= "Amarillo";
        flor3.precio= 1;
        flor3.informcion();
    }
}