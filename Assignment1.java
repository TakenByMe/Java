package HongBao;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class HongBao {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�����ܽ�λ��Ԫ������666��");//����ܽ��
		double amount= input.nextDouble();
		if(amount<=0){                            //�ж������Ƿ�Ϸ�
		System.out.println("��������");
		}
		Scanner input2=new Scanner(System.in);
		System.out.println("��������������������6��");  //��ú������
		int num=input2.nextInt();
		if(num<=0){                              //�ж������Ƿ�Ϸ� 
		System.out.println("��������");
		}
		if(num==1){                              //����������Ϊ1��״��
		System.out.println(amount);
		}
		Random random = new Random();
		int f = random.nextInt(50)%(50);         //�����ɵ�һ�����ռ�ܶ�ٷֱȣ��������Ϊһ�룬�Է�ֹ���ֶ�ռ
		int r=100-f;
		int i=1;
	    DecimalFormat df = new DecimalFormat("#.00");//�޸������ʽ
		while(i<=num-1){                              //ѭ���������ɺ����ռ�ٷֱ�
			 Random random2 = new Random();              
			 int r2=random2.nextInt(r)%(r)+1;
			 if(i==num-1){
			 System.out.println(df.format(amount*r/100)); break; 
			 }                                                    //��������һ�������ֹͣѭ����ֱ�ӵõ����һ������ٷֱȣ���ֹͣѭ��
			 i++;
			 System.out.println(df.format(amount*r2/100));         //����޸ĸ�ʽ֮��ĺ�����
			 r = r-r2;                                             //�޸Ľ������
			 }  System.out.println(df.format(amount*f/100));       //�����һ��������
	}      
}
