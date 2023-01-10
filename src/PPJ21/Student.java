package PPJ21;

public class Student {
    private int sNumber;
    private String name;
    public Student(String name, int sNumber){
        this.name = name;
        this.sNumber = sNumber;
    }
    public void show(){
        System.out.println("Name:\t\t" + name);
        System.out.println("Student Number:\t" + sNumber);
    }
}
