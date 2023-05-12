package dev.dishoo.starwarsswapi.error;

public class NotFoundObjectException extends StarWarsApiBaseException {

    private final String objectClazz;
    private final String id;

    public NotFoundObjectException(String message, String objectClazz, String id) {
        super(message);
        this.objectClazz = objectClazz;
        this.id = id;
    }

    public String getObjectClazz() {
        return objectClazz;
    }

    public String getId() {
        return id;
    }
}
