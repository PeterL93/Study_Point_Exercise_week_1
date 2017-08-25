/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA1.jpacontrol;

import JPA1.Entity.Customer;
import JPA1.Entity.ItemType;
import JPA1.Entity.OrderLine;
import JPA1.Entity.Orders;
import JPA1.facade.orderFacade;

/**
 *
 * @author Peter
 */
public class Populate {

    public static void main(String[] args) {
        orderFacade of = new orderFacade();
        Customer customer = new Customer();
        Orders order = new Orders();
        OrderLine orderline = new OrderLine();
        ItemType itemtype = new ItemType();

        customer.setName("Petes");
        customer.setEmail("Petes@dk.dk");
        of.createCustomer(customer);
        
        order.setOrderId(17);
        of.createOrder(order);
        
        orderline.setQuantity(1000000);
        of.createOrderLine(orderline);
        
        itemtype.setName("Fliser");
        itemtype.setDescription("Det er fliser");
        itemtype.setPrice(2);
        of.createItemType(itemtype);
        
        of.getAllCustomers();
        
        

    }
    
    

}
