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
public class Cuenta {
    private Cliente dueno;
    private String numero;
    private int saldo;

    public Cuenta(String numero,int saldo, Cliente dueno){
        this.dueno=dueno;
        this.numero=numero;
        this.saldo=saldo;
    }

    public Cliente getDueno() {
        return dueno;
    }

    public void setDueno(Cliente dueno) {
        this.dueno = dueno;
    }

    public Cuenta(String numero, int saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
}
