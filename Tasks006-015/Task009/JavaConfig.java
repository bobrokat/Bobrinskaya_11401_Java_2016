package Task009;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ekaterina on 18.03.2016.
 */
@Configuration
public class JavaConfig {

    @Bean
    @Qualifier("complexMatrix2x2")
    public ComplexMatrix2x2 complexMatrix2x2(){
        return new ComplexMatrix2x2();
    }

    @Bean
    public ComplexMatrix2x2 difcomplexMatrix2x2(){
        return new ComplexMatrix2x2(new ComplexNumber(1, 1), new ComplexNumber(2, 2), new ComplexNumber(3, 3), new ComplexNumber(4, 4));
    }

    @Bean ComplexMatrix2x2 eqcomplexMatrix2x2(){
        return new ComplexMatrix2x2(new ComplexNumber(1, 1));
    }
}
