package com.grocery.dealer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.dealer.model.DealerModel;
import com.grocery.dealer.repository.DealerRepository;

@Service
public class DealerService {
     @Autowired
     DealerRepository dealerRepository;
	public List<DealerModel>getAllDealer(){
		return dealerRepository.getAllDealer();
		
	}
}
