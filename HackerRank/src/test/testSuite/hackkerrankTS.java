package test.testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.testClasses.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	StaircaseTest.class,
	TimeConversionTest.class,
	KeywordTranspositionCipherTest.class,
	CompareTheTripletsTest.class,
	KangarooTest.class,
	BiggerIsGreaterTest.class
})

public class hackkerrankTS {
	//just testsuiting
}
