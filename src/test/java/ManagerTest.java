import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
        Manager manager;

        @Before
        public void before() {
            manager = new Manager("Max", "CF125245D", 250, "CustExp", 1000);
        }

        @Test
        public void managerHasDept(){
            assertEquals("CustExp", manager.getDeptName());
        }
}
