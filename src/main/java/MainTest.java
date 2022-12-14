import com.looneyDevelopment.sistemaingresosegresos.entities.Employee;
import com.looneyDevelopment.sistemaingresosegresos.entities.Enterprise;
import com.looneyDevelopment.sistemaingresosegresos.entities.Transaction;

public class MainTest {
    public static void main(String[] args) {
        /*
          * Pruebas de la clase Transaction
         */
        System.out.println("***** PROBANDO LA CLASE Transaction *****");
        // Instanciando la clase
        Transaction transaction = new Transaction();
        // Modificando el concepto
        transaction.setConcept("Creando monto positivo...");
        // Modificando y creando monto positivo
        transaction.setAmount(10000F);
        // Leyendo concepto y monto
        System.out.println(transaction.getConcept() + transaction.getAmount());
        // Modificando concepto
        transaction.setConcept("Creando monto negativo...");
        // Modificando y creando monto negativo
        transaction.setAmount(-25000F);
        // Leyendo concepto y monto
        System.out.println(transaction.getConcept() + transaction.getAmount());



        //Pruebas de la clase Employee
        System.out.println("\n");
        System.out.println("******************************************");
        System.out.println("***** PROBANDO LA CLASE Employee *****");
        // Instanciando la clase
        Employee employee  = new Employee();
        // Modificando el nombre
        employee.setNombre("Miguel Betancourt B");
        // Modificando el roll
        employee.setRol("Desarrollador Scrum");
        // Modificando el Id
        //employee.setId_Empleado();
        // Modificando el correo
        employee.setCorreo("workingbeta01@gmail.com");

        // Leyendo nombre
        System.out.println("Nombre: "+ employee.getNombre());
        // Leyendo roll
        System.out.println("Roll de " + employee.getNombre() + ": " + employee.getRol());
        // Leyendo Id
        System.out.println("Id de " + employee.getNombre() + ": " + employee.getId_Empleado());
        // Leyendo correo
        System.out.println("Correo de " + employee.getNombre() + ": " + employee.getCorreo());
        System.out.println("******************************************");



        /*
         * Pruebas de la clase Enterprise
         */
        System.out.println();
        System.out.println("***** PROBANDO LA CLASE Enterprise *****");
        // Instanciando la clase
        Enterprise enterprise = new Enterprise();
        // Modificando el nombre
        enterprise.setName("Empresa prueba 1");
        // Modificando la direcci??n
        enterprise.setAddress("Medell??n Colombia");
        // Modificando el tel??fono
        enterprise.setPhone("3105555555");
        // Modificando el Nit
        enterprise.setDocument("1234567");
        // Leyendo nombre
        System.out.println("Empresa: " + enterprise.getName());
        // Leyendo direcci??n
        System.out.println("Empresa: " + enterprise.getAddress());
        // Leyendo tel??fono
        System.out.println("Empresa: " + enterprise.getPhone());
        // Leyendo Nit
        System.out.println("Empresa: " + enterprise.getDocument());
    }

}