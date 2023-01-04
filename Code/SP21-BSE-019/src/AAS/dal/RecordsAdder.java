/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AAS.dal;

import AAS.Model.DTO.Message;
import AAS.Model.DTO.MessageType;
import AAS.Model.DTO.Response;
import AAS.Model.DTO.StudentData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OK
 */
public class RecordsAdder {
    
    void registerStudent(StudentData objstd, Response objResponce, Connection dbConnection) {
        try {
            PreparedStatement p = dbConnection.prepareStatement("INSERT INTO students" +  "(FirstName,LastName,Course,CNIC,Email)"  + ""
                    + "                          VALUES (?,?,?,?,?);");
            p.setString(1, objstd.FirstName);
            p.setString(2, objstd.LastName);
            p.setString(3,objstd.Course);
            p.setString(4,objstd.CNIC);
            p.setString(5,objstd.Email);
                           
            int rowsInserted = p.executeUpdate();
            if(rowsInserted > 0){
                objResponce.messagesList.add(new Message("Students added successfully.",
                        MessageType.Information));
                
            }
            
        } catch (SQLException ex) {
              objResponce.messagesList.add(new Message("Ooops! Failed to create Student, Please contact support that there an issue while registering new student.", MessageType.Error));
            objResponce.messagesList.add(new Message(ex.getMessage() + "\n Stack Track:\n"+ex.getStackTrace(), MessageType.Exception));
       
            Logger.getLogger(RecordsAdder.class.getName()).log(Level.SEVERE, null, ex);
        }
     

    }

}
