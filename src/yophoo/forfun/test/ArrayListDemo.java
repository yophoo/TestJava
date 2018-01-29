package yophoo.forfun.test;

import java.util.*;

public class ArrayListDemo{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		List<String> list=new ArrayList<String>();
		
		System.out.println("输入名称（以quit结束）:");
		
		while(true){
//			System.out.print("# ");
			String input=scanner.next();
			if(input.equals("quit")) break;
			list.add(input);
		}
		
		System.out.println("显示输入：");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
			System.out.println();
		}
		scanner.close();
	}
}