package ejemplostatic;

public class Persona {
    private String nombre;
    private int id;
    private static int contPersonas;

    public Persona(String nombre){
        contPersonas++;
        id = contPersonas;
        this.nombre = nombre;
    }
    public String toString(){
        return "Persona[ id: " +id +", nombre: "+ nombre + "]";
    }
    public static int getContPersonas(){
        return contPersonas;
    }
}
