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
import textmsg.MyInfo;

/**
 *
 * @author Mirai
 */
public class SendData {

    @Resource(mappedName = "client_target")
    private static Topic client_target;

    @Resource(mappedName = "jms_factory")
    private static ConnectionFactory _factory;
    
    
    public static void main(String[] args) throws JMSException {
        new SendData().sendJMSMessage();
    }

    private void sendJMSMessage() throws JMSException {
        Connection connection = null;
        Session session = null;
        try {
            connection = _factory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer pro = session.createProducer(client_target);
            
            MyInfo data = new MyInfo("Binh Truong", "C2005L", 24);
            
            ObjectMessage msg = session.createObjectMessage(data);
            
            pro.send(msg);
            
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
