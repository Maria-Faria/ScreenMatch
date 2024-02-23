package br.com.alura.screenmatch.models;

public class Movie {
    private String name;
    private int releaseYear;
    private boolean includedPlan;
    private double sumRatings;
    private int totalRating;
    private int durationMinutes;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
}
