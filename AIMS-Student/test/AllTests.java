import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ changeFormulaShippingFees.class, validateAddressTest.class, validateNameTest.class,
		validatePhoneNumberTest.class, validateSupportedAddressTest.class, validateSupportedMediaTest.class })
public class AllTests {

}
