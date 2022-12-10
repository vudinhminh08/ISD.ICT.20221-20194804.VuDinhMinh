package controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import entity.media.Media;
import entity.order.Order;
import entity.order.OrderMedia;

public class PlaceRushOrderController {
//	private Media media;
	private int rushOrderFees = 0;

	private int total = 0;

	public boolean ValidateSupportedMedia(OrderMedia orderMedia) {

		if (orderMedia == null || orderMedia.getMedia().isSupport() == false)
			return false;
		else
			return true;
	}

	public boolean ValidateSupportedAddress(String address) {
		address = address.toLowerCase();
		if (address == null || address.isBlank() || address == "null")
			return false;
		if (address.contains("hanoi") || address.contains("ha noi")) {
			if (address.matches("^[.0-9a-zA-Z\\s,-]+$"))
				return true;
			else
				return false;
		} else
			return false;
	}

	public int placeRushOrder(Order order, String address) {
		List<OrderMedia> listOrderMedia = order.getlistOrderMedia();
		if (!ValidateSupportedAddress(address)) {
			System.out.println("This address is not supported to rush order!");
			return 0;
		}
		if (listOrderMedia == null)
			return 0;
		for (OrderMedia i : listOrderMedia) {
			if (ValidateSupportedMedia(i)) {
				System.out.println("This media is not supported: " + i.getMedia().getTitle());
			} else {
				total += changeFormulaShippingFees(i);
			}
		}
		return total;
	}

	public int changeFormulaShippingFees(OrderMedia orderMedia) {
		
		if ( orderMedia == null || orderMedia.getQuantity() == 0) {
			System.out.print("The order must not be empty!");
			return 0;
		}
		return rushOrderFees = 10 * orderMedia.getQuantity();
	}
}
