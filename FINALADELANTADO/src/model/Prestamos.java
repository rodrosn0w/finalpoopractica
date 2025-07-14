package model;

import java.util.Date;
import java.util.List;

public abstract class Prestamos {
    private int idPrestamo;
    private Date fechaOtorgamiento;
    private double montoSolicitado;
    private int plazoMeses;
    private double tasaAnual;
    private Cliente cliente;
    private List<Cuota> cuotas;


    public Prestamos(int idPrestamo, Date fechaOtorgamiento, double montoSolicitado, int plazoMeses, double tasaAnual, Cliente cliente, List<Cuota> prestamos) {
        this.idPrestamo = idPrestamo;
        this.fechaOtorgamiento = fechaOtorgamiento;
        this.montoSolicitado = montoSolicitado;
        this.plazoMeses = plazoMeses;
        this.tasaAnual = tasaAnual;
        this.cliente = cliente;
        this.cuotas = prestamos;
    }


    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaOtorgamiento() {
        return fechaOtorgamiento;
    }

    public void setFechaOtorgamiento(Date fechaOtorgamiento) {
        this.fechaOtorgamiento = fechaOtorgamiento;
    }

    public double getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(double montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

    public int getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public double getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(double tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public void setPrestamos(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public void emitir(){
    }

    public void calcularCuotas(){

    }



}
