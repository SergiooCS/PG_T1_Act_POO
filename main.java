import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Animal animal = new Animal();
        //Mala práctica
       //animal.nombre="gato";
        //Buena práctica
        animal.setNombre("perro");
    
        //animal.patas(4);
        
        animal.setPatas(6);
        System.out.println(animal.getPatas());
        System.out.println(animal.getNombre());
    }
}