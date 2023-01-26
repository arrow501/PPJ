package PPJ23.Task8;

public class Alarm extends Exception {
    public Alarm(){
        super("Uwaga Dym!");
    }
    public Alarm(String message){
        super(message);
    }
}
