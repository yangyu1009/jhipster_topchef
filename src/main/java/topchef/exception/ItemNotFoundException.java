package topchef.exception;


public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(String id) {
        super("Item " + id + " not found!");
    }
}
