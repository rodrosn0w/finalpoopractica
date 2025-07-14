package model;

import java.util.Date;
import java.util.List;

public class PrestamoPersonal extends Prestamos {
    public PrestamoPersonal(int idPrestamo, Date fechaOtorgamiento, double montoSolicitado, int plazoMeses, double tasaAnual, Cliente cliente, List<Cuota> prestamos) {
        super(idPrestamo, fechaOtorgamiento, montoSolicitado, plazoMeses, tasaAnual, cliente, prestamos);
    }

    public void emitir(){}
}
