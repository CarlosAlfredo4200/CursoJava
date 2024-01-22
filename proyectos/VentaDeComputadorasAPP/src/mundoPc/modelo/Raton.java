package mundoPc.modelo;

public class Raton extends DispositivoEntrada{

    private final int idRaton;
    private static  int contadorRatones;

    public Raton(String marca, String tipoEntrada) {
        super(marca, tipoEntrada);
        idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return
                " IdRaton=" + idRaton +
                  super.toString();
    }
}
