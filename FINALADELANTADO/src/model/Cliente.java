package model;

public class Cliente {
    private String documento;
    private String nombre;
    private String apellido;
    private String domicilio;
    private int numeroCliente;
    private CuentaCajaAhorro cuentaCaja;


    public Cliente(String documento, String nombre, String apellido, String domicilio, int numeroCliente) {

        if (numeroCliente < 1000) {
            throw new IllegalArgumentException("El número de cliente debe ser mayor o igual a 1000.");
        }

        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.numeroCliente = numeroCliente;
        this.cuentaCaja = new CuentaCajaAhorro(this) {
        };
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public CuentaCajaAhorro getCuentaCaja() {
        return cuentaCaja;
    }

    public void setCuentaCaja(CuentaCajaAhorro cuentaCaja) {
        this.cuentaCaja = cuentaCaja;
    }


}
