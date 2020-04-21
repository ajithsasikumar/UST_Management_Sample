package com.ajith.ust.springboot.managementapi;

import java.util.HashMap;
import java.util.Map;

import com.ajith.ust.springboot.managementapi.bo.EmployeeInfo;


public class AppContext {
   
    private static String TENANT_ID = "TENANT_ID";
	
	private static String EMPLOYEE_INFO = "EMPLOYEE_INFO";
	
	private static final ThreadLocal<Map<String, Object>> CONTEXT = new ThreadLocal<>();
	
	public static void setTenantId(String tenantId) {
		Map<String, Object> contextMap = CONTEXT.get();
		if (contextMap == null) 
			contextMap = new HashMap<>();
		contextMap.put(TENANT_ID, tenantId);
		CONTEXT.set(contextMap);
	}

	public static String getTenantId() {
		Map<String, Object> contextMap = CONTEXT.get();
		return contextMap == null ? null : (String)contextMap.get(TENANT_ID);
	}
	
	
	public static void setUserInfo(EmployeeInfo employeeInfo) {
		Map<String, Object> contextMap = CONTEXT.get();
		if (contextMap == null) 
			contextMap = new HashMap<>();
		contextMap.put(EMPLOYEE_INFO, employeeInfo);
		CONTEXT.set(contextMap);
	}

	public static EmployeeInfo getUserInfo() {
		Map<String, Object> contextMap = CONTEXT.get();
		return contextMap == null ? null : (EmployeeInfo)contextMap.get(EMPLOYEE_INFO);
	}

	public static void clear() {
		CONTEXT.remove();
	}
	
}
