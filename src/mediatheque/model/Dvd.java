package mediatheque.model;

public class Dvd extends Document implements Empruntable {
    private String realisateur;
    private int duree;
    private String genre;
    private boolean disponible = true;


    public Dvd(String titre, int annee, String realisateur, int duree, String genre){
        super(titre, annee);
        this.realisateur = realisateur;
        this.duree = duree;
        this.genre = genre;
    }

    @Override
    public String descriptionCourte() {
        return "[ DVD ] " + titre + " (" + annee + "), "
                + realisateur + ", " + duree + " min."
                +"Genre : "+genre;
    }

    @Override
    public void emprunter() {
        if (!disponible)
            throw new IllegalStateException("Deja emprunte : " + titre);
        disponible = false;
    }

    @Override
    public void rendre() {
        disponible = true;
    }

    @Override
    public boolean estDisponible() {
        return disponible;
    }
}
