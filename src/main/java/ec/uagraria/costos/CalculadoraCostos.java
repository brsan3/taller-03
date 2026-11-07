package ec.uagraria.costos;
import java.util.Optional;
public class CalculadoraCostos {
    private EstrategiaCosto estrategia;
    public CalculadoraCostos() {}
    public CalculadoraCostos(EstrategiaCosto e){this.estrategia=e;}
    public void setEstrategia(EstrategiaCosto e){this.estrategia=e;}
    public Optional<Double> calcular(Lote lote){
        if(estrategia==null||lote==null) return Optional.empty();
        return Optional.of(estrategia.calcular(lote));
    }
}
