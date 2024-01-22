package mundoPc.modelo;

public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorCoputadoras;

    private Computadora() {
        idComputadora = ++contadorCoputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }


    @Override
    public String toString() {
        return "---- COMPUTADORA -----:" +
                "\nidComputadora :" + idComputadora +
                "\nnombre :" + nombre + '\'' +
                "\nmonitor :" + monitor +
                "\nteclado :" + teclado +
                "\nraton :" + raton;
    }
}
