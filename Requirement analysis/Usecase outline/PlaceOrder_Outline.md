# _Usecase: Place order_
## Basic flow
1. Customer views the cart. (1.1)
2. Customer request to place an order.
3. System checks the order quantity.
4. System asks the customer to update the delivery information and delivery instructions.
5. Customer submits the delivery form.
6. System validates customer input.
7. System checks if the customer has chosen to place a rush order.
8. System calculates shipping fees.
9. System displays the receipt.
10. Customer confirms the receipt.
11. Customer provides transaction info.
12. System provides a list of payment methods
13. Customer choose a payment method.
14. System displays transaction information and card information
15. Administrators receive and manage the order.

## Alternative flow
1. Customer cancels the order (3.1)
2. Customer requests to place the order again. (5.1)
3. the system finds invalid infor, it asks the customer submit again. (6.1)
4. System checks if there is media and the shipping address that are supported to place rush order (7.1)
5. System displays the screen of rush order for customer to confirm it. (7.2)
6. Customer doesn’t choose a reasonable payment method, he chooses to quit the app. (13.1)
7. Admin or software rejects the order for some reasons. (15.1)
