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

import com.dongjoo.bbs.model.dao.IMyBBSDao;
import com.dongjoo.bbs.model.service.IMyBBSService;
import com.dongjoo.bbs.vo.MyBBS_VO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*.xml")
public class InquiryBBSTest {

	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private IMyBBSDao dao;

	
	@Bean
	public void before() {
		SqlSessionTemplate session = context.getBean("sqlSessionTemplate",SqlSessionTemplate.class);
	
	}
	
	@Test
	public void connectionTest() {
	
	}

}
