package com.wdys.yxlm.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wdys.yxlm.domain.Area;
import com.wdys.yxlm.domain.Firend;
import com.wdys.yxlm.service.AreaService;
import com.wdys.yxlm.service.FirendService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class areaServiceTest {
	@Autowired
	private AreaService areaService;
	@Autowired
	private FirendService firendService;
	@Test
	public void testAdd(){
		Area area = new Area();
		area.setArea("恕瑞玛");
		Firend firend = new Firend();
		firend.setId(88L);
		firend.setAccount("dfasdf");
		firend.setName("德玛1asd");
		firend.setPassword("4asdf");
		firendService.add(firend);
		area.getFirend().getId();
		areaService.add(area);
		Assert.assertNotNull(area.getId());
	}
	
}
