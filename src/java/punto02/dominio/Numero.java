/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto02.dominio;

import java.io.Serializable;

/**
 *
 * @author gabriel
 */
public class Numero implements Serializable{
    private double Numero;

    public Numero(double Numero) {
        this.Numero = Numero;
    }
    public Numero() {
        
    }
    
    public double getNumero() {
        return Numero;
    }

    public void setNumero(double Numero) {
        this.Numero = Numero;
    }  
}
