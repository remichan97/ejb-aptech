/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectmsg;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.Topic;

/**
 *
 * @author Mirai
 */
public class SendData {

    @Resource(mappedName = "client_target")
    private static Topic client_target;

    @Resource(mappedName = "client_targetFactory")
    private static ConnectionFactory client_targetFactory;
    
    
    public static void main(String[] args) throws JMSException {
        new SendData().sendJMSMessage();
    }

    private void sendJMSMessage() throws JMSException {
        Connection connection = null;
        Session session = null;
        try {
            connection = client_targetFactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(client_target);
            
            SinhVien sv = new SinhVien("Binh Truong", "Hanoi", "0912378516", 24);
            
            ObjectMessage msg = session.createObjectMessage(sv);
            
            messageProducer.send(msg);
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (JMSException e) {
                    Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Cannot close session", e);
                }
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}
