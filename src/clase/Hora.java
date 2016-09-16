/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import javax.swing.JOptionPane;

/**
 *
 * @author pared
 */
public class Hora 
{
    private int horas;
    private int minutos;
    private int segundos;
    
    public Hora (int horas, int minutos, int segundos)
    {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public Hora ()
    {
        this.horas= 0;
        this.minutos=0;
        this.segundos=0;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public String Validar ()
    {
       String aux;
        if (this.getHoras()>24 || this.getMinutos()>60 || this.getSegundos()>60)
        {
            aux = "La Hora1 que ingreso no es correcta";
        }
        else 
        {
            aux = "La Hora1 es correcta";
        }
        
        return aux;
    }
    
    public String Validar2 (int hora2, int minutos2, int segundos2)
    {
        String aux;
        if (hora2 > 24 || minutos2 > 60 || segundos2 >60)
        {
            aux = "La hora2 que ingreso no es correcta";
        }
        else 
        {
            aux = "La hora2 es correcta";
        }
        
        return aux;
    }
    
    public String Igual (int hora2, int minutos2, int segundos2)
    {
        String aux;
        if (this.getHoras() == hora2 && this.getMinutos() == minutos2 && this.getSegundos() == segundos2 )
        {
          aux  = "Las horas son las mismas";
        }
        else
        {
            aux = "Las horas no son las mismas";
        }
        
        return aux;
    }
    
    public String MayorQue (int hora2, int minutos2, int segundos2)
    {
        String aux;
        if (this.getHoras()>hora2 && this.getMinutos()>minutos2 && this.getSegundos()>segundos2)
        {
            aux = "La Hora1 es mayor que la Hora2";
        }
        else 
        {
            aux = "La Hora2 es mayor que la Hora1";
        }
        
        return aux;
    }
    
    public String MenorQue (int hora2, int minutos2, int segundos2)
    {
        String aux;
        
        if (this.getHoras()<hora2 && this.getMinutos()<minutos2 && this.getSegundos()<segundos2)
        {
            aux= "La Hora1 es menor que la Hora 2";
        }
        else
        {
            aux= "La Hora2 es menor que la Hora1";
        }
        
        return aux;
    }
    
    public String Mostrar (int hora2, int minutos2, int segundos2)
    {
        String aux;
        aux = "Hora 1: " +  this.getHoras() + " : " + this.getMinutos() + " : " + this.getSegundos() + "\n\n"
            + "Hora 2: " + hora2 + " : " + minutos2 + " : " + segundos2;
        return aux;    
    }
    
    
}
