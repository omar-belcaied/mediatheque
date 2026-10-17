package mediatheque.exception;

// Checked exception : les erreurs métier prévisibles doivent être
// déclarées ou traitées par le code appelant.
public abstract class MediathequeException extends Exception {

    public MediathequeException(String message) {
        super(message);
    }

    public MediathequeException(String message, Throwable cause) {
        super(message, cause);
    }
}
