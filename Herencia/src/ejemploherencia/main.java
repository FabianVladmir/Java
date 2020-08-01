package ejemploherencia;

public class main {
    public static void main(String[] args) {
        Empleado a1 = new Empleado("Juan", 2500);
        System.out.println("Empleado a1");
        System.out.println(a1);

        Empleado a2 = new Empleado("Juan", 3500);
        a2.setEdad(15);
        a2.setGenero('M');
        a2.setDireccion("Los Claveles");
        System.out.println("Empleado a2");
        System.out.println(a2);

        Cliente c1 = new Cliente(new java.util.Date(), false);
        System.out.println("Cliente c1");
        System.out.println(c1);

        c1.setNombre("Karla");
        c1.setEdad(22);
        c1.setGenero('F');
        c1.setDireccion("El avion");
        System.out.println("Cliente c1");
        System.out.println(c1);
    }
}
