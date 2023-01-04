/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.AAS_Validator;

import model.dto.MessageType;
import model.dto.Response;
import model.AAS_Creator;
import model.dto.AttendanceRecordDTO;
/**
 *
 * @author Waleed
 */
public class CommonValidator {
        public static void validateAttendanceRecord(AttendanceRecordDTO objAtd, Response objResponse) {
        if(objAtd.Firstname == null || objAtd.Firstname.length() < 3){
            objResponse.messagesList.add(AAS_Creator.getInstanceOF_Message("name not found",MessageType.Error));
        }
        // Todo validate the rest
    }
}
