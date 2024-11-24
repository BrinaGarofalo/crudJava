package src.main.java.com.crud.api;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movimiento {
    @Id
    private Date fecha;
    private String tipoMovimiento;
    private double valor;
    private double saldo;
}
