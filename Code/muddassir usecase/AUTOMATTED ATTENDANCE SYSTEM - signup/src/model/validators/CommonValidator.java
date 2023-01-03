/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.validators;

import model.dto.StudentDTO;
import model.dto.Message;
import model.dto.MessageType;
import model.dto.Response;
import model.SMSFactory;
/**
 *
 * @author Mukhtiar-HPC
 */
public class CommonValidator {
    
    Object string="[FIBER,CABLE]";
    String[] strArray = (String[])string;

    public static void validateEmployee(StudentDTO objEmp, Response objResponse) {
        if(objEmp.FirstName == null || objEmp.FirstName.length() < 3){
           
            objResponse.messagesList.add(SMSFactory.getInstanceOfmessage("FIrst Name is not valid, Provide valid first name with at least 3 characters.",MessageType.Error));
        }
//        else if(objEmp.LastName == null || objEmp.LastName.length() < 3){
//            objResponse.messagesList.add(SMSFactory.getInstanceOfmessage("last name is not valid, Provide valid last name with at least 3 characters.",MessageType.Error));
//        }
//        
//        
//         else if(objEmp.EmailAddress == null || objEmp.EmailAddress.length() <10){
//            objResponse.messagesList.add(SMSFactory.getInstanceOfmessage("address is not valid, Provide valid address with at least 15 characters.",MessageType.Error));
//        }
//         else if(objEmp.Password == null || objEmp.Password.length() < 3){
//            objResponse.messagesList.add(SMSFactory.getInstanceOfmessage("city is not valid, Provide valid city with at least 3 characters.",MessageType.Error));
//       }
//         else if(objEmp.Country == null || objEmp.Country.length() < 3){
//            objResponse.messagesList.add(SMSFactory.getInstanceOfmessage("Country is not valid, Provide valid city with at least 5 characters.",MessageType.Error));
//        }
//          else if(objEmp.PostalCode == null || objEmp.PostalCode.length() < 3){
//            objResponse.messagesList.add(SMSFactory.getInstanceOfmessage("postel is not valid, Provide valid code.",MessageType.Error));
//        }
//         else if(objEmp.Region == null || objEmp.Region.length() < 3){
//            objResponse.messagesList.add(SMSFactory.getInstanceOfmessage("region is not valid.",MessageType.Error));
//        }
//          else if(objEmp.TitleOFCoutresy == null || objEmp.TitleOFCoutresy.length() < 2){
//            objResponse.messagesList.add(SMSFactory.getInstanceOfmessage("TitleOFCoutresy is not valid.",MessageType.Error));
//        }
        
        
        
         
         
        
        // Todo validate the rest
    }
    
}
