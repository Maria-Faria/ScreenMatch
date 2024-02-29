package br.com.alura.screenmatch.models;

public class Movie extends Title{
    private String director;

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }
}
