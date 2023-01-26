package PPJ22.Task2;

public class Welder extends Person{
    private String workExperience;

    public Welder(String name, String workExperience){
        super(name);
        this.workExperience = workExperience;
    }
    public String display(){
        return super.display() + "\nworkExperience:\t" + workExperience;
    }
}
