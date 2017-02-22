package de.acando.jk.starter.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.acando.jk.starter.service.SimpleService;

/**
 *
 * @author Jonas Keßler (jonas.kessler@acando.de)
 */
@RestController
public class SimpleController {

	@Autowired
	private SimpleService service;

	@Value("${items:data,transactions}")
	String[] items;

	@GetMapping("/startertest")
	public List<String> starterTest() {
		return service.orderItems(items);
	}

}
