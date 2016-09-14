package HongBao;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class HongBao {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");//修改输出格式
		Scanner input=new Scanner(System.in);
		System.out.println("输入总金额单位（元）例如666：");//获得总金额
		double amount= input.nextDouble();
		if(amount<=0){                            //判断输入是否合法
		System.out.println("输入有误！");
		}
		Scanner input2=new Scanner(System.in);
		System.out.println("输入红包个数（个）例如6：");  //获得红包个数
		int num=input2.nextInt();
		if(num<=0){                              //判断输入是否合法 
		System.out.println("输入有误！");
		}
		if(num==1){                              //单独处理红包为1的状况
			 System.out.println(df.format(amount)); 
		}else{
		double f = Math.random()*0.5;   
		 System.out.println(df.format(amount*f));       //输出第一个红包金额
		double r=1-f;
		int i=1;
		while(i<=num-1){                              //循环依次生成红包所占百分比              
			 double r2=Math.random()*r;     //防止溢出
			 if(i==num-1){
			 System.out.println(df.format(amount*r)); break; 
			 }                                                    //如果是最后一个红包就停止循环，直接得到最后一个红包百分比，且停止循环
			 i++;
			 System.out.println(df.format(amount*r2));         //输出修改格式之后的红包金额
			 r = r-r2;                                             //修改百分比上限
			 }  
		}
	}      
}

