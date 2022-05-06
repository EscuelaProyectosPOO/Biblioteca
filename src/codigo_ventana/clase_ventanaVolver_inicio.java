
package codigo_ventana;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import libreria.ventana_menu;



public class clase_ventanaVolver_inicio extends  WindowAdapter{//cvlase aadaptadora, y implementa los metodos de la plantailla y nosotros llamamos al que necesitamos
/*
    Esta clase llama a  al aventana de inicio donde decidimos jugar o no, todo esto
    cuando el jugador decida cerrar la ventana en la que se encuentra en ese momento
 */

    public void windowClosing(WindowEvent e){

        new ventana_menu().setVisible(true);
    }
 
    
}

