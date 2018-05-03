package suite;

import junitdemo.Test4;
import junitdemo.TesterHomeTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Test4.class,
//        test3.class,
        TesterHomeTest.class

})
public class demosuite {


}
