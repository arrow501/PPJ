package PPJ23.Task8;

public class DetektorDymu {
    public void sprawdz(String powietrze) throws Alarm{
        if(powietrze.contains("dym")) throw new Alarm();
    }
}
