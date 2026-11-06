package ec.uagraria.costos;

public record Insumo(String nombre, double cantidad, String unidad,
                     double precioUnitario) {

    public Insumo {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser vacío");
        }
        if (cantidad < 0 || precioUnitario < 0) {
            throw new IllegalArgumentException("Cantidad y precio >= 0");
        }
    }

    public double costo() {
        return cantidad * precioUnitario;
    }
}
