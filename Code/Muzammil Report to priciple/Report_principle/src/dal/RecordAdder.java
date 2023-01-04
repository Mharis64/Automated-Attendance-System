/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.dto.Response;
import model.dto.AttendanceRecordDTO;
import model.AAS_Creator;
import model.dto.MessageType;
/**
 *
 * @author Waleed
 */
public class RecordAdder {
    public void saveAttendanceRecord(AttendanceRecordDTO objTeacher, Response objResponse, Connection dbConnection) {
        try{
            PreparedStatement p = dbConnection.prepareStatement("INSERT INTO ATD (Reg#,Firstname,LastName,Totalclasses,Abesentees,Presents) VALUES (?,?,?,?,?,?);");
            p.setString(1, objTeacher.id);
            p.setString(2, objTeacher.Firstname);
            p.setString(3, objTeacher.Lastname);
            p.setString(4, objTeacher.Absent);
            p.setString(4, objTeacher.classes);
            p.setString(4, objTeacher.Present);
            int rowsInserted = p.executeUpdate();
            if(rowsInserted > 0){
                objResponse.messagesList.add(AAS_Creator.getInstanceOF_Message("Record add Successfully.", MessageType.Information));
            }
        }catch(SQLException e){
            objResponse.messagesList.add(AAS_Creator.getInstanceOF_Message("Ooops! Failed to Donate Blood, Please contact support that there an issue while saving Donating Blood.", MessageType.Error));
            objResponse.messagesList.add(AAS_Creator.getInstanceOF_Message(e.getMessage() + "\n Stack Track:\n"+e.getStackTrace(), MessageType.Exception));
        }
    }
}
