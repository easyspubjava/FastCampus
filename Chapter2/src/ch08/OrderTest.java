package ch08;

public class OrderTest {

	public static void main(String[] args) {

		Order myOrder = new Order();
		myOrder.orderNumber = "202011020003";
		myOrder.customerPhone = "01023450001";
		myOrder.customerAddress = "서울시 강남구 역삼동 111-333";
		myOrder.orderDate = "20201102";
		myOrder.orderTime = "130258";
		myOrder.price = 35000;
		myOrder.menuId = "0003";
		
		myOrder.showOrderDetail();
	}

}
