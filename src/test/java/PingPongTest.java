import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PingPongTest {

    @Test
    public void runPingPong_countUpToOne_ArrayList() {
        PingPong testPingPong = new PingPong();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
                assertEquals(expectedOutput, testPingPong.runPingPong(1));
    }
    @Test
    public void runPingPong_countUpToGivenNumber_ArrayList() {
        PingPong testPingPong = new PingPong();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        assertEquals(expectedOutput, testPingPong.runPingPong(2));
    }
    @Test
    public void runPingPong_replaceMultiplesOf3_ArrayList() {
        PingPong testPingPong = new PingPong();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add("Ping");
        assertEquals(expectedOutput, testPingPong.runPingPong(3));
    }
    @Test
    public void runPingPong_replaceMultiplesOf5_ArrayList() {
        PingPong testPingPong = new PingPong();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add("Ping");
        expectedOutput.add(4);
        expectedOutput.add("Pong");
        assertEquals(expectedOutput, testPingPong.runPingPong(5));
    }
    @Test
    public void runPingPong_replaceMultiplesOf3And5_ArrayList() {
        PingPong testPingPong = new PingPong();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add("Ping");
        expectedOutput.add(4);
        expectedOutput.add("Pong");
        expectedOutput.add("Ping");
        expectedOutput.add(7);
        expectedOutput.add(8);
        expectedOutput.add("Ping");
        expectedOutput.add("Pong");
        expectedOutput.add(11);
        expectedOutput.add("Ping");
        expectedOutput.add(13);
        expectedOutput.add(14);
        expectedOutput.add("PingPong");
        assertEquals(expectedOutput, testPingPong.runPingPong(15));
    }


}