package ec.uagraria.costos;

import java.util.List;

public record Lote(String codigo, Cultivo cultivo, double hectareas,
                   List<Insumo> insumos) {

    public Lote {
        if (codigo == null || codigo.isBlank())
            throw new IllegalArgumentException("Código no puede ser vacío");
        if (cultivo == null)
            throw new IllegalArgumentException("Cultivo no puede ser nulo");
        if (hectareas <= 0)
            throw new IllegalArgumentException("Hectáreas > 0");
        if (insumos == null)
            throw new IllegalArgumentException("Insumos no puede ser nulo");
        insumos = List.copyOf(insumos); // copia defensiva inmutable
    }

    public double costoInsumos() {
        double total = 0.0;
        for (Insumo i : insumos) { total += i.costo(); }
        return total;
    }

    public int jornalesPorHectarea() {
        return switch (cultivo) {
            case Banano b -> 18;
            case Cacao c when c.organico() -> 25; // ¡el más específico primero!
            case Cacao c -> 20;
            case Arroz a -> 12 * a.ciclosPorAnio();
        }; // sin default: la jerarquía sellada ya está completa
    }
}
