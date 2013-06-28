package com.ws.ac.api.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SampleManager {

	@Value("${prop.dataValue}")
	private String empName;


	public void createCompany() {}

}
