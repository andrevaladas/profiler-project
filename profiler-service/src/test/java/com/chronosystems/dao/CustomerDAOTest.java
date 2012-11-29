/**
 * 
 */
package com.chronosystems.dao;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chronosystems.entity.Customer;
import com.chronosystems.service.CustomerService;

/**
 * @author Andre Valadas
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:**/WEB-INF/applicationContext*.xml" })
public class CustomerDAOTest {

	@Autowired
	private CustomerService customerService;

	@Test
	public void testSave() {
		final Customer customer = new Customer();
		customer.setName("Development " + System.currentTimeMillis());
		customerService.save(customer);
		// fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		// fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		final Customer customer = customerService.findById(Long.valueOf(1));
		Assert.assertNotNull("Customer can't be null ", customer);
	}

	@Test
	public void testFindAll() {
		final List<Customer> findAll = customerService.findAll();
		for (final Customer customer : findAll) {
			System.out.println(customer.getId() + " - " + customer.getName());
		}
		Assert.assertTrue("Customer can't be null ", findAll.size() > 0);
	}

}
