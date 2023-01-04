/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AAS.dal;

import AAS.Model.DTO.Message;
import AAS.Model.DTO.Response;
import AAS.Model.DTO.StudentData;
import AAS.Model.AASFactory;
import AAS.Model.DTO.MessageType;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author OK
 */
public class DALManager {

    IConnection objConnection;
    DBReader objReader;
    RecordsMapper objMapper;
    RecordsAdder objAdder;
    RecordsModifier objModifier;

    public DALManager(RecordsMapper mapper) {
        objConnection = new SqlConnection("sa", "master", "sa", "mhd555ss");
        objReader = new DBReader();
        objAdder = AASFactory.getInstanceOfAdder();
        this.objMapper = mapper;
        objModifier = new RecordsModifier();
    }


    public ArrayList<StudentData> getStudentList(String searchKey) {

        Connection dbConnection = objConnection.getConnection();
        String viewStudentQuery = "Select * from students";
        if (searchKey == null || searchKey.length() > 0) {
            viewStudentQuery += " where FirstName LIKE '%" + searchKey + "%' OR LastName LIKE '%" +
                    searchKey + "%' OR Course LIKE '%" + searchKey + "%';";
        }
        ResultSet rs = objReader.getRecords(viewStudentQuery, dbConnection);
        return objMapper.getStudents(rs);
    }

    public void saveStudents(StudentData objStd, Response objResponse) {
        try {
            Connection dbConnection = objConnection.getConnection();
            objAdder.registerStudent(objStd, objResponse, dbConnection);
        } catch (Exception e) {
            objResponse.messagesList.add(new Message("Ooops! Failed to create student,"
                    + " Please contact support that there an issue while saving new student.", 
                    MessageType.Error));
            objResponse.messagesList.add(new Message(e.getMessage() + "\n Stack Track:\n" 
                    + e.getStackTrace(), MessageType.Exception));
        }
    }
    
    
    public Response deleteStudents(String selectedId, Response objResponse) {
        try{
            Connection  dbConnection = objConnection.getConnection();
            objModifier.deleteStudents(selectedId,objResponse,dbConnection);
            return  objResponse;           
        }catch(Exception e){
        objResponse.messagesList.add(new Message("Ooops! Failed to delete student,"
                + " Please contact support that there an issue while saving new student.",
                MessageType.Error));
        objResponse.messagesList.add(new Message(e.getMessage() + "\n Stack Track:\n"+e.getStackTrace(), 
                MessageType.Exception));
        }
        return null;
    }
     
    }


