/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.AAS_Creator;
import model.dto.TeacherDTO;
/**
 *
 * @author M-H-K
 */
public class RecordMapper {
    
    ArrayList<TeacherDTO> getteacherrs(ResultSet rs) {
        ArrayList<TeacherDTO> Teacherlist = new ArrayList<>();
        try{
        while (rs.next())
            {
             TeacherDTO objTE=AAS_Creator.getInstanceOF_teacherDTO();
                objTE.id=rs.getString(1);
                objTE.Firstname= rs.getString(2);
                objTE.Lastname =rs.getString(3);
                objTE.status=rs.getString(4);
                objTE.age=rs.getString(5);
                objTE.City=rs.getString(6);
                
               //objEmp.BirthDate = rs.getString(6);
                Teacherlist.add(objTE);   
            }
        }catch (Exception e){
        }
        return Teacherlist;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
