public class Futbolista extends Jugador{
    public String entrenar(){
          return "Estoy entrenando"; //Se almacena pero no se pinta
    }
    
    public String entrenar(String lugar){//overload - sobrecarga
          return "estoy entrenando en "+lugar;
    }
    
    public void jugar(){
          System.out.println("El futbolista esta jugando"); //sobreescritura override
    }
}