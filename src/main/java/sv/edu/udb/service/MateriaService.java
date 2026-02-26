package sv.edu.udb.service;


import org.springframework.stereotype.Service;
import sv.edu.udb.repository.MateriaRepository;
import sv.edu.udb.repository.domain.Materia;
import java.util.List;

@Service
public class MateriaService {

    private final MateriaRepository materiaRepository;


    public MateriaService(MateriaRepository materiaRepository) {
        this.materiaRepository = materiaRepository;
    }


    public List<Materia> obtenerMaterias() {
        return materiaRepository.findAll();
    }


    public Double calcularPromedioGeneral() {
        List<Materia> materias = materiaRepository.findAll();

        if (materias.isEmpty()) {
            return 0.0;
        }

        Double suma = 0.0;
        for (Materia materia : materias) {
            suma += materia.getNota();
        }

        return suma / materias.size();
    }
}

