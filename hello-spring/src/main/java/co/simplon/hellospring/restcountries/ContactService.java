package co.simplon.hellospring.restcountries;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class ContactService {

    @Value("${co.simplon.hello-spring.email.from}")
    private String emailFrom;

    private final JavaMailSender sender;

    public ContactService(JavaMailSender sender) {
	this.sender = sender;
    }

    void sendMail(ContactForm form) {
	try {
	    MimeMessage message = sender.createMimeMessage();
	    MimeMessageHelper helper = new MimeMessageHelper(message);
	    helper.setFrom(emailFrom);
	    helper.setReplyTo(emailFrom);
	    helper.setTo(form.email());
	    helper.setSubject("email from Spring");
	    helper.setText(form.comments(), true);
	    sender.send(message);
	} catch (MessagingException e) {
	    System.err.println(e);
	}
	//
	System.out.println(form);
	System.out.println("emailFrom=" + emailFrom);
    }
}
