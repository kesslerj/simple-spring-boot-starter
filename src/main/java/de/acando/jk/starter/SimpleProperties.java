package de.acando.jk.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author Jonas Keßler (jonas.kessler@acando.de)
 */
@ConfigurationProperties("jk.starter")
public class SimpleProperties {

	String[] items = { "data", "transactions", "boot" };

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}

}
