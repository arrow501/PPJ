package PPJ23.Phone;

public class Smartphone extends MobilePhone {
    private Person[] contacts;

    public Smartphone(Person[] contacts,String communication_interface, String color) {
        super(communication_interface, color);
        this.contacts = contacts;
    }


    @Override
    public void show_call_history() {
        for (String phone_number : getCallLog()) {
            System.out.println(getContactName(phone_number) + phone_number);
        }
    }

    private String getContactName(String phone_number) {
        // search for a person with a given number in contacts
        // return "FirstName LastName " or empty string if not found
        for (Person person : contacts) {
            if (phone_number.equals(person.getPhoneNumber())) {
                return person.getFirstName() + " " + person.getLastName() + " ";
            }
        }
        return "";
    }

}
