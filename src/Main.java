import br.com.alura.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.setName("Ready Player One");
        myMovie.setReleaseYear(2018);
        myMovie.setDurationMinutes(140);

        myMovie.showDatasheet();

        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.rate(10);

        System.out.println("Total de avaliações: " + myMovie.getTotalRating());
        System.out.println(myMovie.getAverageRatings());
    }
}
