package com.junit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.junit.externalAPI.ConsumeAPI;

/**
 * @author Naveen K Wodeyar
 * @date 04-Jul-2024
 * @apiDoc controller for consuming the external API's,
 */
@RestController
@RequestMapping("/api/v1/consume")
public class ConsumeAPIController {

	@Autowired
	private ConsumeAPI consumeAPI;
	
	@GetMapping("/get-byId/{pId}")
	public ResponseEntity<Object> getEmpById(@PathVariable Long pId){
		return ResponseEntity.ok(consumeAPI.getProducts(pId));
	}
	
}
