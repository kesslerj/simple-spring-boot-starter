package de.acando.jk.starter.service;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jonas Keßler (jonas.kessler@acando.de)
 */
public class DefaultOrderService implements SimpleService {

	@Override
	public List<String> orderItems(String... objects) {
		return Arrays.asList(objects);
	}

}
