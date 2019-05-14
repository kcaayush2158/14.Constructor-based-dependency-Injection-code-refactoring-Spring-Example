package application.model;

public class ActiveMqMessage implements Messaging {

     @Override

     public void sendMessage(){
         System.out.println("Send message Active MQ");
      }
}
