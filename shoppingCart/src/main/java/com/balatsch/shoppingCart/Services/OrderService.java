package com.balatsch.shoppingCart.Services;

import com.balatsch.shoppingCart.entities.OrderDetail;
import com.balatsch.shoppingCart.entities.Orders;

public interface OrderService {
    public Orders createOrder(Orders orders, OrderDetail orderDetail);


}
