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

        /*
          * Pruebas de la clase Employee
         */

        /*
         * Pruebas de la clase Enterprise
         */
        System.out.println();
        System.out.println("***** PROBANDO LA CLASE Enterprise *****");
        // Instanciando la clase
        Enterprise enterprise = new Enterprise();
        // Modificando el nombre
        enterprise.setName("Empresa prueba 1");
        // Modificando la dirección
        enterprise.setAddress("Medellín Colombia");
        // Modificando el teléfono
        enterprise.setPhone("3105555555");
        // Modificando el Nit
        enterprise.setDocument("1234567");
        // Leyendo nombre
        System.out.println("Empresa: " + enterprise.getName());
        // Leyendo dirección
        System.out.println("Empresa: " + enterprise.getAddress());
        // Leyendo teléfono
        System.out.println("Empresa: " + enterprise.getPhone());
        // Leyendo Nit
        System.out.println("Empresa: " + enterprise.getDocument());
    }

}