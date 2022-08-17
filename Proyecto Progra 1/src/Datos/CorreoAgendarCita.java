
package Datos;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class CorreoAgendarCita {
    
    static final String FROM = "cityftnss@gmail.com";
    static final String FROMNAME = "City Fitness"; 
    
    static final String SMTP_USERNAME = "cityftnss@gmail.com";
    static final String SMTP_PASSWORD = "ijdxvbmdjvnbzjdq";
    
    static final String CONFISET = "ConfigSet";
    
    static final String HOST = "smtp.gmail.com";
    static final int PORT = 587;
    
    public void enviarMensaje(String Destinatario, String Asunto, String Cuerpo) throws UnsupportedEncodingException, MessagingException{
        
        Properties propiedades = System.getProperties();
        propiedades.put("mail.transport.protocol" , "smtp");
        propiedades.put("mail.smtp.port",PORT);
        propiedades.put("mail.smtp.starttls.enable", "true");
        propiedades.put("mail.smtp.auth","true");
        
        Session sesion = Session.getDefaultInstance(propiedades);
        
        MimeMessage mg = new MimeMessage(sesion);
        mg.setFrom(new InternetAddress(FROM, FROMNAME));
        mg.setRecipient(Message.RecipientType.TO, new InternetAddress(Destinatario));
        mg.setSubject(Asunto);
        mg.setContent(Cuerpo, "text/html");
        mg.setHeader("X-SES-CONFIGURATION-SET", CONFISET);
        
        Transport transporte = sesion.getTransport();
        try {
            transporte.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);
            transporte.sendMessage(mg, mg.getAllRecipients());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            transporte.close();
        }
}
}
