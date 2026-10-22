package mediatheque.model;

import mediatheque.catalogue.Catalogue;

import java.util.Optional;

public class Bibliothecaire {

    private Catalogue<Document> catalogue;

    public Bibliothecaire(Catalogue<Document> catalogue) {
        this.catalogue = catalogue;
    }

    public Optional<Document> rechercherDocument(String titre) {
        return catalogue.rechercherParTitre(titre);
    }

    public void ajouterDocument(Document document) {
        catalogue.ajouter(document);
    }
}