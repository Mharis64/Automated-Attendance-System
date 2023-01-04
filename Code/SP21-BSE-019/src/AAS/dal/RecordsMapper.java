/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AAS.dal;

import AAS.Model.DTO.StudentData;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author OK
 */
public class RecordsMapper {
     ArrayList<StudentData> getStudents(ResultSet rs) {
        ArrayList<StudentData> stdlist = new ArrayList<>();
        try{
        while (rs.next())
            {
                StudentData objStd=new StudentData();                
                objStd.FirstName= rs.getString(1);
                objStd.LastName =rs.getString(2);
                   objStd.Course=rs.getString(3);
                   objStd.CNIC=rs.getString(4);
                   objStd.Email=rs.getString(5);
                   
                stdlist.add(objStd);
            }
        }catch (Exception e){
        }
        return stdlist;
    }
   
    
}
