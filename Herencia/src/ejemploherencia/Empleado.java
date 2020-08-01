package ejemploherencia;

public class Empleado extends Persona{
    private int id;
    private double sueldo;
    private static int contEmpleado;

    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.id = ++contEmpleado;
        this.sueldo = sueldo;
    }
    public int getId(){
        return id;
    }
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    @Override
    public String toString(){
        return super.toString() + "Emplead[" + "id: " +id+ ", sueldo"+sueldo+ ']';
    }
}
