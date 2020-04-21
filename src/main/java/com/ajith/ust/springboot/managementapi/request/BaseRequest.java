package com.ajith.ust.springboot.managementapi.request;

import java.io.Serializable;

public class BaseRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private String appName = "ManagementApi";
	
	private String version = "Version 1.0";

	
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
}
