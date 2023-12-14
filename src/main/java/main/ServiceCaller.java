package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import services.IPaymentService;

@Component
public class ServiceCaller {
	private IPaymentService paymentService;
	
	@Autowired
	@Qualifier("venmoPaymentService") 
	public void setPaymentService(IPaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void executePayment() {
		paymentService.processPayment();
	}
}
