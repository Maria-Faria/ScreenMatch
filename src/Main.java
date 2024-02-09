public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.name = "Ready Player One";
        myMovie.releaseYear = 2018;
        myMovie.durationMinutes = 140;

        System.out.println(myMovie.name);
        System.out.println(myMovie.releaseYear);
    }
}
