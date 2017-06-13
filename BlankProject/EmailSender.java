import java.util.Properties;


public class EmailSender {

	// This is top secret code. But you can check out the "API"
	public void send(String recipient, String subject, String text) {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("cs106a.winter.16@gmail.com",getTopSecretPassword());
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("cs106a.winter.16@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(text);

			Transport.send(message);

			System.out.println("Email sent to: " + recipient);
			
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

	protected String getTopSecretPassword() {
		return ":-)";
	}
}