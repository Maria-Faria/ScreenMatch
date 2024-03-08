import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.setName("Ready Player One");
        myMovie.setReleaseYear(2018);
        myMovie.setDurationMinutes(140);
        System.out.println("Duração do filme: " + myMovie.getDurationMinutes());

        myMovie.showDatasheet();

        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.rate(10);

        System.out.println("Total de avaliações: " + myMovie.getTotalRating());
        System.out.println(myMovie.getAverageRatings());

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.showDatasheet();
        lost.setSeasons(10);
        lost.setEpisodesSeason(10);
        lost.setMinutesEpisode(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDurationMinutes());

    }
}
