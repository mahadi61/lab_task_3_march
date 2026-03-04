public class Main {

    public static void main(String[] args) {

        LaLigaPlayer messi = new LaLigaPlayer("Messi", 30, 5000000, 35);
        PremierLeaguePlayer ronaldo = new PremierLeaguePlayer("Ronaldo", 28, 4500000, 32);

        messi.displayDetails();
        ronaldo.displayDetails();
    }
}