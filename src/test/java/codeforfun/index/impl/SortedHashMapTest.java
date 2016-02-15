package codeforfun.index.impl;

import codeforfun.mock.index.MockMap;
import codeforfun.utils.MapEntry;
import junit.framework.TestCase;

import java.util.List;

/**
 * Created by antz on 15/2/16.
 */
public class SortedHashMapTest extends TestCase {

    public void testCreate() throws Exception {
        MockMap mock = new MockMap();
        List<MapEntry> testEntries = mock.getTestEntries();
        SortedHashMap map = new SortedHashMap();
        for(MapEntry aEntry: testEntries) {
            map.create(aEntry.key, aEntry.value);
        }

        String randomExistingKey = mock.getRandomExistingKey();
        assertEquals(map.get(randomExistingKey), mock.getValue(randomExistingKey));

        randomExistingKey = mock.getRandomExistingKey();
        assertEquals(map.get(randomExistingKey), mock.getValue(randomExistingKey));

        randomExistingKey = mock.getRandomExistingKey();
        assertEquals(map.get(randomExistingKey), mock.getValue(randomExistingKey));

        randomExistingKey = mock.getRandomExistingKey();
        assertEquals(map.get(randomExistingKey), mock.getValue(randomExistingKey));

        String randomNonExistingKey = mock.getRandomNonExistingKey();
        assertNull(map.get(randomNonExistingKey));

        randomNonExistingKey = mock.getRandomNonExistingKey();
        assertNull(map.get(randomNonExistingKey));

        randomNonExistingKey = mock.getRandomNonExistingKey();
        assertNull(map.get(randomNonExistingKey));
    }
}