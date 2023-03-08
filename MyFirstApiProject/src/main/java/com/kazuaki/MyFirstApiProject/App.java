package com.kazuaki.MyFirstApiProject;

import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;
public class App {
    public static void main(String[] args) throws Exception {
        //SMTP server configuration
        String smtpServer = "smtp.gmail.com";
        int smtpPort = 587;
        final String smtpUsername = "nishantrajqut83358@gmail.com";
        final String smtpPassword = "iktfmnlejhrmdryu";

        //Email message configuration
        String toAddress = "ns3300@dseu.ac.in";
        String subject = "first api project";
        String body = "this is my first api code with cry and pain lol";

        //Set the email properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", smtpServer);
        properties.put("mail.smtp.port", smtpPort);
        //Create a session with the SMTP server and authenticate with the user name and password
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(smtpUsername, smtpPassword);
            }
        });
        // Create the email message
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(smtpUsername));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress));
        message.setSubject(subject);
        message.setText(body);
        // Send the email message
        Transport.send(message);
        System.out.println("The mail is sent");
    }
}
