import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director("Andrew", "BV879098J", 400, "Finance", 4000);
    }

    @Test
    public void directorHasDept(){
        assertEquals("Finance", director.getDeptName());
    }

    @Test
}
