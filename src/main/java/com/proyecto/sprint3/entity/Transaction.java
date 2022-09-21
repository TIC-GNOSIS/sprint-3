package com.proyecto.sprint3.entity;



import javax.persistence.*;


@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Float montoDelMovimiento;
    private String conceptoDelMovimiento;

    public Transaction() {

    }

    public Transaction(Long id, Float montoDelMovimiento, String conceptoDelMovimiento) {
        this.id = id;
        this.montoDelMovimiento = montoDelMovimiento;
        this.conceptoDelMovimiento = conceptoDelMovimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getMontoDelMovimiento() {
        return montoDelMovimiento;
    }

    public void setMontoDelMovimiento(Float montoDelMovimiento) {
        this.montoDelMovimiento = montoDelMovimiento;
    }

    public String getConceptoDelMovimiento() {
        return conceptoDelMovimiento;
    }

    public void setConceptoDelMovimiento(String conceptoDelMovimiento) {
        this.conceptoDelMovimiento = conceptoDelMovimiento;
    }

    public void  montos(){
        if(montoDelMovimiento < 0){
            System.out.println("monto positivo");
        }else{
            System.out.println("monto negativo");
        }

    }
}
