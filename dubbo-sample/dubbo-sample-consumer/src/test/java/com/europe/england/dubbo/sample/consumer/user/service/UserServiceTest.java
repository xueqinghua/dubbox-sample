package com.europe.england.dubbo.sample.consumer.user.service;



import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.dubbo.config.annotation.Reference;
import com.europe.england.dubbo.sample.api.user.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	@Reference
	private UserService userService;

	@Test
	public void test() throws Exception {
		final double count = 10000.00;
		int times = 10;
		long start = System.nanoTime();
/*		for(double i=0;i<count;i++){
			userService.get("id_"+i);
		}*/
		long end = System.nanoTime();
		
		List<Thread> threads = new ArrayList<>();
		
		for(int i=0;i<times;i++){
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					for(double i=0;i<count;i++){
						userService.get("id_"+i);
					}
				}
			});
			threads.add(t);
			t.start();
		}
		
		
		for(Thread t:threads){
			t.join();
		}
		

		System.out.println((count*times*1000*1000*1000)/(end-start));
	}

}
