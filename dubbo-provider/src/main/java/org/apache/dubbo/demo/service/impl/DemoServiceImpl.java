package org.apache.dubbo.demo.service.impl;

import java.time.LocalDateTime;

import org.apache.dubbo.demo.service.DemoService;
import org.apache.dubbo.rpc.RpcContext;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		StringBuilder builder = new StringBuilder();
		builder.append("[").append(LocalDateTime.now().toString()).append("] Hello ").append(name)
				.append(", request from consumer: ").append(RpcContext.getContext().getRemoteAddress());

		System.out.println(builder);
		return builder.toString();
	}

}
