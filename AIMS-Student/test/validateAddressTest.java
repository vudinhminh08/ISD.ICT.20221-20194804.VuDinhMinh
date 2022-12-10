import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import controller.PlaceOrderController;

class validateAddressTest {

	private PlaceOrderController placeOrderController;
	
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	@ParameterizedTest
	@CsvSource({
		"thanhxuan hanoi,true",
		"so 5 Thanh Xuan Hanoi,true",
		"$# Hanoi,false",
		"null,false",
		",false"
		
	})
	
	void test(String address, boolean expected) {
		boolean isValid = placeOrderController.validateAddress(address);
		assertEquals(expected, isValid);
	}

}
