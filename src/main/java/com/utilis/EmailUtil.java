package com.utilis;

import java.io.File;
import java.util.Properties;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Multipart;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

public class EmailUtil {

    public static void sendExtentReportEmail(String reportPath, String toEmail) {
        final String username = "abctest539@gmail.com";       // Replace with actual email
        final String password = "bmxn cnog ihwm uztc";           // Replace with app password

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");          // SMTP Host
        props.put("mail.smtp.port", "587");                     // TLS Port
        props.put("mail.smtp.auth", "true");                    // enable authentication
        props.put("mail.smtp.starttls.enable", "true");  // enable STARTTLS
        props.put("mail.smtp.ssl.trust", "*");

        Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("📄 Extent Report - Automation Results");

            MimeBodyPart bodyPart = new MimeBodyPart();
            bodyPart.setText("Hi,\n\nPlease find the attached extent report.\n\nRegards,\nAutomation Framework");

            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(new File(reportPath));

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(bodyPart);
            multipart.addBodyPart(attachmentPart);

            message.setContent(multipart);
            Transport.send(message);

            System.out.println("📩 Report Email Sent Successfully to " + toEmail);

        } catch (MessagingException | java.io.IOException e) {
            e.printStackTrace();
        }
    }
}