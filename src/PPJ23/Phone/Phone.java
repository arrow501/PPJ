package PPJ23.Phone;

public class Phone {
    private String communication_interface;
    private String color;


    public Phone(String communication_interface, String color) {
        this.communication_interface = communication_interface;
        this.color = color;
    }

    public void call(String phone_number){
        System.out.println(phone_number);
    }
    public void show_call_history(){
        System.out.println("No History!");
    }
}
