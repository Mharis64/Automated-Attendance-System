/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AAS.Model;

import AAS.dal.DALManager;
import AAS.dal.RecordsMapper;
import AAS.Model.DTO.Response;
import AAS.Model.DTO.StudentData;
import AAS.Model.Validator.CommonValidator;
import java.util.ArrayList;

/**
 *
 * @author OK
 */
public class AASController {
    
    DALManager objDAL;
    public AASController(){
        objDAL =AASFactory.getInstanceOfDALManager();
    }

    public ArrayList<StudentData> viewStudents(String searchKey) {
        return objDAL.getStudentList(searchKey);
    }

    
    
    public Response saveStudents(StudentData objStd) {
        Response objResponse = AASFactory.getResponceInstance();
        CommonValidator.validateStudents(objStd,objResponse);
        if(objResponse.isSuccessfull()){
            objDAL.saveStudents(objStd,objResponse);
        }
        return objResponse;
    }
    
    
  
    public Response deleteStudents(String selectedId) {
        Response objResponse = AASFactory.getResponceInstance();
        objDAL.deleteStudents(selectedId, objResponse);
        return objResponse;
    }
    
    
    
}
