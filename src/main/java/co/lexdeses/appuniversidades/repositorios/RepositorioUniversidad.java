package co.lexdeses.appuniversidades.repositorios;

import co.lexdeses.appuniversidades.entidades.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUniversidad extends JpaRepository<Universidad, Integer> {
}
