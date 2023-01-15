/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AAS.dal;

import AAS.Model.DTO.Message;
import AAS.Model.DTO.MessageType;
import AAS.Model.DTO.Response;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author OK
 */
public class RecordsModifier {
   public void deleteStudents(String selectedId, Response objResponse, Connection dbConnection) {
        try{
            PreparedStatement p;// (FirstName,LastName) VALUES (?,?);");
            p = dbConnection.prepareStatement("delete from Student where CNIC=?");
            p.setString(1, selectedId);
            int rowsInserted = p.executeUpdate();
            if(rowsInserted > 0){
                objResponse.messagesList.add(new Message("Student deleted successfully.", 
                        MessageType.Information));
            }
        }catch(SQLException e){
            objResponse.messagesList.add(new Message("Ooops! Failed to delete student, "
                    + "Please contact support that there an issue while delete student.", 
                    MessageType.Error));
            objResponse.messagesList.add(new Message(e.getMessage() + "\n Stack Track:\n"+e.getStackTrace(), 
                    MessageType.Exception));
        }
    }
    
    
}
