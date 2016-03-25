package Task011;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by Ekaterina on 22.03.2016.
 */
public class LogBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        if (method.getName().equals("serverGo")){
            System.out.println("Starting");
            System.out.println();
            ArrayList<Integer> key = (ArrayList<Integer>) objects[0];
            for(Integer value: key){
                System.out.print(value);
            }
        }
    }
}
