package co.lexdeses.appuniversidades.operaciones;

import co.lexdeses.appuniversidades.entidades.Universidad;

import java.util.List;

public interface OperacionesUniversidad {
    public Universidad crear(Universidad universidad);

    public List<Universidad> consultarL();
}
