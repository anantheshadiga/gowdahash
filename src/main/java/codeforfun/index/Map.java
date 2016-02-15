package codeforfun.index;

/**
 * Interface for the datastructure to hold key and value pairs.
 * This allows create, update, delete and update for the pairs.
 */
public interface Map {

    /**
     * creates the object in the datastructure given the key and value pairs
     * @param key
     * @param value
     * @return void
     */
    public void create(String key, Object value);

    /**
     * returns the object associated with the key
     * @param key
     * @return Object associated with the key
     */
    public Object get(String key);

    /**
     * Deletes the object identified by the key
     * @param key
     * @return void
     */
    public void delete(String key);

}
