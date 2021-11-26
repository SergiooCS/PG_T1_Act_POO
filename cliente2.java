public class Cliente{
    private String nombre;
    private String ciudad;
    private float dinero;
    
    public void setNombre(String nombre){
          this.nombre=nombre;
    }
    public void setCiudad(String ciudad){
          this.ciudad=ciudad;
    }
    public void setDinero(float dinero){
          this.dinero=dinero;
    }
    
    public String getNombre(){
          return this.nombre;
    }
    public String getCiudad(){
          return this.ciudad;
    }
    public float getDinero(){
          return this.dinero;
    }
}