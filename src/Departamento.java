public class Departamento {
    private String nombreDepto;
    private Empleado[] empleados;

    public Departamento(String nombreDepto, Empleado[] empleados) {
        this.nombreDepto = nombreDepto;
        this.empleados = empleados; // Relación de agregación
    }
    public void mostrarDepartamento() {
        System.out.println("Departamento: " + nombreDepto);
        System.out.println("Lista de empleados:");
        for (Empleado e : empleados) {
            e.mostrarInfo();
        }
    }
}
