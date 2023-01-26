package PPJ23.Task6;

public class Fruit {
    private String nazwa;
    private double masa;

    public Fruit(String nazwa) {
        this.nazwa = nazwa;
        // random mass in (100, 250)
        this.masa = Math.random() * 150 + 100;
    }

    public String getNazwa() {
        return this.nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getMasa() {
        return this.masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

}

    