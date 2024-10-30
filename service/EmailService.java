package com.sendmail.send_email.service;

import org.springframework.web.multipart.MultipartFile;

public interface EmailService {
	public String sendMail(MultipartFile[] file, String to,String[] cc, String subject, String body);
}
