package de.acando.jk.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import de.acando.jk.starter.service.DefaultOrderService;
import de.acando.jk.starter.service.NaturalOrderService;
import de.acando.jk.starter.service.ReverseOrderService;
import de.acando.jk.starter.service.SimpleService;

/**
 *
 * @author Jonas Keßler (jonas.kessler@acando.de)
 */
@Configuration
@ConditionalOnWebApplication
@ComponentScan("de.acando.jk.starter.rest")
public class SimpleAutoConfiguration {

	@Bean
	@ConditionalOnProperty(name = "itemordering", havingValue = "asc")
	SimpleService ascService() {
		return new NaturalOrderService();
	}

	@Bean
	@ConditionalOnProperty(name = "itemordering", havingValue = "reverse")
	SimpleService reverseService() {
		return new ReverseOrderService();
	}

	@Bean
	@ConditionalOnMissingBean
	SimpleService defaultService() {
		return new DefaultOrderService();
	}

}
