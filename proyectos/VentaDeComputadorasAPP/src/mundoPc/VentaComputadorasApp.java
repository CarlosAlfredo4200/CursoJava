package mundoPc;


import mundoPc.modelo.Computadora;
import mundoPc.modelo.Monitor;
import mundoPc.modelo.Raton;
import mundoPc.modelo.Teclado;
import mundoPc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {
        Raton raton = new Raton("bluetooth", "Lenovo");
        Teclado teclado = new Teclado("bluetooth", "Lenovo");
        Monitor monitor = new Monitor("Lenovo", 27);

        Computadora computadora = new Computadora("Computadora Lenovo", monitor, teclado, raton);



        Orden orden1 = new Orden();

        Monitor monitorDell = new Monitor("DELL", 15);
        Teclado tecladoDell = new Teclado("USB", "DELL");
        Raton ratonDell = new Raton("USB", "DELL");

        Orden orden2 = new Orden();

        Monitor monitorHP = new Monitor("HP", 15);
        Teclado tecladoHP = new Teclado("USB", "HP");
        Raton ratonHP = new Raton("USB", "HP");


        Computadora computadoraDell = new Computadora("Computadora DELL", monitorDell,tecladoDell,ratonDell);
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP,tecladoHP,ratonHP);
        orden1.agregarComputadoras(computadora);
        orden1.agregarComputadoras(computadoraDell);
        orden1.mostrarOrden();

        orden2.agregarComputadoras(computadoraHP);
        orden2.mostrarOrden();


    }
}