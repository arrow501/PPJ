package PPJ20;

public class Task3 {
    public static void main(String[] args) {

        // Koszyk A
        String[] A = new String[]{
            "PSG",
            "Atletico",
            "Sporting CP",
            "Inter",
            "Benfica",
            "Villareal",
            "RB Salzburg"
        };

        // Koszyk B
        String [] B = new String[]{
            "Liverpool",
            "Ajax Amsterdam",
            "Real Madryt",
            "Bayern Monachium",
            "Manchester united",
            "Lille",
            "Juventus"
        };

        // Kolejka
        MyQueue teams = new MyQueue( );
        if(A.length == B.length){
            for (int i = 0; i < B.length; i++) {
                teams.put(A[i]);
                teams.put(B[i]);
            }
        }
        else
            throw new Error("Koszyki zawieraja rozno ilosc druzyn");
        
        // Matchups
        boolean anyTeamsLeft = true;
        do{
            String TeamA = teams.get();
            String TeamB = teams.get();
            if(TeamA != null || TeamB != null){
                System.out.println( TeamA + " vs " + TeamB);
            } else
                anyTeamsLeft = false;
        } while(anyTeamsLeft);
    }
}
