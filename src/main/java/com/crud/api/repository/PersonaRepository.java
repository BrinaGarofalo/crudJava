package src.main.java.com.crud.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.api.Persona;

public interface PersonaRepository extends JpaRepository<Persona, String> {
}