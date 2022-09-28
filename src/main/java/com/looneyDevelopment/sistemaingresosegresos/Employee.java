package com.looneyDevelopment.sistemaingresosegresos;

public class Employee {

    private long id;
    private String email;
    private date updateAt;
    private date createAt;
    private int[] Transaction;

    /* Metodo Constructor */
    public Employee(long id, String email, date updateAt, date createAt, int[] transaction) {
        this.id = id;
        this.email = email;
        this.updateAt = updateAt;
        this.createAt = createAt;
        Transaction = transaction;
    }

    /* Metodos Getter And Setter */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(date updateAt) {
        this.updateAt = updateAt;
    }

    public date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(date createAt) {
        this.createAt = createAt;
    }

    public int[] getTransaction() {
        return Transaction;
    }

    public void setTransaction(int[] transaction) {
        Transaction = transaction;
    }
}
