package com.station.grid.provider.core.bootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.station.grid.dao.entity")
@EnableJpaRepositories("com.station.grid.dao.repository")
public class ServiceApplication {
    public static void main(String[] args) {
      //  new SpringApplicationBuilder(ServiceApplication.class)
        //        .web(WebApplicationType.NONE)
          //      .run(args);

        SpringApplication.run(ServiceApplication.class, args);
    }
}
