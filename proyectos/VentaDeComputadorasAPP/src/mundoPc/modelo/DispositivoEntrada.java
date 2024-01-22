package mundoPc.modelo;

public class DispositivoEntrada {
    private String marca;
    private String tipoEntrada;

    public DispositivoEntrada(String marca, String tipoEntrada) {
        this.marca = marca;
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    @Override
    public String toString() {
        return " DispositivoEntrada " +
                " marca :" + marca + '\'' +
                " tipoEntrada :" + tipoEntrada + '\'';
    }
}
