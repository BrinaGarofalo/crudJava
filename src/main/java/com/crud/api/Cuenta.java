package src.main.java.com.crud.api;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cuenta {
    @Id
    private String numeroCuenta;
    private String tipoCuenta;
    private double saldoInicial;
    private String estado;
}
