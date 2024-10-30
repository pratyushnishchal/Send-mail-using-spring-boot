package com.sendmail.send_email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sendmail.send_email.service.EmailService;

@RestController
@RequestMapping("/mail")
public class MailSendController {
	@Autowired
	private EmailService emailSer;
	@PostMapping("/send")
	public String sendMail(@RequestParam(value="file",required = false)MultipartFile[] file, String to, String[] cc, String subject, String body) {
		return emailSer.sendMail(file,to,cc,subject,body);
	}
}
