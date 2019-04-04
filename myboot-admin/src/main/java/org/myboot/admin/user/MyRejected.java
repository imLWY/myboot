package org.myboot.admin.user;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class MyRejected implements RejectedExecutionHandler {

	
	public void RejectedExecutionHandler(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("sss", "sss");
	}
	
	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println("任务拒绝了");
		System.out.println("任务名称为"+r.toString());
	}

}
