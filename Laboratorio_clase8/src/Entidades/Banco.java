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
public class Banco {
       public static void main(){
           Cliente nuo=new Cliente(100,"J");
           Cuenta nei=new Cuenta("C99",5000,nuo);
           nuo.setEsPropiedad(nei);
           Cuenta benef=new Cuenta("C80",8000);
           nuo.setEsBeneficiario(benef);
           Cliente aut=new Cliente(200,"K");
           nuo.setAutoriza(aut);
       }
}
