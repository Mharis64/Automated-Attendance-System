/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.AAS_Creator;
import model.dto.AttendanceRecordDTO;
/**
 *
 * @author M-H-K
 */
public class RecordMapper {
    
    ArrayList<AttendanceRecordDTO> getAttendance(ResultSet rs) {
        ArrayList<AttendanceRecordDTO> Attendancelist = new ArrayList<>();
        try{
        while (rs.next())
            {
             AttendanceRecordDTO objatted=AAS_Creator.getInstanceOF_teacherDTO();
                objatted.id=rs.getString(1);
                objatted.Firstname= rs.getString(2);
                objatted.Lastname =rs.getString(3);
                objatted.classes=rs.getString(4);
                objatted.Absent=rs.getString(5);
                objatted.Present=rs.getString(6);
               //objEmp.BirthDate = rs.getString(6);
                Attendancelist.add(objatted);   
            }
        }catch (Exception e){
        }
        return Attendancelist;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
