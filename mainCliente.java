public class Main{
    public static void main(String [] args){
          //Jugador jugador=new Jugador(); //instanciar la clase jugador
          //jugador.jugar();
          //Futbolista futbolista=new Futbolista();
          //futbolista.jugar();
          //String mensaje=futbolista.entrenar("Valdevebas"); //Se almacena en mensaje
          //System.out.println(mensaje); //se pinta mensaje
          Cliente cliente=new Cliente();
          cliente.setNombre("Indra");
          cliente.setCiudad("Sevilla");
          cliente.setDinero(10000);
          Cliente cliente2=new Cliente();
          cliente2.setNombre("Vass");
          cliente2.setCiudad("Valencia");
          cliente2.setDinero(12000);
          
          System.out.println(cliente.getNombre());
          System.out.println(cliente.getCiudad());
          System.out.println(cliente.getDinero());
          System.out.println("El cliente "+cliente.getNombre()+"-"+cliente.getCiudad()+" tiene un presupuesto de "+cliente.getDinero()+" euros");
          System.out.println(cliente2.getNombre());
          System.out.println(cliente2.getCiudad());
          System.out.println(cliente2.getDinero());
          System.out.println("El cliente "+cliente2.getNombre()+"-"+cliente2.getCiudad()+" tiene un presupuesto de "+cliente2.getDinero()+" euros");
          
    }
}