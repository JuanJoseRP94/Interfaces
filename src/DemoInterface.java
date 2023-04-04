import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DemoInterface {
    public static void main(String[] args) {
        ClaseInterface1 objeto1 = new ClaseInterface1("Juancho", "Romero");
        System.out.println("objeto1.nombre = " + objeto1.nombre);
        System.out.println("objeto1.nombreCompleto() = " + objeto1.nombreCompleto());
        System.out.println("objeto1.CONSTANTE1 = " + objeto1.CONSTANTE1);

        objeto1.metodoInterface1A();
        objeto1.metodoInterface1B();


        ClaseInterface2 objeto2 = new ClaseInterface2("Juancho", "Romero");
        System.out.println("objeto2.nombre = " + objeto2.nombre);
        System.out.println("objeto2.nombreCompleto() = " + objeto2.nombreCompleto());
        System.out.println("objeto2.CONSTANTE2 = " + objeto2.CONSTANTE2);
        objeto2.metodoInterface2B();
        objeto2.metodoInterface2A();

        // Heredando de una clase e implementando un interface
        ClaseHeredaInterface2 objeto3 = new ClaseHeredaInterface2("Juancho", "Romero", "juancho@hotmalil.com");
        System.out.println("objeto3.nombre = " + objeto3.nombre);
        System.out.println("objeto3.nombreCompleto() = " + objeto3.nombreCompleto());
        objeto2.metodoInterface2B();
        objeto2.metodoInterface2A();

        // Fecha
        LocalDate objFecha = LocalDate.now();
        System.out.println("objFecha = " + objFecha);

        // Formato dd/MM/YYYY
        DateTimeFormatter fmtFecha = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        System.out.println("objFecha.format(fmtFecha) = " + objFecha.format(fmtFecha));

        // Hora
        LocalTime objHora = LocalTime.now();
        System.out.println("objHora = " + objHora);

        // Formato hora hh:mm:ss
        DateTimeFormatter fmtHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("objHora.format(fmtHora) = " + objHora.format(fmtHora));
        
        // Fecha y hora al mismo tiempo
        LocalDateTime objFechaHora = LocalDateTime.now();
        System.out.println("objFechaHora = " + objFechaHora);
        DateTimeFormatter fmtFechaHora = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy HH:mm:ss");
        System.out.println("objFechaHora.format(fmtFechaHora) = " + objFechaHora.format(fmtFechaHora));

        // Establecer Fecha y Hora
        objFechaHora = LocalDateTime.of(2145, 5, 22, 12, 1, 2);
        System.out.println("objFechaHora.format(fmtFechaHora) = " + objFechaHora.format(fmtFechaHora));
    }
}
