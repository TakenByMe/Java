package HongBao;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class HongBao {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");//�޸������ʽ
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
			 System.out.println(df.format(amount)); 
		}else{
		double f = Math.random()*0.5;   
		 System.out.println(df.format(amount*f));       //�����һ��������
		double r=1-f;
		int i=1;
		while(i<=num-1){                              //ѭ���������ɺ����ռ�ٷֱ�              
			 double r2=Math.random()*r;     //��ֹ���
			 if(i==num-1){
			 System.out.println(df.format(amount*r)); break; 
			 }                                                    //��������һ�������ֹͣѭ����ֱ�ӵõ����һ������ٷֱȣ���ֹͣѭ��
			 i++;
			 System.out.println(df.format(amount*r2));         //����޸ĸ�ʽ֮��ĺ�����
			 r = r-r2;                                             //�޸İٷֱ�����
			 }  
		}
	}      
}

