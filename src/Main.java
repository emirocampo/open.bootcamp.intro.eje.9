public class Main {
    public static void main(String[] args) {

        System.out.println("practica tema 9");
        Cliente client1 = new Cliente(32,"carlos",22334455);
        client1.setCredito(5000);
        Trabajador trabajador1 = new Trabajador(25,"jose",11223344);
        trabajador1.setSalario(8000);
        System.out.println("CLIENTE");
        System.out.println("nombre: "+client1.getNombre());
        System.out.println("edad: "+client1.getEdad());
        System.out.println("telefono: "+client1.getTelefono());
        System.out.println("credito: "+client1.getCredito());
        System.out.println("TRABAJADOR");
        System.out.println("nombre: "+trabajador1.getNombre());
        System.out.println("edad: "+trabajador1.getEdad());
        System.out.println("telefono: "+trabajador1.getTelefono());
        System.out.println("salario: "+trabajador1.getSalario());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private long telefono;

    public Persona(int edad, String nombre, long telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {

    public Cliente(int edad, String nombre, long telefono) {
        super(edad, nombre, telefono);
    }

    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{

    public Trabajador(int edad, String nombre, long telefono) {
        super(edad, nombre, telefono);
    }

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}