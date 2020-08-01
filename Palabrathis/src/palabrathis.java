public class palabrathis {
    public static void main(String[] args) {
        Persona p = new Persona("Normalin");
    }
}

class Persona{
    String nombre;
    Persona (String nombre){
        this.nombre = nombre;

        Imprimir i = new Imprimir();
        i.Imprimir(this);
    }
}

class Imprimir{
    public  void Imprimir(Object o){
        System.out.println("Imprimir parametro: "+ o );
        System.out.println("Imprimir objeto actual (this): "+ this);
    }

}