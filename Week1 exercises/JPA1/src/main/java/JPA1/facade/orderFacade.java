/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA1.facade;

import JPA1.Entity.Customer;
import JPA1.Entity.ItemType;
import JPA1.Entity.Orders;
import JPA1.Entity.OrderLine;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Peter
 */
public class orderFacade implements orderFacadeInterface {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpadb");
    EntityManager em = emf.createEntityManager();

    Customer customer = new Customer();
    Orders o = new Orders();
    ItemType it = new ItemType();
    OrderLine ol = new OrderLine();
    ArrayList<Customer> customers = new ArrayList();

    @Override
    public Customer createCustomer(Customer customer) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(customer);
            em.getTransaction().commit();
            customers.add(customer);
            return customer;

        } finally {
            em.close();
        }
    }

    @Override
    public Customer findCustomerName(Customer customer) {
        return null;
    }

    @Override
    public void getAllCustomers() {

        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i).getName());
        }
    }

    @Override
    public Orders createOrder(Orders order) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(order);
            em.getTransaction().commit();
            return order;
        } finally {
            em.close();
        }
    }

    @Override
    public Orders addOrderToCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Orders findOrder(int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItemType createItemType(ItemType itemtype) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(itemtype);
            em.getTransaction().commit();
            return itemtype;
        } finally {
            em.close();
        }
    }

    @Override
    public OrderLine createOrderLine(OrderLine orderline) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(orderline);
            em.getTransaction().commit();
            return orderline;
        } finally {
            em.close();
        }
    }

    @Override
    public ItemType findTotalPrice(int Price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
