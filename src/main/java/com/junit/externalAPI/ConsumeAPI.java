package com.junit.externalAPI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Naveen K Wodeyar
 * @date 04-Jul-2024
 * @apiDoc com.junit.externalAPI
 */
@Service
public class ConsumeAPI {
	
	RestTemplate restTemplate = new RestTemplate();
	
	public String getProducts(Long pId) {
		String url = "https://dummyjson.com/products/"+pId;
		return restTemplate.getForObject(url, String.class);
	}
	
	

}
