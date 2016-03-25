package Task011;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.ArrayList;

/**
 * Created by Ekaterina on 22.03.2016.
 */
public class DataValidation implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        if (methodInvocation.getMethod().getName().equals("serverGo")) {
            ArrayList<Integer> key  = (ArrayList<Integer>) methodInvocation.getArguments()[0];
            if (key.get(0) == 0){
                System.out.println("incorrect number");
            }

        }
        return methodInvocation.proceed();
    }
}
