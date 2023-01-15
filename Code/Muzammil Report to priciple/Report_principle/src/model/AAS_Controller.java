/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author Waleed
 */
import model.SMSFactory;
import java.util.ArrayList;
import model.dto.AttendanceRecordDTO;
import dal.DAL_Manager;
import model.dto.Response;
import model.AAS_Validator.CommonValidator;
public class AAS_Controller {
    
    DAL_Manager objDAL = AAS_Creator.getInstanceOF_DAL_Manager();
      public ArrayList<AttendanceRecordDTO> CheckAttendanceList(String searchKey) {
        return objDAL.getAttendanceList(searchKey);
    }

    public Response CheckAttendanceList(AttendanceRecordDTO objteacher) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
    
      public Response addRecords(AttendanceRecordDTO objEmp) {
        Response objResponse = SMSFactory.getResponseInstance;
        CommonValidator.validateAttendanceRecord(objEmp,objResponse);
        if(objResponse.isSuccessfull()){
            objDAL.saveAttendance(objEmp,objResponse);
        }
        return objResponse;
    }
    
    
}
