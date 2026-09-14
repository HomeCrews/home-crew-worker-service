package com.homecrew.workerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class WorkerserviceApplication {

  public static void main(String[] args) {
    SpringApplication.run(WorkerserviceApplication.class, args);
  }
}
