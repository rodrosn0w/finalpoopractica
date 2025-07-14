package controller;

import dto.PrestamoPersonalDTO;
import model.PrestamoPersonal;
import model.Prestamos;

import java.util.ArrayList;
import java.util.List;

public class PrestamosController {
    private static PrestamosController INSTANCE = null;

    private List<Prestamos> prestamos;

    private PrestamosController() {
        prestamos = new ArrayList<Prestamos>();
    }

    public static synchronized PrestamosController getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PrestamosController();
        }
        return INSTANCE;
    }

    public void altaPrestamoPersonal(PrestamoPersonalDTO ppdto){
        for (Prestamos p: prestamos) {
            if(p instanceof PrestamoPersonal){
                PrestamoPersonal pp = (PrestamoPersonal)p;
                if(pp.getIdPrestamo() == ppdto.getIdPrestamo() ){
                    System.out.println("El prestamo ya existe");
                    return;
                }
            }

        }
        PrestamoPersonal prestamop = toModel(ppdto);
        prestamos.add(prestamop);
        prestamop.emitir();
    }

    private static PrestamoPersonal toModel(PrestamoPersonalDTO ppDTO){
        return new PrestamoPersonal(
                ppDTO.getIdPrestamo(),
                ppDTO.getFechaOtorgamiento(),
                ppDTO.getMontoSolicitado(),
                ppDTO.getPlazoMeses(),
                ppDTO.getTasaAnual(),
                ppDTO.getCliente(),
                ppDTO.getCuotas());
    }


}
