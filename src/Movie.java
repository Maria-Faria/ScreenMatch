public class Movie {
    String name;
    int releaseYear;
    boolean includedPlan;
    double sumRatings;
    int totalRating;
    int durationMinutes;

    void showDatasheet() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    void rate(double record) {
        sumRatings += record;
        totalRating++;
    }

    double getAverageRatings() {
        return sumRatings/totalRating;
    }
}
