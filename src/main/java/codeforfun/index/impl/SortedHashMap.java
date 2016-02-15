package codeforfun.index.impl;

import codeforfun.index.Map;
import codeforfun.utils.MapEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antz on 15/2/16.
 */
public class SortedHashMap implements Map {

    private List<MapEntry> sortedList = new ArrayList<MapEntry>();

    private void add(int position, MapEntry entry) {
        sortedList.add(position, entry);
    }

    private MapEntry get(int position) {
        return sortedList.get(position);
    }

    private int size() {
        return sortedList.size();
    }

    /**
     * Performs the binary search and returns the results
     * @param key
     * @return
     */
    private int search(String key) {
        if(size() == 0) {
            return -1;
        }
        int endIndex = size() - 1;
        int startIndex = 0;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) >>> 1;
            String midVal = get(mid).key;

            if (midVal.compareTo(key) < 0)
                startIndex = mid + 1;
            else if (midVal.compareTo(key) > 0)
                endIndex = mid - 1;
            else
                return mid; // key found
        }
        return -(endIndex + 2);  // key not found.
    }

    /**
     * creates the object in the datastructure given the key and value pairs
     * @param key
     * @param value
     * @return void
     */
    public void create(String key, Object value) {
        int position = search(key);

        if(position < 0) {
          //when key is not found
            MapEntry aNewEntry = new MapEntry();
            aNewEntry.key = key;
            aNewEntry.value = value;
            add((Math.abs(position) -1), aNewEntry);
        } else {
            //when key is found, update
            MapEntry existingEntry = get(position);
            existingEntry.value = value;
        }
    }

    /**
     * returns the object associated with the key
     * @param key
     * @return Object associated with the key
     */
    public Object get(String key) {
        int position = search(key);
        if(position < 0) {
            //when key not found
            return null;
        } else {
            return get(position).value;
        }
    }

    /**
     * Deletes the object identified by the key
     * @param key
     * @return void
     */
    public void delete(String key) {

    }
}
