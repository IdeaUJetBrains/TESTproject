package test_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    private String message;

    @Bean
    public TransferService transferService() {
        return new TransferServiceImpl1();
    }

    @Bean
    public TransferService transferService1() {
        return new TransferServiceImpl1();
    }


    @Bean
    public TransferService transferService2() {
        return new TransferServiceImpl1();
    }

    @Bean
    public TransferService transferService3() {
        return new TransferServiceImpl1();
    }

    @Bean
    public TransferService transferService4() {
        return new TransferServiceImpl1();
    }


    public void setMessage1(String message){
        this.message  = message;
    }
    public void getMessage1(){
        System.out.println("Your Message : " + message);
    }
}
