package src.main.java.com.crud.api;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente extends Persona  {
    @Id
    private String clienteId;
    private String contrasena;
    private String estado;
}
