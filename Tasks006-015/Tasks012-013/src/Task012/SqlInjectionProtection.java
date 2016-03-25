package Task012;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Ekaterina on 24.03.2016.
 */

public class SqlInjectionProtection implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        if (methodInvocation.getMethod().getName().equals("execute")) {
            String string = (String) methodInvocation.getArguments()[0];
            if (string.matches("((.*[;$])(.*))|(.*[=])")){
                System.out.println("Alert!");
            }

        }
        return methodInvocation.proceed();

    }
}
