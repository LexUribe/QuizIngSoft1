package co.lexdeses.appuniversidades.cotroadores;

import co.lexdeses.appuniversidades.entidades.Universidad;
import co.lexdeses.appuniversidades.servicios.ServiciosUniversidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorUiversidad {
    @Autowired
    ServiciosUniversidad serviciosUniversidad;

    @GetMapping({"/universidad/lista"})
    public String listarUniversidadesModal(Model model) {
        model.addAttribute("listauniversidades", serviciosUniversidad.consultarL());
        for(Universidad universidad : serviciosUniversidad.consultarL()) {
            System.out.println(universidad);
        }
        return "listauniversidades";
    }

    @GetMapping({"/universidad/nuevo"})
    public String cargarUniversidadModal(Model model) {
        Universidad universidadllenar = new Universidad();
        model.addAttribute("universidadllenar", universidadllenar);
        return "formcreauniversidad";
    }

    @PostMapping({"/accioncrear"})
    public String accionCrear(@ModelAttribute("universidadllenar") Universidad universidad) {
        System.out.println(universidad);
        this.serviciosUniversidad.crear(universidad);
        return "redirect:/universidad/lista";
    }
}
