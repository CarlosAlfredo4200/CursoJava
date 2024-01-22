import java.util.Arrays;
import java.util.Scanner;

public class EjemploArreglosNumMayor {
    public static void main(String[] args) {

        int[] a = new int[5];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 5 enteros:");
        for(int i = 0; i<a.length; i++){
            a[i] = s.nextInt();
        }

        int max = 0;
        for(int i = 1; i < a.length; i++){
            max = (a[max] > a[i])? max: i;
        }
        System.out.println("max = " + a[max]);



        // Imprimir el array union
        Arrays.sort(union);
        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i] + " ");
        }

        System.out.println("\nMaximo valor del array : " +Arrays.stream(union).max().orElse(0));
        System.out.println("Minimo valor del array : " + Arrays.stream(union).min().orElse(0));
    }
}
