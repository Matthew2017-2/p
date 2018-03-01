/*
 * ClaseCronometro.java
 * 2018
 */
package cronometro.logica;

import java.util.ArrayList;

/**
 * La clase Cronometro permite generar un objeto que cumpla la funcion de contar y guardar el tiempo durante un periodo determinado.
 * @version 1.0
 * @author Estudiantes
 */
public class Cronometro {

    private UnidadTiempo decimas;
    private UnidadTiempo segundos;
    private UnidadTiempo minutos;
    private UnidadTiempo horas;

    private ArrayList<Memoria> memorias;
    
    /**
     * constructor de la clase Cronometro
     */

    public Cronometro() {
        decimas = new UnidadTiempo(10);
        segundos = new UnidadTiempo(60);
        minutos = new UnidadTiempo(60);
        horas = new UnidadTiempo(24);
        memorias = new ArrayList<Memoria>();
    }
    
    /**
     * Setters y Getters de los atributos agregados de Unidad de Tiempo
    */

    public UnidadTiempo getDecimas() {
        return decimas;
    }

    public void setDecimas(UnidadTiempo decimas) {
        this.decimas = decimas;
    }

    public UnidadTiempo getSegundos() {
        return segundos;
    }

    public void setSegundos(UnidadTiempo segundos) {
        this.segundos = segundos;
    }

    public UnidadTiempo getMinutos() {
        return minutos;
    }

    public void setMinutos(UnidadTiempo minutos) {
        this.minutos = minutos;
    }

    public UnidadTiempo getHoras() {
        return horas;
    }

    public void setHoras(UnidadTiempo horas) {
        this.horas = horas;
    }
    
    /**
     * operacion avanzar
     */

    public void avanzar() {
        decimas.avanzar();
        if (decimas.getValor() == 0) {
            segundos.avanzar();
            if (segundos.getValor() == 0) {
                minutos.avanzar();
                if (minutos.getValor() == 0) {
                    horas.avanzar();
                }
            }
        }
    }
    
    /**
     * operacion retroceder
     */
    
    public void retroceder(){
        decimas.retroceder();
        if(decimas.getValor()==decimas.getTope()-1){
            segundos.retroceder();
            if(segundos.getValor()==segundos.getTope()-1){
                minutos.retroceder();
                if(minutos.getValor()==minutos.getTope()-1){
                    horas.retroceder();
                }
            }
        }
    }
    
    /**
     * operacion obtenerTiempo
     */

    public String obtenerTiempo() {
        return horas.obtenerValorFormateado() + " : "
                + minutos.obtenerValorFormateado() + " : "
                + segundos.obtenerValorFormateado() + " : "
                + decimas.obtenerValorFormateado();
    }
    
    /**
     * operacion guardarMemoria
     */

    public void guardarMemoria() {
        Memoria m = new Memoria();
        
        m.setValorDecimas(decimas.getValor());
        m.setValorSegundos(segundos.getValor());
        m.setValorMinutos(minutos.getValor());
        m.setValorHoras(horas.getValor());
        
        memorias.add(m);
        
    }
    
    /**
     * operacion mostrarMemorias
     */

    public void mostrarMemorias() {
        for (Memoria memoria : memorias) {
            System.out.println("memoria : " + memoria.obtenerTiempo());
        }
    }

}
