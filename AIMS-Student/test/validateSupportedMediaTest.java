import static org.junit.Assert.assertEquals;
import java.sql.SQLException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import controller.PlaceRushOrderController;
import entity.media.Media;
import entity.order.OrderMedia;

class validateSupportedMediaTest {

	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}

	@Test
	public void test() {
		OrderMedia orderMedia = null;
		boolean isValid = placeRushOrderController.ValidateSupportedMedia(orderMedia);
		assertEquals(false, isValid);
	}
	@Test
	public void test1() throws SQLException {
		Media media1 = new Media(1,"Harry Potter","Film",10,10,"DVD",false);
		OrderMedia orderMedia1 = new OrderMedia(media1, 1, 10);
		boolean isValid = placeRushOrderController.ValidateSupportedMedia(orderMedia1);
		assertEquals(false, isValid);
	}
	@Test
	public void test2() throws SQLException {
		Media media2 = new Media(2,"Romero and Juliet","Movie",15,9,"Book", false);
		OrderMedia orderMedia2 = new OrderMedia(media2, 8, 15);
		boolean isValid = placeRushOrderController.ValidateSupportedMedia(orderMedia2);
		assertEquals(false, isValid);
	}
	@Test
	public void test3() throws SQLException {
		Media media3 = new Media(3,"Marvel","Comic",2,9,"CD",true);
		OrderMedia orderMedia3 = new OrderMedia(media3, 2, 10);
		boolean isValid = placeRushOrderController.ValidateSupportedMedia(orderMedia3);
		assertEquals(true, isValid);
	}
	@Test
	public void test4() throws SQLException {
		Media media4 = new Media(4,"Lady Gaga","Music",12,9,"DVD",true);
		OrderMedia orderMedia4 = new OrderMedia(media4, 13, 13);
		boolean isValid = placeRushOrderController.ValidateSupportedMedia(orderMedia4);
		assertEquals(true, isValid);
	}
	@Test
	public void test5() throws SQLException {
		Media media5 = new Media(5,"Yuna","Kpop",11,2,"DVD");
		OrderMedia orderMedia5 = new OrderMedia(media5, 3, 9);
		boolean isValid = placeRushOrderController.ValidateSupportedMedia(orderMedia5);
		assertEquals(false, isValid);
	}

}
