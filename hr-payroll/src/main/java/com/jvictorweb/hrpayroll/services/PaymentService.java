package com.jvictorweb.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvictorweb.hrpayroll.entities.Payment;
import com.jvictorweb.hrpayroll.entities.Worker;
import com.jvictorweb.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {


	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayments(long workerId, int days) {

		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
