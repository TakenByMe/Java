package HongBao;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class HongBao {
	public static void main(String[] args) {
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
		System.out.println(amount);
		}
		Random random = new Random();
		int f = random.nextInt(50)%(50);         //先生成第一个红包占总额百分比，最高设置为一半，以防止出现独占
		int r=100-f;
		int i=1;
	    DecimalFormat df = new DecimalFormat("#.00");//修改输出格式
		while(i<=num-1){                              //循环依次生成红包所占百分比
			 Random random2 = new Random();              
			 int r2=random2.nextInt(r)%(r)+1;
			 if(i==num-1){
			 System.out.println(df.format(amount*r/100)); break; 
			 }                                                    //如果是最后一个红包就停止循环，直接得到最后一个红包百分比，且停止循环
			 i++;
			 System.out.println(df.format(amount*r2/100));         //输出修改格式之后的红包金额
			 r = r-r2;                                             //修改金额上限
			 }  System.out.println(df.format(amount*f/100));       //输出第一个红包金额
	}      
}
