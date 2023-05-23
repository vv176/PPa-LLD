package fooddelsys.apis;

import fooddelsys.data.Order;
import fooddelsys.data.OrderStatus;
import fooddelsys.data.User;
import fooddelsys.managers.OrderManager;
import fooddelsys.managers.UserManager;

public class UpdateOrderAPI {

    UserManager userManager = new UserManager();
    OrderManager orderManager = new OrderManager();

    public void updateOrder(int orderId, OrderStatus status, String userToken) {
        //...
        User user = userManager.getUserByToken(userToken);
        //
         Order order = orderManager.getOrder(orderId);
         //
        if (status.equals(OrderStatus.COOKING))
            orderManager.setOrderToCooking(user, order);

    }

}
