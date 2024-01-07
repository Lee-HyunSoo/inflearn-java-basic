package poly.ex.sender;

public class EmailSender implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("메일을 방송합니다: " + message);
    }
}
