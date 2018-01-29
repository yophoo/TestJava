package yophoo.forfun.test;

import java.util.*;

public class TestBean<T,E extends List<String>>{
	private T id;
	private String name;
	private String gender;
	private E about;
	
	public void setId(T id){
		this.id=id;
	}
	
	public T getId(){
		return this.id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setGender(String gender){
		this.gender=gender;
	}
	
	public String getGender(){
		return this.gender;
	}
	
	public void setAbout(E about){
		this.about=about;
	}
	
	public E getAbout(){
		return this.about;
	}
}