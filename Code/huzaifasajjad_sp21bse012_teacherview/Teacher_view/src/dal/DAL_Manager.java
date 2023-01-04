/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.AAS_Creator;
import model.dto.TeacherDTO;
import model.dto.MessageType;
import model.dto.Message;
import model.dto.Response;
/**
 *
 * @author M-H-K
 */
public class DAL_Manager {
    
    
     DB_Reader objReader;
    RecordMapper objMapper;
    RecordAdder objAdder;
   SQLConnection objConnection;
    public DAL_Manager(RecordMapper mapper){
    objConnection =  AAS_Creator.getInstanceOF_SQLConnection("localhost","master", "sa","1234");
    objReader = AAS_Creator.getInstanceOF_DB_Reader();
    objAdder = AAS_Creator.getInstanceOF_RecordAdder();
    this.objMapper=mapper;
    
    }
  public ArrayList<TeacherDTO> getTeacherList(String searchKey) {
                
        Connection  dbConnection = objConnection.getConnection();
        String viewsQuery = "Select * from Teachers";
        if(searchKey == null || searchKey.length() > 0){
        {
            viewsQuery += " where  ID LIKE '%"+searchKey+"%' OR Firstname LIKE '%"+searchKey+"%' OR LastName LIKE '%"+searchKey+"%' OR Tstatus LIKE '%"+searchKey+"%';";
        }}
        ResultSet rs = objReader.getRecords(viewsQuery, dbConnection);
        return objMapper.getteacherrs(rs);        
    }
   public void saveTeacher(TeacherDTO objDon, Response objResponse) {
        try{
            Connection  dbConnection = objConnection.getConnection();
            objAdder.saveTeacher(objDon,objResponse,dbConnection);            
        }catch(Exception e){
        objResponse.messagesList.add(AAS_Creator.getInstanceOF_Message("Ooops! Failed to Donate Blood, Please contact support that there an issue while Donating Blood.", MessageType.Error));//
        objResponse.messagesList.add(AAS_Creator.getInstanceOF_Message(e.getMessage() + "\n Stack Track:\n"+e.getStackTrace(), MessageType.Exception));//
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
