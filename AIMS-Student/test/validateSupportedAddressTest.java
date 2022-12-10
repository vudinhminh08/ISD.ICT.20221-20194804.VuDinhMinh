
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceRushOrderController;

class validateSupportedAddressTest {
	private PlaceRushOrderController placeRushOrderController;
	
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}
	@ParameterizedTest
	@CsvSource({
		"hanoi,true",
		"phu tho,false",
		"Ha Noi,true",
		"PhuTho,false",
		"&#HaNoi,false",
		"null,false"
	})

	public void test(String address, boolean expected) {
		boolean isValid = placeRushOrderController.ValidateSupportedAddress(address);
		assertEquals(expected, isValid);
	}
}