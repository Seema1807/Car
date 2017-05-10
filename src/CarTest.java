import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarTest {

	Car car;
	@Before
	public void setUp() throws Exception {
		car=new Car(500);
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(500,car.getEngineCapacity());
	}

}
