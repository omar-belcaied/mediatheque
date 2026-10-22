package mediatheque.service;

import mediatheque.catalogue.Catalogue;
import mediatheque.model.Document;
import mediatheque.model.Empruntable;
import mediatheque.exception.DocumentIntrouvableException;
import mediatheque.exception.DocumentIndisponibleException;

import java.util.Optional;

public class EmpruntManager {

    private final Catalogue<Document> catalogue;

    public EmpruntManager(Catalogue<Document> catalogue) {
        this.catalogue = catalogue;
    }

    public void emprunter(String titre)
            throws DocumentIntrouvableException,
            DocumentIndisponibleException {

        Optional<Document> resultat =
                catalogue.rechercherParTitre(titre);

        if (resultat.isEmpty()) {
            throw new DocumentIntrouvableException(
                    "Document introuvable : " + titre
            );
        }

        Document document = resultat.get();

        if (!(document instanceof Empruntable)) {
            throw new DocumentIndisponibleException(
                    "Document non empruntable : " + titre
            );
        }

        Empruntable empruntable = (Empruntable) document;
        empruntable.emprunter();
    }
}