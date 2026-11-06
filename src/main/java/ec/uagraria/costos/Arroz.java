package ec.uagraria.costos;

public record Arroz(int ciclosPorAnio) implements Cultivo {
    public Arroz {
        if (ciclosPorAnio <= 0) throw new IllegalArgumentException("ciclos > 0");
    }
    @Override public String nombreComun() {
        return "Arroz (" + ciclosPorAnio + " ciclos/año)";
    }
}
