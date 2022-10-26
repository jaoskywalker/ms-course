package com.jvictorweb.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.jvictorweb.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayments(long workerId, int days) {
		/*hardcoded*/
		return new Payment("Bob", 200.00, days);
	}
}
