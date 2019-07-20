package sample3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class HelloApp {

    public static void main(String[] args) {

    	// Beanファクトリー生成
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
        // BeanファクトリーからBeanを生成。今回でいうとMessageBeanJaびーんインスタンスが代入されている
        MessageBean bean = (MessageBean)factory.getBean("messageBean");
        bean.sayHello("Spring");
    }
}