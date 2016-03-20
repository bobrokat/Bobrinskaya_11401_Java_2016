package Task013;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Ekaterina on 19.03.2016.
 */
@Aspect
public class CorrectEmail {
    @Around("execution(* Task013.EmailSetter.setEmail(String))")
    public Object checkEmail(ProceedingJoinPoint jp) throws Throwable {
        String lang = (String) jp.getArgs()[0];
        if (!lang.matches("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$")) {
            System.out.println("It's not email!");
            return null;
        }
        return jp.proceed();
    }

}
