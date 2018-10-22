package tictactoe;

import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Main {
    
    public static void main (String Args[]) throws IOException {
        
       
        /*Instanciamos un nuevo tablero y luego una nueva ventana
        porque la ventana necesita del tablero para poder definir
        los objetos que va a mostrar
        */
        
        Table newTable = new Table();
        MyWindow newWindow = new MyWindow(newTable);
        newWindow.setVisible(true);
        
        /* Instanciamos el dragger que nos permite mover la ventana
        con el diseño actual sin barra superior.
        */
        Dragger newDragger = new Dragger(newWindow);
        newWindow.addMouseListener(newDragger);
        newWindow.addMouseMotionListener(newDragger);

    }   
}