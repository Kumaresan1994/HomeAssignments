package runner;

import org.testng.annotations.DataProvider;

import base.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/java/features/Login.feature", glue="pages", monochrome=true,
publish=true
)
public class TC_003_LoginCucumber extends BaseClass{
	
	  @DataProvider(parallel=true)
	  public Object[][] scenarios() {
	      return super.scenarios();
	    }

}
