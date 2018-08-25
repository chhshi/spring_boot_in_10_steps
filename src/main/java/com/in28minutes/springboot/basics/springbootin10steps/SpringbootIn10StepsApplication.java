package com.in28minutes.springboot.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @SpringBootApplication Means:
 * 1) This is Spring Application
 * 2) Enables Auto Configuration
 * 3) Enables Component Scan (default this package)
 *
 * ref: http://www.springboottutorial.com/spring-boot-auto-configuration
 *
 * Example[ConditionalOnClass]
 *  Means: This configuration is enabled only when these classes are available in the classpath.
 *
 * @Configuration
 * @ConditionalOnClass({ DataSource.class, EmbeddedDatabaseType.class })
 * @EnableConfigurationProperties(DataSourceProperties.class)
 * @Import({ Registrar.class, DataSourcePoolMetadataProvidersConfiguration.class })
 * public class DataSourceAutoConfiguration {...}
 *
 */

@SpringBootApplication
public class SpringbootIn10StepsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
		SpringApplication.run(SpringbootIn10StepsApplication.class, args);

		for (String names : applicationContext.getBeanDefinitionNames()) {
			System.out.println(names);
		}
	}
}
