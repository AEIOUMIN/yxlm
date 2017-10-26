package com.wdys.yxlm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wdys.yxlm.service.VideoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class VideoServiceTest {
	@Autowired
	private VideoService videoService;
	@Test
	public void testSave(){
		
	}
}
