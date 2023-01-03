/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dal.DALManager;
import java.util.ArrayList;
import model.dto.StudentDTO;
import model.dto.Response;
import model.validators.CommonValidator;

/**
 *
 * @author Mukhtiar
 */
public class OSSController {
    DALManager objDAL;
    public OSSController(){
    objDAL = SMSFactory.getInstanceOfDALManager();
    }

    public ArrayList<StudentDTO> viewStudent(String searchKey) {
        return objDAL.getStudentList(searchKey);
    }

    public Response addStudent(StudentDTO objEmp) {
        Response objResponse = SMSFactory.getResponseInstance();
        CommonValidator.validateEmployee(objEmp,objResponse);
        if(objResponse.isSuccessfull()){
            objDAL.saveStudent(objEmp,objResponse);
        }
        return objResponse;
    }

    public Response deleteStudent(String selectedId) {
        Response objResponse = SMSFactory.getResponseInstance();
        objDAL.deleteStudent(selectedId, objResponse);
        return objResponse;
    }
}
