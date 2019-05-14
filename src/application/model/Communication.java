package application.model;

public class Communication
{
    private Messaging messaging;

    Communication(Messaging messaging){
        super();
        this.messaging=messaging;
    }

    public void communicate(){
    messaging.sendMessage();
    }

}
