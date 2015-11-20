/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.CustomerDAO;
import java.util.List;
import pojo.Customer;

/**
 *
 * @author formacion
 */
public class CustomerFacade {
    
    private final CustomerDAO customerDAO;
    
    public CustomerFacade(){
        this.customerDAO = new CustomerDAO();
    }
    
    public List<Customer> getListaClientes(){
        return customerDAO.findAll();
    }
}
