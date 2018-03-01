/*
 * ClaseMemoria.java
 * 2018
 */
package cronometro.logica;

/**
 * La clase Memoria permite guardar las unidades de tiempo trabaja con la clase Cronometro
 * @version 1.0
 * @author Estudiantes
 */
public class Memoria {
    private UnidadTiempo decimas;
    private UnidadTiempo segundos;
    private UnidadTiempo minutos;
    private UnidadTiempo horas;

    /**
     * constructor de la clase Memoria.
     */
    public Memoria() {
        decimas = new UnidadTiempo(10);
        segundos = new UnidadTiempo(60);
        minutos = new UnidadTiempo(60);
        horas = new UnidadTiempo(24);
    }  
    /**
     * Setea el valor decimas valor para que sea automaticamente ingresado por el cronometro.
     * @param valor 
     */
    public void setValorDecimas(int valor){
        decimas.setValor(valor);
    }
    /**
     * Setea el valor segundos valor para que sea automaticamente ingresado por el cronometro.
     * @param valor 
     */
    
    public void setValorSegundos(int valor){
        segundos.setValor(valor);
    }
    /**
     * Setea el valor minutos valor para que sea automaticamente ingresado por el cronometro.
     * @param valor 
     */
    
    public void setValorMinutos(int valor){
        minutos.setValor(valor);
    }
    /**
     * Setea el valor horas valor para que sea automaticamente ingresado por el cronometro.
     * @param valor 
     */
    
    public void setValorHoras(int valor){
        horas.setValor(valor);
    }
    /**
     * operacion obtenerTiempo
     * 
     */
    
    public String obtenerTiempo(){
        return horas.obtenerValorFormateado()+ " : " +
                minutos.obtenerValorFormateado()+ " : " +
                segundos.obtenerValorFormateado()+ " : " +
                decimas.obtenerValorFormateado();
    }
    
        
}
