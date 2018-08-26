/**
 * F-space
 * Project Name:fun-order-cs 
 * File Name:OrderApplication.java 
 * Package Name:com.fun 
 * Date:2018年8月22日上午10:34:50 
 * Copyright (C) 2016,F-space. All rights reserved.
 * 
 */
package com.fun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/** 
 * ClassName: OrderApplication <br/> 
 * Function: server starter. <br/> 
 * date: 2018年8月22日 上午10:34:50 <br/> 
 * 
 * @author lishuai11 
 * @version  
 * @since JDK 1.8
 */
@SpringBootApplication
//@EnableDiscoveryClient
@EnableJpaAuditing
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}
	
}
