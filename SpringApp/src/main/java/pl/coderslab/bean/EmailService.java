package pl.coderslab.bean;

public class EmailService implements MessageService {

    private String message;

    public EmailService(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println(getMessage());
    }

    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
