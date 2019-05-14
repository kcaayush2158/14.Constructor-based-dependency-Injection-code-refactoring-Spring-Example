package application.main;

import application.model.ActiveMqMessage;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        ActiveMqMessage message = context.getBean("activeMqMessage", ActiveMqMessage.class);
        message.sendMessage();
        context.close();

    }
}
