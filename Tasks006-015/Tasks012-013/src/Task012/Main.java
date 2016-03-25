package Task012;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Ekaterina on 24.03.2016.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
        Statement st = ac.getBean(Statement.class);
        ProxyFactory proxyFactory = new ProxyFactory(st);
        proxyFactory.addAdvice(new SqlInjectionProtection());
        st = (Statement) proxyFactory.getProxy();
        st.execute("SELECT from users WHERE id = 1;");
        st.execute("DROP TABLE users; ");


    }
}
