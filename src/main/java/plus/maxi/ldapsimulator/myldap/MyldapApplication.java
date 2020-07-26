package plus.maxi.ldapsimulator.myldap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MyldapApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyldapApplication.class, args);
    }

}
