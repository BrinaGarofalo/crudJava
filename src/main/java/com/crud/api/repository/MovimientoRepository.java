package src.main.java.com.crud.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.api.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, String> {
}
