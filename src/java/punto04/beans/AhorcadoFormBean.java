/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto04.beans;

import punto04.dominio.Ahorcado;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author gabriel
 */
@ManagedBean
@RequestScoped
public class AhorcadoFormBean {
    private static ArrayList<Ahorcado> letra = new ArrayList<Ahorcado>(){};
    private Ahorcado cad;
    private String cadena="vacio";
    private char caracter = '-';
    private static int Numintento = 5;
    /**
     * Creates a new instance of AhorcadoFormBean
     */
    public AhorcadoFormBean() {
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public int getNumintento() {
        return Numintento;
    }

    public void setNumintento(int Numintento) {
        this.Numintento = Numintento;
    }
    
    
    public void agregarLista (){
        if (cadena.contains("vacio")){
            
        }else{
            for (int i=0;i<cadena.length();i++){
                cad = new Ahorcado(cadena.charAt(i),'_');
                letra.add(cad);          
            }  
            cadena="";
        }
        
    }
    
    public String mostrarCadena (){
        String cadena1 = "";
        for (int i=0; i<=letra.size()-1;i++){
            cadena1 = cadena1 + letra.get(i).getGuion()+ " ";
        }
     return cadena1;
    }
    
    public void verificacionCaracter(){
        boolean bandera = false;
        if (!cadena.contains("vacio")){
        
            for (int i=0; i<=letra.size()-1;i++){
                if (letra.get(i).getLetra()==caracter){
                    letra.get(i).setGuion(caracter);
                        bandera = true;
                }
            }    
            if (bandera == false ){
                this.Numintento = this.Numintento - 1;
            }
        }   
    }
}

