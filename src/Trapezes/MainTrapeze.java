/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trapezes;

import Main.FramePpal;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author agustin
 */
public class MainTrapeze {
    private static ArrayList<Trapeze> trapecios= new ArrayList<>();
    public static TrapezeWindow ventana;

    
    public MainTrapeze(JFrame frame){
        ventana=new TrapezeWindow();
        ventana.setBounds(0, 0, 1000, 520);
        ventana.setVisible(false);

        frame.add(ventana);
    }
    public static void agregarTrapecio(Trapeze trap){
		
		trapecios.add(trap);
		
		ventana.graficarChart(Trapeze.graficarTrapecios(trapecios));
    }
}
