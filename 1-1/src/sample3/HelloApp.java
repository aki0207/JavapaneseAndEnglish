package sample3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class HelloApp {

    public static void main(String[] args) {

    	// Bean�t�@�N�g���[����
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
        // Bean�t�@�N�g���[����Bean�𐶐��B����ł�����MessageBeanJa�с[��C���X�^���X���������Ă���
        MessageBean bean = (MessageBean)factory.getBean("messageBean");
        bean.sayHello("Spring");
    }
}