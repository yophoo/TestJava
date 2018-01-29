package yophoo.forfun.test;

import java.util.*;

public class TestBeanDemo{
	public static void main(String[] args){		
		TestBean<Integer,ArrayList<String>> testBean=new TestBean<Integer,ArrayList<String>>();
		testBean.setId(0001);
		testBean.setName("yophoo");
		testBean.setGender("male");
		
		ArrayList<String> about=new ArrayList<String>();
		about.add(new String("He is a newbee!"));
		about.add(new String("He likes reading!"));
		
		testBean.setAbout(about);
		
		for(int i=0;i<testBean.getAbout().size();i++){
			System.out.println(testBean.getAbout().get(i));
		}
	}
}