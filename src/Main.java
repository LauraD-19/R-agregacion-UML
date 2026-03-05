public class Main {
    public static void main(String[] args) {

        // Creamos empleados (pueden existir sin el departamento)
        Empleado e1 = new Empleado("Ana", "Desarrolladora");
        Empleado e2 = new Empleado("Luis", "Analista");

        // Creamos un departamento que agrega empleados
        Departamento deptoTI = new Departamento("Tecnología", new Empleado[]{e1, e2});

        // Mostramos la información
        deptoTI.mostrarDepartamento();
        // Los empleados siguen existiendo aunque el departamento no
        System.out.println("\nEmpleado independiente:");
        e1.mostrarInfo();
    }
}