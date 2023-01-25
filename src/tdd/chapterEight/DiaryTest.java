package tdd.chapterEight;

import chapterEight.classWork.diary.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    Diary dearDiary = new Diary();

    @BeforeEach
    public void startEachTestWith() {
        dearDiary.createEntry("Yet an unpleasant day", "Dear diary, could you believe the bug I told you about " +
                "that I had with my code since last week is yet unresolved? I'm finally fed up and I think it's high time I end this." +
                "At the time of writing this, I'd already taken snipe...fvf..gvj3...094....");

    }
    @Test
    public void entryCanBeCreatedTest(){
        assertEquals(1, dearDiary.getNumberOfEntriesCreated());
    }
    @Test
    public void entryInADiaryCanBeViewedAfterCreationTest(){
        String entryBody = "Dear diary, could you believe the bug I told you about " +
                "that I had with my code since last week is yet unresolved? I'm finally fed up and I think it's high time I end this." +
                "At the time of writing this, I'd already taken snipe...fvf..gvj3...094....";

        String expected = String.format("""
                =====================================================================================================
                TITLE: YET AN UNPLEASANT DAY
                ID: 1
                Date: 2023-01-24
                Time: 20:13
                =====================================================================================================
                Body:
                %s
                =====================================================================================================
                """, entryBody);
        assertEquals(expected, dearDiary.viewEntryAt(1));
    }
    @Test
    public void entryThatDoesNotExistThrowExceptionTest(){
        int idNumber = 5;
        assertThrows(NullPointerException.class, ()-> dearDiary.viewEntryAt(idNumber));
    }
    @Test
    public void entryInADiaryCanBeDeletedAfterCreationTest(){
        dearDiary.deleteEntryAt(1);
        assertEquals(0, dearDiary.getNumberOfEntriesCreated());
    }
    @Test
    public void entriesInADiaryCanBeCounted(){
        dearDiary.createEntry("Afternoon Lunch", "Dear diary, I ate buredi and ewa agonyi this afternoon");
        dearDiary.deleteEntryAt(1);
        assertEquals(1, dearDiary.getNumberOfEntriesCreated());
    }
    @Test
    public void contentOfAnEntryCanBeEditedTest(){
        String entryBody = "Dear diary, could you believe the bug I told you about " +
                "that I had with my code since last week is yet unresolved? I'm finally fed up and I think it's high time I end this." +
                "At the time of writing this, I'd already taken sniper but I think my creator does not want me dead";
        dearDiary.editEntryAt(1, entryBody);

        String expected = String.format("""
                =====================================================================================================
                TITLE: YET AN UNPLEASANT DAY
                ID: 1
                Date: 2023-01-24
                Time: 20:13
                =====================================================================================================
                Body:
                %s
                =====================================================================================================
                """, entryBody);
        assertEquals(expected, dearDiary.viewEntryAt(1));
    }


}