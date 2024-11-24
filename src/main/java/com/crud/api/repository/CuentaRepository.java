package src.main.java.com.crud.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.api.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, String> {
}