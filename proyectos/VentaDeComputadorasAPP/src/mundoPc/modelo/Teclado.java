package mundoPc.modelo;

public class Teclado extends  DispositivoEntrada {

    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado(String marca, String tipoEntrada) {
        super(marca, tipoEntrada);
        idTeclado = ++contadorTeclados;
    }

    @Override
    public String toString() {
        return
                " IdTeclado=" + idTeclado +
                 super.toString();
    }
}
