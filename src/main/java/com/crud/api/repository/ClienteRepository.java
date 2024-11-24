package src.main.java.com.crud.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.api.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
}
