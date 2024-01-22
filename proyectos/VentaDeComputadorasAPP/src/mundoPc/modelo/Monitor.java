package mundoPc.modelo;

public class Monitor {
    private  final int idMonitor;
    private String marca;
    private double tamano;
    private static int contadormonitores;

    private Monitor() {
       idMonitor = ++contadormonitores;
    }

    public Monitor( String marca, double tamano) {
        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return
                "IdMonitor :" + idMonitor +
                " marca :" + marca + '\'' +
                " tamano :" + tamano ;
    }
}
