package com.xoriant.ecart.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.ecart.model.ItemLine;
import com.xoriant.ecart.model.Order;

@RestController
@RequestMapping("/api/cart")
public class CartRestController {

	@GetMapping("/{user}")
	public List<Order> getAll(@PathVariable String user) {
		
		return null;
	}

	@PostMapping("/{user}")
	public ResponseEntity<?> save(@RequestBody ItemLine[] itemLines, @PathVariable String user) {

		double totalAmount = Arrays.stream(itemLines).mapToDouble(line -> line.getItem().getPrice() * line.getQty())
				.sum();

		Order order = new Order();
		order.setId(100);
		order.setDate(LocalDate.now());
		order.setUser(user);
		order.setAmount(totalAmount);

		// save order to database

		return ResponseEntity.status(HttpStatus.CREATED).body(order);
	}

}
