package yophoo.forfun.test;

public class TestBean001<T>{
	private T id;
	private String name;
	private String gender;
	private Integer age;
	
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
	
	public void setAge(Integer age){
		this.age=age;
	}
	
	public Integer getAge(){
		return this.age;
	}
}