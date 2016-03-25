package Task011;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by Ekaterina on 22.03.2016.
 */
public class LogAfter implements AfterReturningAdvice {


    @Override
    public void afterReturning(Object o, Method  method, Object[] objects, Object o1) throws Throwable {
        if (method.getName().equals("serverGo")){
            System.out.println("game started");
        }



    }
}
