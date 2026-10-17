package mediatheque.model;

public class Revue extends Document { // pas d’ mediatheque.model.Empruntable !
    private final int numero ;
    public Revue ( String titre , int annee , int numero ) {
        super ( titre , annee );
        this . numero = numero ;
    }
    @Override
    public String descriptionCourte () {
        return "[ mediatheque.model.Revue ] " + titre + " n." + numero
                + " (" + annee + ") - consultation sur place ";
    }
}