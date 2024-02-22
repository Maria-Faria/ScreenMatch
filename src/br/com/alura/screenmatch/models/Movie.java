package br.com.alura.screenmatch.models;

public class Movie {
    public String name;
    public int releaseYear;
    boolean includedPlan;
    private double sumRatings;
    private int totalRating;
    public int durationMinutes;

    public void showDatasheet() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public void rate(double record) {
        sumRatings += record;
        totalRating++;
    }

    public double getAverageRatings() {
        return sumRatings/totalRating;
    }

    public int getTotalRating() {
        return totalRating;
    }
}
