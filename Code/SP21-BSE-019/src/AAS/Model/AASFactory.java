/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AAS.Model;

import AAS.dal.DALManager;
import AAS.dal.RecordsAdder;
import AAS.dal.RecordsModifier;
import AAS.Model.DTO.Response;
import AAS.dal.RecordsMapper;

public class AASFactory {
    
    
    
    public static RecordsAdder getInstanceOfAdder() {
        return new RecordsAdder();
    }

    public static RecordsModifier getInstanceOfModifier() {
        return new RecordsModifier();
    }
    public static AASFactory getInstanceOfAASFactory(){
        return new AASFactory();
    }

    public static AASController getInstanceOfAASController(){
        return new AASController();
    }
    
    public static Response getResponceInstance(){
        return new Response();
    }
     public   static DALManager getInstanceOfDALManager() {
        return new DALManager(new RecordsMapper());
    }


    

}
