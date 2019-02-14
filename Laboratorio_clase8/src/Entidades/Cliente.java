/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author alejo
 */
public class Cliente {
    private Cliente autoriza;
    private Cuenta esPropiedad;
    private int documento;
    private String nombre;
    private Cuenta esBeneficiario;
    
    public Cliente(Cuenta esPropiedad, int documento, String nombre){
        this.documento=documento;
        this.nombre=nombre;
        this.esPropiedad=esPropiedad;
    }

    public Cliente(int documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    
    public Cuenta getEsPropiedad() {
        return esPropiedad;
    }

    public void setEsBeneficiario(Cuenta esBeneficiario) {
        this.esBeneficiario = esBeneficiario;
    }

    public void setEsPropiedad(Cuenta esPropiedad) {
        this.esPropiedad = esPropiedad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setAutoriza(Cliente autoriza) {
        this.autoriza = autoriza;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

