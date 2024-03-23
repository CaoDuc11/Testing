package test;

import main.StudentScore;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class StudentScoreTest {
    @Test
    public void testCheckFail1() {
        boolean output = StudentScore.checkFail(-1);
        assertEquals(true, output);
    }

    @Test
    public void testCheckFail2() {
        boolean output = StudentScore.checkFail(0);
        assertEquals(false, output);
    }

    @Test
    public void testGetScore3() {
        String output = StudentScore.getScore(0, -2);
        assertEquals("Không xác định", output);
    }

    @Test
    public void testGetScore4() {
        String output = StudentScore.getScore(0, -1);
        assertEquals("Nhận điểm F", output);
    }

    @Test
    public void testGetScore5() {
        String output = StudentScore.getScore(0, 1);
        assertEquals("Nhận điểm F", output);
    }

    @Test
    public void testGetScore6() {
        String output = StudentScore.getScore(5, 1);
        assertEquals("Nhận điểm D", output);
    }

    @Test
    public void testGetScore7() {
        String output = StudentScore.getScore(6, 1);
        assertEquals("Nhận điểm C", output);
    }

    @Test
    public void testGetScore8() {
        String output = StudentScore.getScore(8, 1);
        assertEquals("Nhận điểm B", output);
    }

    @Test
    public void testGetScore9() {
        String output = StudentScore.getScore(9, 1);
        assertEquals("Nhận điểm A", output);
    }


}
