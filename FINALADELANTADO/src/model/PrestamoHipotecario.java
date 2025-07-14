package model;

import java.util.Date;
import java.util.List;

public class PrestamoHipotecario extends Prestamos {
    private Cliente garante;

    public PrestamoHipotecario(int idPrestamo, Date fechaOtorgamiento, double montoSolicitado, int plazoMeses, double tasaAnual, Cliente cliente, List<Cuota> prestamos) {
        super(idPrestamo, fechaOtorgamiento, montoSolicitado, plazoMeses, tasaAnual, cliente, prestamos);
        this.garante = cliente;
    }

    public Cliente getGarante() {
        return garante;
    }
    public void setGarante(Cliente garante) {
        this.garante = garante;
    }

    public void emitir(){}
}
