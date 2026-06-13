package newTest2;

import org.junit.Assert;
import org.testng.annotations.Test;

public class NewTest {
  
  int a=10,b=20,c;
//	c->result
@Test
public void add() {
	  c=a+b;
	  Assert.assertEquals(c, 30);
}
@Test
public void sub() {
	  c=a-b;
	  Assert.assertEquals(c, -10);
}
@Test
public void mul() {
	  c=a*b;
	  Assert.assertEquals(c, 200);
}
@Test
public void div() {
	  c=b/a;
	  Assert.assertEquals(c, 2);
}
}
