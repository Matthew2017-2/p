/*
 * ClaseUnidadTiempo.java
 * 2018
 */
package cronometro.logica;

/**
 *La clase UnidadTiempo permite generar los atributos que seran utilizados por todas las clases del proyecto.
 * @author Estudiantes
 */
public class UnidadTiempo {

    private int tope;
    private int valor;

    /**
     * Constructor de la clase
     * @param tope 
     */
    public UnidadTiempo(int tope) {
        this.tope = tope;
        this.valor = 0;
    }
    /**
     * recibe el tope que sera establecido en las clases agregadas.
     * @return 
     */

    public int getTope() {
        return tope;
    }
    /**
     * setea el tope para que las clases agregadas lo establezcan.
     * @param tope 
     */
    public void setTope(int tope) {
        this.tope = tope;
    }
    /**
     * recibe el valor que sera establecido en las clases agregadas.
     * @return 
     */

    public int getValor() {
        return valor;
    }
    /**
     * setea el valor para que las clases agregadas lo establezcan.
     * @param valor 
     */

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    /**
     * operacion obtenerValorFormateado
     * @return 
     */
    public String obtenerValorFormateado() {
        if (this.valor < 10 && this.tope > 10) {
            return "0" + this.valor;
        } else {
            return String.valueOf(this.valor);
        }
    }
    /**
     * operacion avanzar 
     */

    public void avanzar() {
        valor++;
        if (valor == tope) {
            valor = 0;
        }
    }
    /**
     * operacion reroceder
     */
    public void retroceder(){
        valor--;
        if(valor < 0){
            valor = tope - 1;
        }
    }

}
