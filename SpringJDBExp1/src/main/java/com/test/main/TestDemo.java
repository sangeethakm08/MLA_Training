package com.test.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.MLATeamDao;
import com.test.model.MLATeam;

//import com.test.dao.MLATeamDao;

public class TestDemo {
	
	public static void main(String[] args) {		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		MLATeamDao dao = ctx.getBean("tdao", MLATeamDao.class);
		
		MLATeam obj = new MLATeam();
		
		obj.setId(101);
		obj.setName("adas"); 
		obj.setSkill("sdfg");
		obj.setManager("aasfbc");
		
		dao.saveMLATeam(obj);
//		dao.updateMLATeam(obj);

		List<MLATeam> list = dao.getAllMembers();
		list.forEach(team ->
		System.out.println(team.getId()+" "+team.getName()+" "+team.getSkill()+" "+team.getManager())
		);
		
		//dao.deleteMLATeam(obj);
		
	}
}
