package com.cts.hrms;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.cts.hrms.dao.BranchDao;
import com.cts.hrms.entity.Branch;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        DriverManagerDataSource dmds=new DriverManagerDataSource();
//        dmds.setDriverClassName("com.mysql.jdbc.Driver");
//        dmds.setUrl("jdbc:mysql://localhost:3306/jfs004");
//        dmds.setUsername("root");
//        dmds.setPassword("");
//        
//        JdbcTemplate jt=new JdbcTemplate();
//        jt.setDataSource(dmds);
        
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
        BranchDao bdao= (BranchDao) ctx.getBean("bdao");
        
//        Branch branch=new Branch("B00010", "Atachay Branch", "Bangalore");
//        int no = bdao.create(branch);
//        int no=bdao.update(branch);
//        int no=bdao.delete("B00010");
//        System.out.println(no+" row(s) affected");

//        	List<Branch> branches = bdao.read();
//        	for(Branch b : branches)
//        	{
//        		System.out.println(b);
//        	}
        
        	Branch b = bdao.read("B00009");
        	System.out.println(b);
        
        System.out.println("fine");
    }
}
