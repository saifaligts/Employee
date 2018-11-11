import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;


public class EmployeeJTest {
Employee empObj1 = new Employee();

@Test
public void testName() {
	empObj1.setName("Jasmine");
	Assert.assertEquals("Jasmine", empObj1.getName());
}

@Test
public void testAge() {
	empObj1.setAge(24);
	Assert.assertEquals(24, empObj1.getAge());
}

@Test
public void testDesignation() {
	empObj1.setDesignation("Scientist");
	Assert.assertEquals("Scientist", empObj1.getDesignation());
}

@Test
public void testSalary() {
	empObj1.setSalary(4000);
	Assert.assertEquals(4000, empObj1.getSalary(), 0);
}

//test
@Test
public void testtestBonus() {
	Assert.assertEquals(100, empObj1.paybonus(empObj1.getSalary()));
}

}
