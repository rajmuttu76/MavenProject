package practice;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MonsterLoginTest {

  @Test(priority=2)
  public void main() throws InterruptedException, IOException {
   String [] args=null;
	  MonsterLogin.main(args);
	  Reporter.log("resume uploaded on monster",true);
	  
  }
}
