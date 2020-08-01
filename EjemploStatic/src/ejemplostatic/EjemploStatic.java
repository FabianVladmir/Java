package ejemplostatic;

public class EjemploStatic {
    public static void main(String[] args) {
        Persona p1 = new Persona("Jose");
        System.out.println("Persona = " + p1);
        Persona p2 = new Persona("Sofia");
        System.out.println("Persona2 = " + p2);

        System.out.println("N° Personas = " +Persona.getContPersonas());
    }
}
