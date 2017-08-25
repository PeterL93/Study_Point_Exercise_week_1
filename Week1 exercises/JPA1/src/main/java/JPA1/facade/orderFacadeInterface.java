/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA1.facade;

import JPA1.Entity.Customer;
import JPA1.Entity.ItemType;
import JPA1.Entity.OrderLine;
import JPA1.Entity.Orders;

/**
 *
 * @author Peter
 */
public interface orderFacadeInterface {
    
    public Customer createCustomer(Customer customer);
    
    public Customer findCustomerName(Customer customer);
    
    public void getAllCustomers();
    
    public Orders createOrder(Orders orderId);
    
    public Orders addOrderToCustomer();
    
    public Orders findOrder(int orderId);
    
    public ItemType createItemType(ItemType itemtype);
    
    public OrderLine createOrderLine(OrderLine orderline);
    
    public ItemType findTotalPrice(int Price);
    
    
    
    
    
    
    
    
}
