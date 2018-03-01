/*
 * ClasePrincipal.java
 * 2018
 * 
 */
package cronometro;

import cronometro.logica.Cronometro;
import cronometro.logica.UnidadTiempo;
import java.util.Timer;
import java.util.TimerTask;

/**
 * La clase Principal permite la interaccion del usuario con el programa.
 * @version 1.0
 * @author Estudiantes
 */
public class Principal {

    public static Timer timer;
    
    public static void main(String[] args) {
        
        Cronometro c = new Cronometro();
       
        timer = new Timer();
        
        /**
         * constructor de la clase TimerTask 
    
         */

        TimerTask task = new TimerTask() {
            
        @Override
        
        /**
         * operacion run: se encarga de crear un temporizador para mostrar los resultados del cronometro
         */
        
            public void run() {
                
                if(!c.obtenerTiempo().equals("00 : 02 : 00 : 0")) {
                    c.avanzar();
                    System.out.println(c.obtenerTiempo());
                }
                
                else {
                    timer.cancel();
                    
                }
                
            }

        };
        
        
       
        // Empezamos dentro de 0ms y luego lanzamos la tarea cada 100ms

        timer.schedule(task, 0, 1);
        
        /*
        
        public void update() {
        TimerTask timerTask = new TimerTask() {

            @Override
            public void run() {
                System.out.println("Updated timer");

            }
        };
        timer.cancel();
        timer = new Timer();
        timer.schedule(timerTask, 2000);
        }
        */
       

         for (int i = 0; i < 1000; i++) {
                

                    if (i % 100 == 0) {
                        c.guardarMemoria();
                    }
                }
         
       
        c.mostrarMemorias();
        
        
       
        /*
        for (int i = 0; i < 1000; i++) {

            c.retroceder();
            System.out.println(c.obtenerTiempo());
        }
        */
   }

}

