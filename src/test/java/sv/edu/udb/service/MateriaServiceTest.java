package sv.edu.udb.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sv.edu.udb.repository.domain.Materia;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MateriaServiceTest {

    @Autowired
    private MateriaService materiaService;

    @Test
    void testNotNull() {
        List<Materia> materias = materiaService.obtenerMaterias();
        assertNotNull(materias);
    }

    @Test
    void testCalcuCorrecto() {
        Double promedio = materiaService.calcularPromedioGeneral();


        Double sumaEsperada = 8.5 + 9.0 + 7.8 + 8.2 + 9.5;
        Double promedioEsperado = sumaEsperada / 5;

        assertEquals(promedioEsperado, promedio, 0.01);
    }
}
