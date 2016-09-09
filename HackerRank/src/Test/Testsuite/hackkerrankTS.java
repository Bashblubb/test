package Test.Testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import Test.Testclasses.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	StaircaseTest.class,
	TimeConversionTest.class,
	KeywordTranspositionCipherTest.class
})

public class hackkerrankTS {
	//just testsuiting
}
