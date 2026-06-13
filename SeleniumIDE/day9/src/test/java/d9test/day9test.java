package d9test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import junit.framework.Assert;
@SuppressWarnings("deprecation")
public class day9test {
  @Test(dataProvider = "add")
  public void add(int num1,int num2,int expected) {
//      System.err.println(num1+num2);
//      System.out.println(result);
      int actual=num1+num2; 
      Assert.assertEquals(expected, actual);
  }
  
  @Test(dataProvider="add")
  public void sub(int num1,int num2,int expected) {
      int actual=num1-num2;
      Assert.assertEquals(expected, actual);
  }
  @Test
  @DataProvider(name="add")
  public Object[][] dp(){
      return new Object[][] {
          new Object[] {1,2,5},
          new Object[] {2,3,5},	
          new Object[] {4,2,2}
      };
  }
  
  
  
}