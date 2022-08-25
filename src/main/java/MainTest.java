import com.looneyDevelopment.sistemaingresosegresos.entities.Transaction;

public class MainTest {
    public static void main(String[] args) {
        /*
          * Pruebas de la clase Transaction
         */
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
    }

}