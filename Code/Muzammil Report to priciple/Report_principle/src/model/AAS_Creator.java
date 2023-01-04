/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Waleed
 */
import UI.AttendanceRecord;
import UI.Dashboard;
import javax.swing.table.DefaultTableModel;
import dal.DAL_Manager;
import dal.DB_Reader;
import dal.RecordAdder;
import dal.RecordMapper;
import dal.SQLConnection;
import model.dto.AttendanceRecordDTO;
import model.dto.Message;
import model.dto.MessageType;
import model.dto.Response;
public class AAS_Creator {

    public static AAS_Controller getInstanceOFAAs_Controller() {
        return new AAS_Controller();
    }

    public static DefaultTableModel getInstanceOF_DefaultTableModel() {
        return new DefaultTableModel();
    }

 

    public static AttendanceRecord getInstanceOF_CheckAttendanceList() {
        return new AttendanceRecord();
    }

    public static Dashboard getInstanceOF_Dashboard() {
        return new Dashboard();
    }

    public static Object[] getInstanceOf_Object(int a) {
        return new Object[a];
    }

    public static DAL_Manager getInstanceOF_DAL_Manager() {
        return new DAL_Manager(new RecordMapper());
    }

    public static DB_Reader getInstanceOF_DB_Reader() {
        return new DB_Reader();
    }

    public static RecordAdder getInstanceOF_RecordAdder() {
        return new RecordAdder();
    }

    public static RecordMapper getInstanceOF_RecordMapper() {
        return new RecordMapper();
    }

    public static SQLConnection getInstanceOF_SQLConnection(String sName, String dbName, String userId, String userPass) {
        return new SQLConnection(sName,dbName,userId,userPass);
    }
    public static AttendanceRecordDTO getInstanceOF_teacherDTO() {
        return new AttendanceRecordDTO();
    }
    public static Message getInstanceOF_Message(String errorMessage, MessageType messageType) {
        return new Message(errorMessage,messageType);
    }
//    public static MessageType getInstanceOF_MessageType() {
//        return new MessageType();
//    }
    public static Response getInstanceOF_Response() {
        return new Response();
    }
}
 