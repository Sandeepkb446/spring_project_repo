package com.generateInvoice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generateInvoice.entity.InvoiceEntity;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

	@PostMapping("/generateInvoice")
	public String generateInvoice(@RequestBody InvoiceEntity entity) {
		return "your Invoice id is : = 'dh6398tds'" + entity.getItem()+ "thanks .";
	}

}
