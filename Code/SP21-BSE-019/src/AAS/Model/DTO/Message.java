
package AAS.Model.DTO;




public class Message {


    public String Message;
    public MessageType Type;
    

    public Message(String errorMessage, MessageType messageType) {
        this.Message = errorMessage;
        this.Type = messageType;
    }

    
}
