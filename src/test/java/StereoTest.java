import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    private Stereo stereo;

    @Before
    public void before(){stereo = new Stereo("test");}

    @Test
    public void canGetStation(){
        assertEquals("", stereo.tune());
    }

    @Test
    public void canChangeStation(){
        stereo.changeStation("Radio 1");
        assertEquals("Radio 1", stereo.tune());
    }

    @Test
    public void canGetVolume(){
        assertEquals(0, stereo.getVolume());
    }

    @Test
    public void canChangeVolume() {
        stereo.setVolume(42);
        assertEquals(42, stereo.getVolume());
    }

    @Test
    public void canGetPlayPause() {
        assertEquals(false, stereo.getPlayPause());
    }

    @Test
    public void canSetPlayPause() {
        stereo.setPlayPause(true);
        assertEquals(true, stereo.getPlayPause());
    }
}
