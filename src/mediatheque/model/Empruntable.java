package mediatheque.model;

public interface Empruntable {
    void emprunter () ;
    void rendre () ;
    boolean estDisponible () ;
}
