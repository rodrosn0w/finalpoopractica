package model;

public class CuentaCajaAhorro {
    private Cliente cliente;
    private double saldo;
    private String idCuenta;

    public CuentaCajaAhorro(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
        this.idCuenta = idCuenta;
    }

    public void acreditar(double valor) {
        this.saldo += valor;
    }

    public boolean debitar(double valor) {
        this.saldo -= valor;
        return true;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void registrarOpreacion()
}
