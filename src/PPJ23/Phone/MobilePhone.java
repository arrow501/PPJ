package PPJ23.Phone;

public class MobilePhone extends Phone {
    private String[] callLog = new String[10];


    public MobilePhone(String communication_interface, String color) {
        super(communication_interface, color);
    }

    @Override
    public void call(String phone_number){
        super.call(phone_number);
        log_call(phone_number);
    }
    private void log_call(String phone_number){
        // Shift existing logs by 1 to the left
        for (int i = 1; i < callLog.length; i++) {
            callLog[i - 1] = callLog[i];
        }
        // log new call at the end
        callLog[callLog.length - 1] = phone_number;
    }


    public String[] getCallLog() {
        return this.callLog;
    }

    @Override
    public void show_call_history(){
        for (String phone_number : callLog) {
            System.out.println(phone_number);
        }
    }
}
