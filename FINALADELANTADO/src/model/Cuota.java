package model;

import java.time.LocalDate;

public class Cuota {
    private int numero;
    private double monto;
    private LocalDate vencimiento;
    private boolean pagada;

    public Cuota(int numero, double monto, LocalDate vencimiento) {
        this.numero = numero;
        this.monto = monto;
        this.vencimiento = vencimiento;
        this.pagada = false;
    }

    public void pagar() {
        this.pagada = true;
    }

    public boolean estaPagada() {
        return pagada;
    }
}
