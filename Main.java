import java.util.List;

class Main {
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
