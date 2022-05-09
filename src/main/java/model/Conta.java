package model;

import javax.persistence.Embeddable;
import javax.persistence.Column;



@Embeddable
public class Conta {
    @Column(name = "conta_numero")
    private Long numero;

    @Column(name = "conta_saldo")
    private Double saldo;
    public Long gêtNumero(){
        return numero;
    }
    public void setNumero(Long numero){
        this.numero=numero;
    }
    public Double getSaldo(){
        return saldo;
    }
    public void setSaldo(Double saldo){
        this.saldo=saldo;
    }
}
