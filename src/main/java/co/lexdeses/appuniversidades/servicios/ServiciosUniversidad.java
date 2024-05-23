package co.lexdeses.appuniversidades.servicios;

import co.lexdeses.appuniversidades.entidades.Universidad;
import co.lexdeses.appuniversidades.operaciones.OperacionesUniversidad;
import co.lexdeses.appuniversidades.repositorios.RepositorioUniversidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosUniversidad implements OperacionesUniversidad {
    @Autowired
    RepositorioUniversidad repositorioUniversidad;

    @Override
    public Universidad crear(Universidad universidad) {
        return repositorioUniversidad.save(universidad);
    }

    @Override
    public List<Universidad> consultarL() {
        return repositorioUniversidad.findAll();
    }
}
