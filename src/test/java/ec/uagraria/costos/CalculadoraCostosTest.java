package ec.uagraria.costos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
class CalculadoraCostosTest {
    private Lote loteBanano() {
        return new Lote("L-01", new Banano("Cavendish"), 4.0, List.of(
                new Insumo("Urea 50 kg", 12, "saco", 32.50),
                new Insumo("Fungicida", 8, "litro", 21.75),
                new Insumo("Semilla certificada", 1, "lote", 180.00)));
    }
    @Test void costoDirectoSumaLosInsumos() {
        var calc = new CalculadoraCostos(Estrategias.costoDirecto());
        assertEquals(744.00, calc.calcular(loteBanano()).orElseThrow(), 0.01);
    }
    @Test void sinEstrategiaDevuelveOptionalVacio() {
        assertTrue(new CalculadoraCostos().calcular(loteBanano()).isEmpty());
    }
}