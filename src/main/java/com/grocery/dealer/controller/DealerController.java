package com.grocery.dealer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.dealer.model.DealerModel;
import com.grocery.dealer.service.DealerService;

@RestController
public class DealerController {
	@Autowired
	DealerService dealerService;
	@GetMapping("/get/dealers")
	public List<DealerModel>getAllDealer(){
	return dealerService.getAllDealer();
	
	}

}
