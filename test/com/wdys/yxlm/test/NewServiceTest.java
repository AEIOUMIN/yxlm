package com.wdys.yxlm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wdys.yxlm.domain.New;
import com.wdys.yxlm.domain.Topic;
import com.wdys.yxlm.service.NewService;
import com.wdys.yxlm.service.TopicService;

import junit.framework.Assert;
import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class NewServiceTest {
	@Autowired
	private NewService newService;
	@Autowired
	private TopicService topicService;
	@Test
	public void testAdd(){
		New  news = new New();
		news.setAuthor("战士");
		Topic topic=	topicService.find(3L);
		news.setTopic(topic);
		newService.add(news);
		TestCase.assertNotNull(news.getId());
		
	}
}
