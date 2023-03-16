public class ClaseInterface2 implements Interface1, Interface2{

    // Atributos propios
    String nombre;
    String apellido;
    //...
    public String nombreCompleto2(){
        return nombre + " " + apellido;
    }
    // Métodos de los interfaces
    @Override
    public void metodoInterface1A() {

        System.out.println("Método 1A del interface1");
    }

    @Override
    public void metodoInterface1B() {
        System.out.println("Método 1B del interface1");
    }

    @Override
    public void metodoInterface2A() {
        System.out.println("Método 1A del interface2");
    }

    @Override
    public void metodoInterface2B() {
        System.out.println("Método 1B del interface2");
    }

    public ClaseInterface2(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String nombreCompleto() {
        return null;
    }
}
