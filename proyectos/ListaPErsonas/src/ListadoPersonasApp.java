import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(scanner, personas);
            } catch (Exception e) {
                System.out.println("Algo falló: " + e.getMessage());
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("""
                **** Listado de personas App ****
                1.Agregar
                2.Listar
                3.Salir
                """);

        System.out.println("Seleccione la opción: ");
    }

    private static boolean ejecutarOperacion(Scanner scanner, List<Persona> personas) {
        int opcion = Integer.parseInt(scanner.nextLine());
        boolean salir = false;

        switch (opcion) {

            case 1 -> {
                agregarPersona(scanner, personas);
                break;
            }
            case 2 -> {
                System.out.println(" *** Listado de personas ");
                //personas.forEach((per) -> System.out.println(per));
                personas.forEach(System.out::println);
                break;
            }
            case 3 -> {
                System.out.println("Hasta pronto");
                salir = true;
                break;
            }
            default -> System.out.println("Opción erronea " + opcion);
        }
        return salir;


    }

    private static void agregarPersona(Scanner scanner, List<Persona> personas) {
        System.out.println(" *** Agregar persona *** ");
        System.out.print("Ingrese el nombre : ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el telefono : ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese el email : ");
        String email = scanner.nextLine();

        var persona = new Persona(nombre, telefono, email);
        personas.add(persona);
        System.out.println("La lista tiene : " + personas.size() + " elementos");
    }
}