/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import dal.DAL_Manager;
import dal.DB_Reader;
import dal.RecordAdder;
import dal.RecordMapper;
import model.dto.Response;

/**
 *
 * @author Mukhtiar
 */
public class SMSFactory {

    static Response getResponseInstance;

   static Response getResponseInstance() {
        return new Response();
    }
}
