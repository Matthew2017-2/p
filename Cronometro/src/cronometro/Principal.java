/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

import cronometro.logica.Cronometro;
import cronometro.logica.UnidadTiempo;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cronometro c = new Cronometro();
        int x=0;
        Timer timer;
        timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                 if(x==0){
                 if(!c.obtenerTiempo().equals("00 : 02 : 00 : 0")) {
                    c.avanzar();
                    System.out.println(c.obtenerTiempo());
                   
                 }else{
                  x++;
                    
                }
                }
                 
               
            }
        };
        // Empezamos dentro de 0ms y luego lanzamos la tarea cada 100ms

        timer.schedule(task, 0, 1);

//        for (int i = 0; i < 1000; i++) {
//
//            
//            timer.schedule(task, 0, 100);
//            
//            if (i % 100 == 0) {
//                c.guardarMemoria();
//            }
//        }
//        System.out.println("Memorias");
//        c.mostrarMemorias();
//        System.out.println("Retrocediendo");
//       
//         for (int i = 0; i < 1000; i++) {

//            c.retroceder();
//            System.out.println(c.obtenerTiempo());
//        }
   }

}
