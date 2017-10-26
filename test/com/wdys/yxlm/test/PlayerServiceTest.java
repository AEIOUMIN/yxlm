package com.wdys.yxlm.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wdys.yxlm.core.util.PagedList;
import com.wdys.yxlm.domain.User;
import com.wdys.yxlm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class PlayerServiceTest {
	@Autowired
	private UserService userService;
	@Test
	public void testAdd(){
		User user = new User();
		
		user.setName("5");
		user.setAccount("5");
		user.setPassword("5");
		
		userService.add(user);
		Assert.assertNotNull(user.getId());
	}
	@Test
	public void testUpdate(){
		User user =userService.find(1L);
		user.setAccount("111");
		userService.update(user);
		Assert.assertEquals("111", user.getAccount());
	}
	@Test
	public void testDelete(){
		
		userService.delete(3L);
		User user=userService.find(3L);
		Assert.assertNull(user);
	}
	@Test
	public void testDeleteAll(){
		userService.delete(new Long[]{1L,4L});
		User  user=userService.find(4L);
		Assert.assertNull(user);
	}
	@Test
	public void testFindOne(){
		User user=userService.find(5L);
		//Assert.assertNotNull(user);
		Assert.assertEquals(Long.valueOf(5L), user.getId());
	}
	@Test
	public void testFindAll(){
	List<User> user=	userService.finaAll();
	Assert.assertTrue(user.size()>0);
	}
	@Test
	public void testFindPage(){
	PagedList<User> user=	userService.findPage(1, 2, "");
	for(User us:user.getRows()){
		System.out.println(us);
	}
	Assert.assertTrue(user.getRows().size()>0);
	}
}
