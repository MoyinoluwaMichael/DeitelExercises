package chapterEight.classWork.diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private final List<Entry> entries = new ArrayList<>();
    private boolean isLocked;
    private int idCount;
    private String userName;
    private String password;

    public Diary(String userName, String password){
        this.userName = userName.toUpperCase();
        this.password = password;
    }

    public void createEntry(String entryTitle, String entryBody) {
        int entryId = ++idCount;
        entries.add(new Entry(entryTitle, entryBody, entryId));
    }

    public int getNumberOfEntriesCreated() {
        return entries.size();
    }


    public String viewEntryAt(int entryId) {
        validateEntry(entryId);
        Entry entry = getEntry(entryId);
        return entry.toString();
    }

    private Entry getEntry(int entryId) {
        for (Entry entry : entries) {
            if (entry.getId() == entryId){
                return entry;
            }
        }
        throw new NullPointerException("Entry does not exist or has been deleted!");
    }

    private void validateEntry(int entryId) {
        if (getEntry(entryId) == null)throw new NullPointerException("Entry does not exist or has been deleted");
    }

    public void deleteEntryAt(int id) {
        validateEntry(id);
        for (int entryIndex = 0; entryIndex < entries.size(); entryIndex++) {
            Entry entry = entries.get(entryIndex);
            if (entry.getId() == id) entries.remove(entryIndex);
        }
    }
    public void editEntryAt(int id, String newEntryBody) {
        getEntry(id).edit(newEntryBody);
    }
    public String getEntryTitle(int id){
        Entry entry = getEntry(id);
        return entry.getTitle();
    }

    public void lockDiary() {
        isLocked = true;
    }
    public boolean isLocked() {
        return isLocked;
    }

    public void unlockDiary(String userName, String password) {
        if (this.password.equals(password)){
            isLocked = false;
        }
    }
}
