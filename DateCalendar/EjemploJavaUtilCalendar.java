import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2019, Calendar.SEPTEMBER, 25, 18, 20, 10);
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.MARCH);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha Con Formato = " + fechaConFormato);

        Calendar calActual = Calendar.getInstance();
        Date fecha2 = calActual.getTime();

        if(fecha.after(fecha2)){
            System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
        } else if(fecha.before(fecha2)){
            System.out.println("fecha es anterior que fecha2");
        } else if(fecha.equals(fecha2)){
            System.out.println("fecha es igual a fecha2");
        }

        if(fecha.compareTo(fecha2) > 0){
            System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
        } else if(fecha.compareTo(fecha2) < 0){
            System.out.println("fecha es anterior que fecha2");
        } else if(fecha.compareTo(fecha2) == 0){
            System.out.println("fecha es igual a fecha2");
        }

        //--------------------------------------------------------------------------------

        System.out.println("");
        System.out.println("Adicional");

        Calendar calendar = Calendar.getInstance();
        int año = calendar.get(Calendar.YEAR);
        //int mes = calendar.get(Calendar.MONTH) + 1; // Se suma 1 porque los meses en Calendar van de 0 a 11
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        SimpleDateFormat formatoMes = new SimpleDateFormat("MM");
        String mesFormateado = formatoMes.format(calendar.getTime());

        System.out.println("FECHA ACTUAL = " + año + ":" + mesFormateado + ":" + dia);

        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minuto = calendar.get(Calendar.MINUTE);
        int segundo = calendar.get(Calendar.SECOND);

        // Formatear la hora, minuto y segundo en formato "hora:minuto:segundo"
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        String horaFormateada = formatoHora.format(calendar.getTime());

        System.out.println("Hora actual: " + horaFormateada);

    }
}
