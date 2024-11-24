package src.main.java.com.crud.api;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
    private String nombre;
    private String genero;
    private int edad;
    @Id
    private String identificacion;
    private String direccion;
    private String telefono;
}
