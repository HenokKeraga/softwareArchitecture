package shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import shop.customers.service.AddressDTO;
import shop.customers.service.CustomerDTO;
import shop.order.service.OrderDTO;
import shop.products.service.ProductDTO;
import shop.shopping.service.ShoppingCartDTO;

@SpringBootApplication
public class WebShopApplication implements CommandLineRunner {
	@Autowired
	private RestOperations  restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(WebShopApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		return restTemplate;
	}

	@Override
	public void run(String... args) throws Exception {
		//create customer
		CustomerDTO customerDto = new CustomerDTO("101","Frank","Brown","fBrown@Hotmail.com","123456");
		AddressDTO addressDTO = new AddressDTO("1000 N main Street", "Fairfield","52557","USA");
		customerDto.setAddress(addressDTO);
		//todo: call the customer component to add the customer
		String url="http://localhost:8080/customer";
	     restTemplate.postForEntity(url,customerDto,CustomerDTO.class);

		// get customer
		//todo: call the customer component to get the customer with id 101 and print the result
		String url2="http://localhost:8080/customer/101";
		ResponseEntity<CustomerDTO> customerDTOGet=restTemplate.getForEntity(url2,CustomerDTO.class);
		System.out.println(" The customer is \n" + customerDTOGet.getBody());
		//create products
		
		//todo: call the product component to create the first product 
		//todo: call the product component to create the second product
		String urlAddProduct1="http://localhost:8080/product/1/Soup/10.00";
		String urlAddProduct2="http://localhost:8080/product/2/Water/20.00";
		restTemplate.postForObject(urlAddProduct1,String.class,ProductDTO.class);
		restTemplate.postForObject(urlAddProduct2,String.class,ProductDTO.class);




		//set stock	
		//todo: call the product component to set the stock for the first product
		String urlAddProduct4="http://localhost:8080/product/stock/1/100/bereda";
		restTemplate.postForObject(urlAddProduct4,String.class,ProductDTO.class);

		//get a product
		//todo: call the product component to get the the first product and print the result
		String urlAddProduct3="http://localhost:8080/product/1";
		ResponseEntity<ProductDTO> productDTOResponseEntity= restTemplate.getForEntity(urlAddProduct3,ProductDTO.class);
		System.out.println("The first product is : " + productDTOResponseEntity.getBody());
		// add products to the shoppingcart
		//todo: call the shopping component to add the first product to the cart
		String urlAddCart1="http://localhost:8080/cart/1/1/22";
		restTemplate.postForObject(urlAddCart1,String.class,ShoppingCartDTO.class);
		//todo: call the shopping component to add the second product to the cart
		String urlAddCart2="http://localhost:8080/cart/1/2/11";
		restTemplate.postForObject(urlAddCart2,String.class,ShoppingCartDTO.class);
		//get the shoppingcart
		//todo: call the shopping component to get the cart and print the result
		String urlAddCart3="http://localhost:8080/cart/1";
		ResponseEntity<ShoppingCartDTO> shoppingCartDTO=restTemplate.getForEntity(urlAddCart3,ShoppingCartDTO.class);
		System.out.println("The first cart is : " +shoppingCartDTO.getBody());
		//checkout the cart		
		//todo: call the shopping component to checkout the cart
		//get the order
		//todo: call the order component to get the order and print the result 
		
		//add customer to order
		//todo: call the order component to add a customer to the order
		
		//confirm the order
		//todo: call the order component to confirm the order
		
		//get the order
		//todo: call the order component to get the order and print the result
		
	}


}
