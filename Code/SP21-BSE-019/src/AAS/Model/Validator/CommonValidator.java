/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AAS.Model.Validator;

import AAS.Model.DTO.Message;
import AAS.Model.DTO.MessageType;
import AAS.Model.DTO.Response;
import AAS.Model.DTO.StudentData;

/**
 *
 * @author OK
 */
public class CommonValidator {
    public static void validateStudents(StudentData objStd, Response objResponse) {
        if(objStd.FirstName == null || objStd.FirstName.length() < 3   ){
            objResponse.messagesList.add(new Message("FIrst Name is not valid, "
                    + "Provide valid first name with at least 3 characters.",MessageType.Error));
        
        }
        if(objStd.CNIC==null){
             objResponse.messagesList.add(new Message("Must provide a valid CNIC , "
                    + "Provide valid CNIC number .",MessageType.Error));
        
        }
            
        // Todo validate the rest
    }

}
