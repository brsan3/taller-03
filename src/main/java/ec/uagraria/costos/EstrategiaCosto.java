package ec.uagraria.costos;

@FunctionalInterface
public interface EstrategiaCosto {
    double calcular(Lote lote);
}
