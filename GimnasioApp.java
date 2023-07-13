//public class Gym { }


import java.util.ArrayList;
import java.util.List;

//Crea una clase de entidad llamada "Cliente" con los siguientes atributos: id, nombre, edad,
// altura, peso, objetivo (cadena de caracteres)
class Cliente {
    private final int id;
    protected String nombre;
    protected int edad;
    protected double altura;
    protected double peso;
    protected String objetivo;

    public Cliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.objetivo = objetivo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    @Override
    public String toString() {
        return "Cliente" +
                " id = " + id +
                ", nombre= '" + nombre + '\'' +
                ", edad= " + edad +
                ", altura= " + altura +
                ", peso= " + peso +
                ", objetivo= " + objetivo ;

    }
}
//Crea una clase de entidad llamada "Rutina" con los siguientes atributos: id, nombre, duracion,
// nivelDificultad, descripcion
class Rutina {
    private int id;
    protected String nombre;
    protected int duracion;
    protected String nivelDificultad;
    protected String descripcion;

    public Rutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Rutina " +
                "id = " + id +
                ", nombre= " + nombre + '\'' +
                ", duracion= " + duracion +
                ", nivelDificultad= " + nivelDificultad + '\'' +
                ", descripcion= " + descripcion ;
    }
}
/*Crea una clase ServicioCliente. La clase "ServicioCliente" debe tener los siguientes métodos de CRUD:
registrarCliente: lo registra en el sistema.
obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
actualizarCliente(int id, String nombre, int edad, double altura, double peso,
String objetivo): recibe el identificador de un cliente existente y los nuevos datos del cliente,
y actualiza la información correspondiente en el sistema.
eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema*/
class ServicioCliente {
    private List<Cliente> clientes;

    public ServicioCliente() {
        clientes = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                cliente.nombre = nombre;
                cliente.edad = edad;
                cliente.altura = altura;
                cliente.peso = peso;
                cliente.objetivo = objetivo;
                break;
            }
        }
    }

    public void eliminarCliente(int id) {
        clientes.removeIf(cliente -> cliente.getId() == id);
    }
}
//Crea una clase ServicioRutina.
class ServicioRutina {
    private List<Rutina> rutinas;

    public ServicioRutina() {
        rutinas = new ArrayList<>();
    }

    public void crearRutina(Rutina rutina) {
        rutinas.add(rutina);
    }
/*La clase "ServicioRutina" debe tener los siguientes métodos de CRUD
crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega al sistema.
obtenerRutinas(): devuelve una lista con todas las rutinas registradas en el sistema.
actualizarRutina(int id, String nombre, int duracion, String nivelDificultad.
String descripcion): recibe el identificador de una rutina existente y los nuevos datos de la rutina,
y actualiza la información correspondiente en el sistema.
eliminarRutina(int id): recibe el identificador de una rutina existente y la elimina del sistema.
En el método principal (main):
 */
    public List<Rutina> obtenerRutinas() {
        return rutinas;
    }

    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
        for (Rutina rutina : rutinas) {
            if (rutina.getId() == id) {
                rutina.nombre = nombre;
                rutina.duracion = duracion;
                rutina.nivelDificultad = nivelDificultad;
                rutina.descripcion = descripcion;
                break;
            }
        }
    }

    public void eliminarRutina(int id) {
        rutinas.removeIf(rutina -> rutina.getId() == id);
    }
}

public class GimnasioApp {
    public static void main(String[] args) {
        ServicioCliente servicioCliente = new ServicioCliente();
        ServicioRutina servicioRutina = new ServicioRutina();

        // Crear cinco clientes ficticios
        Cliente cliente1 = new Cliente(1, "Juan", 30, 170.0, 70.0, "Perder peso");
        Cliente cliente2 = new Cliente(2, "María", 25, 160.0, 60.0, "Tonificar");
        Cliente cliente3 = new Cliente(3, "Pedro", 35, 180.0, 80.0, "Ganar masa muscular");
        Cliente cliente4 = new Cliente(4, "Laura", 28, 165.0, 55.0, "Mejorar resistencia");
        Cliente cliente5 = new Cliente(5, "Carlos", 32, 175.0, 75.0, "Entrenamiento funcional");

        // Crear cinco rutinas ficticias
        Rutina rutina1 = new Rutina(1, "Rutina de cardio", 30, "Intermedio", "Rutina de ejercicios cardiovasculares");
        Rutina rutina2 = new Rutina(2, "Rutina de fuerza", 45, "Avanzado", "Rutina de levantamiento de pesas");
        Rutina rutina3 = new Rutina(3, "Rutina de flexibilidad", 20, "Principiante", "Rutina de estiramientos");
        Rutina rutina4 = new Rutina(4, "Rutina de resistencia", 60, "Intermedio", "Rutina de ejercicios aeróbicos");
        Rutina rutina5 = new Rutina(5, "Rutina de equilibrio", 30, "Principiante", "Rutina de ejercicios de equilibrio");

        // Registrar los clientes en el sistema
        servicioCliente.registrarCliente(cliente1);
        servicioCliente.registrarCliente(cliente2);
        servicioCliente.registrarCliente(cliente3);
        servicioCliente.registrarCliente(cliente4);
        servicioCliente.registrarCliente(cliente5);

        // Agregar las rutinas al sistema
        servicioRutina.crearRutina(rutina1);
        servicioRutina.crearRutina(rutina2);
        servicioRutina.crearRutina(rutina3);
        servicioRutina.crearRutina(rutina4);
        servicioRutina.crearRutina(rutina5);

        // Obtener y mostrar la lista de clientes registrados
        List<Cliente> clientes = servicioCliente.obtenerClientes();
        System.out.println("Clientes registrados:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        // Obtener y mostrar la lista de rutinas registradas
        List<Rutina> rutinas = servicioRutina.obtenerRutinas();
        System.out.println("\nRutinas registradas:");
        for (Rutina rutina : rutinas) {
            System.out.println(rutina);
        }

        // Actualizar un cliente existente y mostrar la lista de clientes actualizada
        servicioCliente.actualizarCliente(3, "Pedro Gómez", 36, 181.0, 81.0, "Ganar fuerza");
        clientes = servicioCliente.obtenerClientes();
        System.out.println("\nLista de clientes actualizada:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        // Actualizar una rutina existente y mostrar la lista de rutinas actualizada
        servicioRutina.actualizarRutina(4, "Rutina de resistencia y fuerza", 60, "Avanzado", "Rutina combinada de resistencia y fuerza");
        rutinas = servicioRutina.obtenerRutinas();
        System.out.println("\nLista de rutinas actualizada:");
        for (Rutina rutina : rutinas) {
            System.out.println(rutina);
        }

        // Eliminar un cliente existente y mostrar la lista de clientes final
        servicioCliente.eliminarCliente(2);
        clientes = servicioCliente.obtenerClientes();
        System.out.println("\nLista de clientes final:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        // Eliminar una rutina existente y mostrar la lista de rutinas final
        servicioRutina.eliminarRutina(1);
        rutinas = servicioRutina.obtenerRutinas();
        System.out.println("\nLista de rutinas final:");
        for (Rutina rutina : rutinas) {
            System.out.println(rutina);
        }
    }

        }
