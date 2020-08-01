public class PersonaPrueba {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        System.out.println("valores por default del objeto persona");
        p1.desplegarNombre();

        p1.nombre = "Fabian";
        p1.apellido = "Florez";
        p2.nombre = "Maricielo";
        p2.apellido = "Ramos";

        System.out.println("\nNuevos valores del objeto persona");
        p1.desplegarNombre();

        System.out.println("\nValosres del  objeto numero 2");
        p2.desplegarNombre();
    }

}
