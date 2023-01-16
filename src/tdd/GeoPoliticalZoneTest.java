package tdd;

import chapterEight.classWork.GeoPoliticalZones;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPoliticalZoneTest {

    @Test
    public void test(){
        assertEquals(GeoPoliticalZones.NORTH_EAST, GeoPoliticalZones.getPoliticalZone("Adamawa"));
        System.out.println(GeoPoliticalZones.getPoliticalZone("adamawa"));
        System.out.println(GeoPoliticalZones.valueOf("NORTH_EAST"));
    }
}
