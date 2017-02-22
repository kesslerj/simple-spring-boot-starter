package de.acando.jk.starter.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Jonas Keßler (jonas.kessler@acando.de)
 */
public class ReverseOrderService implements SimpleService {

	@Override
	public List<String> orderItems(String... objects) {
		List<String> asList = Arrays.asList(objects);
		asList.sort(Comparator.reverseOrder());
		return asList;
	}

}
