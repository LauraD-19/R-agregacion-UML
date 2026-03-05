public class Empleado {
    private String nombre;
    private String puesto;

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " - Puesto: " + puesto);
    }
}
