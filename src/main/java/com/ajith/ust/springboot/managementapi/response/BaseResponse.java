package com.ajith.ust.springboot.managementapi.response;

public class BaseResponse {
	
    private String appName = "Management Api";	
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
