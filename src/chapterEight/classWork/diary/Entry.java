package chapterEight.classWork.diary;

import java.time.LocalDateTime;

public class Entry {
    private String title;
    private String body;
    private LocalDateTime dateAndTime;
    private int id;

    public Entry(String title, String body, int id){
        this.title = title.toUpperCase();
        this.body = body;
        dateAndTime = LocalDateTime.now();
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format("""
                =====================================================================================================
                TITLE: %s
                ID: %s
                Date: %s
                Time: %s:%s
                =====================================================================================================
                Body:
                %s
                =====================================================================================================
                """, title, id, dateAndTime.toLocalDate(),
                dateAndTime.getHour(), dateAndTime.getMinute(), body);
    }
    public int getId(){
        return id;
    }


    public void edit(String newEntryBody) {
        body = newEntryBody;
    }
    public String getTitle(){
        return title;
    }
}
