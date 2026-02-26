package sv.edu.udb.controlller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sv.edu.udb.repository.domain.Materia;
import sv.edu.udb.service.MateriaService;
import java.util.List;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {

    private final MateriaService materiaService;

    public MateriaController(MateriaService materiaService) {
        this.materiaService = materiaService;
    }

    @GetMapping
    public List<Materia> obtenerMaterias() {
        return materiaService.obtenerMaterias();
    }

    @GetMapping("/promedio")
    public String obtenerPromedio() {
        Double promedio = materiaService.calcularPromedioGeneral();
        return "Tu promedio general es: " + promedio;
    }
}
