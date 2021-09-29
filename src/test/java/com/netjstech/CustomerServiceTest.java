package com.netjstech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.netjstech.dao.ICustomerRepository;
import com.netjstech.entities.Customer;
import com.netjstech.service.ICustomerServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {

	@Mock
	private ICustomerRepository repository;
	
	@InjectMocks
	private ICustomerServiceImpl customerserviceimpl;
	
	@Test
	void addCustomerTest()
	{
		Customer cus=new Customer();
		cus.setCustomerId(6);
		cus.setAddress("30 RajaAnnaMalai puram Street chennai");
		cus.setCustomerName("Vidhya");
		cus.setPassword("hello26");
		cus.setEmail("vid23@yahoo.com");
		cus.setMobileNumber("9894567891");
		
		when(repository.save(cus)).thenReturn(cus);
		
		Customer savedcustomer=customerserviceimpl.addCustomer(cus);
		assertThat(savedcustomer).isNotNull();
		assertEquals("Vidhya",savedcustomer.getCustomerName());	
	}
	
	@Test
	void updateCustomerTest()
	{
		Customer cus=new Customer();
		cus.setCustomerId(5);
		cus.setAddress("26 south Rangarajan street");
		
		when(repository.save(cus)).thenReturn(cus);
		Customer savedcus=customerserviceimpl.updateCustomer(cus);
		assertThat(savedcus).isNotNull();
		assertEquals("26 south Rangarajan street",savedcus.getAddress());
	}
	@Test
	void viewCustomerByid()
	{
		Customer cust1=new Customer();
		cust1.setCustomerId(1);
		cust1.setCustomerName("Raju");
		repository.findById(cust1.getCustomerId());
		assertEquals(1,cust1.getCustomerId());
	}
	@Test
	void viewallCustomers()
	{
		
	}
	
}
