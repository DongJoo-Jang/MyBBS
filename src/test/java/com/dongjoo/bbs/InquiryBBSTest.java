package com.dongjoo.bbs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dongjoo.bbs.model.dao.IInquiryDao;
import com.dongjoo.bbs.vo.InquiryBBS_VO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB_INF/spring/**/*.xml")
public class InquiryBBSTest {

	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private IInquiryDao dao;
	
	@Bean
	public void before() {
		SqlSessionTemplate session = context.getBean("sqlSessionTemplate",SqlSessionTemplate.class);
		System.out.println(session);
	}
	
	@Test
	public void connectionTest() {
		InquiryBBS_VO vo = new InquiryBBS_VO();
		vo.setUserid("JUnitTest");
		vo.setTitle("JUnitTest");
		vo.setContent("JUnitTest");
		int cnt = dao.insertBBS(vo);
		assertEquals(1, cnt);
		
	}

}
