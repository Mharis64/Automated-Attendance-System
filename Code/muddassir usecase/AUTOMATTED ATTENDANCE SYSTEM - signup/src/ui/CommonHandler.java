/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.dto.Response;

/**
 *
 * @author Mukhtiar-HPC
 */
public class CommonHandler {

    static void handleResponse(Response objResponse,JComponent uiComponent) {
        if(objResponse.hasError()){
            if(uiComponent instanceof JLabel){
                ((JLabel)uiComponent).setText(objResponse.getErrorMessages());
                ((JLabel)uiComponent).setForeground(Color.RED);
            }
        }
    }
     static String handleException (Date err , JFrame ui){
         try{
             String format = new SimpleDateFormat("yyyy-MM-dd").format(err);
             return format;
         } catch( NullPointerException e ){
          JOptionPane.showConfirmDialog(ui, "datedhould no be null" , "Null" ,1);
         }
         return "";
     }
    
}
