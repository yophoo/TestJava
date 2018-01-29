package yophoo.forfun.test;

public class TestBean001Demo{
	public static void main(String[] args){
		TestBean001<String> myBean=new TestBean001<String>();
		myBean.setId("EVA001");
		myBean.setName("Wall-E");
		myBean.setGender("male");
		myBean.setAge(30);
		
		TestBean001<Integer> yourBean=new TestBean001<Integer>();
		yourBean.setId(10001);
		yourBean.setName("Wall-E");
		yourBean.setGender("male");
		yourBean.setAge(30);
		
		TestBean001<?> theBean=null;
		theBean=myBean;
		System.out.println(theBean.getId());
		
		theBean=yourBean;
		System.out.println(theBean.getId());
	}
}