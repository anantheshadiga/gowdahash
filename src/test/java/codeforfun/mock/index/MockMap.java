package codeforfun.mock.index;

import codeforfun.utils.MapEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by antz on 15/2/16.
 */
public class MockMap {

    private List<MapEntry> testEntries = new ArrayList<MapEntry>();

    public MockMap(){
        for(int index=0; index<100; index++) {
            MapEntry aEntry = new MapEntry();
            aEntry.key = "test" + index;
            aEntry.value = "value" + index;
            testEntries.add(aEntry);
        }
    }

    public List<MapEntry> getTestEntries() {
        return testEntries;
    }

    public String getRandomExistingKey() {
        long randomPositon = Math.round(Math.random() % testEntries.size());
        return "test" + randomPositon;
    }

    public Object getValue(String key) {
        for(int index=0; index < testEntries.size(); index++) {
            if(key.equals(testEntries.get(index).key)) {
                return testEntries.get(index).value;
            }
        }
        return null;
    }

    public String getRandomNonExistingKey() {
        long randomPositon = Math.round(Math.random()) + testEntries.size();
        return "test" + randomPositon;
    }
}
