package com.eduardojr.cursomc2.services;

import org.springframework.mail.SimpleMailMessage;

import com.eduardojr.cursomc2.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
