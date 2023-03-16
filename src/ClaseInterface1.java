public class ClaseInterface1 implements Interface1{
    // Atributos
    String nombre;
    String apellido;
    //....

    // Métodos de la clase
    public String nombreCompleto(){
        return nombre + " " + apellido;
    }

    public ClaseInterface1(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Métodos del interface
    @Override
    public void metodoInterface1A() {
        System.out.println("Método 1A del interface1");
    }

    @Override
    public void metodoInterface1B() {
        System.out.println("Método 1B del interface1");
    }
}
