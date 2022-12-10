
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceOrderController;

import org.junit.jupiter.api.Test;

class validateNameTest {

	private PlaceOrderController placeOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	@ParameterizedTest
	@CsvSource({
		"vuminh,true",
		"VuDinhMinh,true",
		"VuDinhMinh,true",
		"#?minh,false",
		",false",
		" ,false",
		"null,false",
	})

	void test(String name, boolean expected) {
		boolean isValid = placeOrderController.validateName(name);
		assertEquals(expected, isValid);
	}

}
