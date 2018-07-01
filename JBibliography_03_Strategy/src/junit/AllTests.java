package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses( {TestBib.class })
/*
 * The key is in the @RunWith annotation, which tells the JUnit 4 test runner to
 * use the org.junit.runners.Suite class for running this particular class. The
 * @Suite annotation, on the other hand, tells the Suite runner which test
 * classes to include in this suite and in which order
 */
public class AllTests {
	// the class remains completely empty,
	// being used only as a holder for the above annotations
}
