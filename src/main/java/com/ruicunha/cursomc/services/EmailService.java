package com.ruicunha.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.ruicunha.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
