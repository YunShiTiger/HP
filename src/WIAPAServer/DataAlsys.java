package WIAPAServer;

import dataToXML.DBtoXML;
import DB.DBUtil;
import DB.DBUtileAll;


public class DataAlsys {

	public void alsys(byte[] b){ 
		//DBUtil util=new DBUtil();   �滻���
		DBUtileAll DBall=new DBUtileAll();
		if(b[3]==0x21){
			System.out.println("�к�������");
			String device="infrared";
			String s=""+b[5];		//��BYTEתΪ�ַ���
			switch(b[4]){
			case 1:								
				DBall.update(device,1, s);			//�����µ�ֵ���浽���ݿ�
				System.out.println("�����豸1��ֵ����Ϊ��"+s);
				break;
			case 2:				
				DBall.update(device,2, s);
				System.out.println("�����豸2��ֵ����Ϊ��"+s);
				break;
			case 3:
				DBall.update(device,3, s);
				System.out.println("�����豸3��ֵ����Ϊ��"+s);
				break;
			case 4:
				DBall.update(device,4, s);
				System.out.println("�����豸4��ֵ����Ϊ��"+s);
				break;
			case 5:
				DBall.update(device,5, s);
				System.out.println("�����豸5��ֵ����Ϊ��"+s);
				break;
				}
			}
		else if(b[3]==0x22){
			System.out.println("���Ŵ�����");
			String s=""+b[5];		//��BYTEתΪ�ַ���,����λΪ����λ
			String device="magnetic";
			switch(b[4]){
			case 1:
				DBall.update(device,1, s);
				System.out.println("�Ŵ��豸1��ֵ����Ϊ"+s);
				break;
			case 2:
				DBall.update(device,2, s);
				System.out.println("�Ŵ��豸2��ֵ����Ϊ"+s);
				break;
			case 3:
				DBall.update(device,3, s);
				System.out.println("�Ŵ��豸3��ֵ����Ϊ"+s);
				break;
			case 4:
				DBall.update(device,4, s);
				System.out.println("�Ŵ��豸4��ֵ����Ϊ"+s);
				break;
			case 5:
				DBall.update(device,5, s);
				System.out.println("�Ŵ��豸5��ֵ����Ϊ"+s);
				break;
				}				
			}
		else if(b[3]==0x23){
			System.out.println("�в�������");
			String s=""+b[5];		//��BYTEתΪ�ַ���,����λΪ����λ
			String device="windowbreak";
			switch(b[4]){
			case 1:
				DBall.update(device,1, s);
				System.out.println("�����豸1��ֵ����Ϊ"+s);
				break;
			case 2:
				DBall.update(device,2, s);
				System.out.println("�����豸2��ֵ����Ϊ"+s);
				break;
			case 3:
				DBall.update(device,3, s);
				System.out.println("�����豸3��ֵ����Ϊ"+s);
				break;
			case 4:
				DBall.update(device,4, s);
				System.out.println("�����豸4��ֵ����Ϊ"+s);
				break;
				}
			}
		else if(b[3]==0x24){
			System.out.println("����ζ����");
			/*�ж�����ζ֮���ȸ�ֵ */
			String device="smell";
			String s=null;
			switch(b[5]){
			case 0:
				s="1";
				break;
			case 1:
				s="2";
				break;
			case 2:
				s="3";
				break;
			case 3:
				s="4";
				break;
			
			}
			
			switch(b[4]){
			case 1:
				DBall.update(device,1, s);
				System.out.println("��ζ�豸1��ֵ����Ϊ"+s);
				break;
			case 2:
				DBall.update(device,2, s);
				System.out.println("��ζ�豸2��ֵ����Ϊ"+s);
				break;
			case 3:
				DBall.update(device,3, s);
				System.out.println("��ζ�豸3��ֵ����Ϊ"+s);
				break;
			case 4:
				DBall.update(device,4, s);
				System.out.println("��ζ�豸4��ֵ����Ϊ"+s);
				break;
			case 5:
				
				DBall.update(device,5, s);
				System.out.println("��ζ�豸5��ֵ����Ϊ"+s);
				break;
			case 6:
				DBall.update(device,6, s);
				System.out.println("��ζ�豸6��ֵ����Ϊ"+s);
				break;
				}
			
			
		}
		else if(b[3]==0x26){
			System.out.println("�л�������");
			String s=""+b[5];		//��BYTEתΪ�ַ���,����λΪ����λ
			String device="fire";
			switch(b[4]){
			case 1:
				DBall.update(device,1, s);
				System.err.println("�����豸1��ֵ����Ϊ"+s);
				break;
			case 2:
				DBall.update(device,2, s);
				System.err.println("�����豸2��ֵ����Ϊ"+s);
				//System.out.println("�����豸2��ֵ����Ϊ"+s);
				break;
			case 3:
				DBall.update(device,3, s);
				System.err.println("�����豸3��ֵ����Ϊ"+s);
				break;
			case 4:
				DBall.update(device,4, s);
				System.err.println("�����豸4��ֵ����Ϊ"+s);
				break;
			case 5:				
				DBall.update(device,5, s);
				System.err.println("�����豸5��ֵ����Ϊ"+s);
				break;
			case 6:				
				DBall.update(device,6, s);
				System.err.println("�����豸6��ֵ����Ϊ"+s);
				break;
				
			}
		}
		else if(b[3]==0x27){
			System.out.println("����������");
			int[] B= new int[7];
			for (int i = 0; i < B.length; i++) {
				B[i]=b[i];
				if(B[i]<0){				//�Ը������д���
					B[i]=B[i]+256;		//BYTE�ķ�Χ��-127��128����Ӧ��λ��ʮ����������ʮλ��8��8�Ժ�Ķ��Ǹ���
				}
			}
			int a=256*B[5]+B[6];			
			//double d=a*0.1292/2;
			/*int dw=(int) (d/10000);
			int dq=(int) (d%10000/1000);
			int db=(int) (d%10000%1000/100);
			int ds=(int) (d%10000%1000%100/10);
			int dg=(int) (d%10000%1000%100%10);
			String s =dw+""+dq+""+db+"."+ds+""+dg;
			double d=a*12.92;
			int dw=(int) (d/10000);
			int dq=(int) (d%10000/1000);
			int db=(int) (d%10000%1000/100);
			int ds=(int) (d%10000%1000%100/10);
			int dg=(int) (d%10000%1000%100%10);
			String s =dw+""+dq+"."+db+""+ds;*/
			
			String s=""+a*0.1292/2;
			
			System.err.println("����:"+s);
			//String s=B[5]+"."+B[6];		//��BYTEתΪ�ַ���,����λΪ����λ������λΪС��λ
			String device="smog";
			switch(b[4]){
			case 1:
				DBall.update(device,1, s);
				System.out.println("�����豸1��ֵ����Ϊ"+s);
				break;
			case 2:
				DBall.update(device,2, s);
				System.out.println("�����豸2��ֵ����Ϊ"+s);
				break;
			case 3:
				DBall.update(device,3, s);
				System.out.println("�����豸3��ֵ����Ϊ"+s);
				break;
			case 4:
				DBall.update(device,4, s);
				System.out.println("�����豸4��ֵ����Ϊ"+s);
				break;
			case 5:				
				DBall.update(device,5, s);
				System.out.println("�����豸5��ֵ����Ϊ"+s);
				break;
			case 6:				
				DBall.update(device,6, s);
				System.out.println("�����豸6��ֵ����Ϊ"+s);
				break;
				
			}
		}
		else if(b[3]==0x28){
			System.out.println("�н�ˮ����");
			String s=""+b[5];		//��BYTEתΪ�ַ���,����λΪ����λ
			String device="founder";
			switch(b[4]){
			case 1:
				DBall.update(device,1, s);
				System.out.println("��ˮ�豸1��ֵ����Ϊ"+s);
				break;
			case 2:
				DBall.update(device,2, s);
				System.out.println("��ˮ�豸2��ֵ����Ϊ"+s);
				break;				
			}
		}
		else if(b[3]==0x29){
			System.out.println("����ʪ������");		//��δ�������¶ȵĴ���
			//String tmp=""+(b[3]*16*16+b[4])*0.01;
			//System.out.println("b3λ��"+b[3]+"b4λ��"+b[4]+"b5λ��"+b[5]+"b6λ��"+b[6]);
			//String hum=""+(b[5]*16*16+b[6])*0.01;
			int[] B= new int[15];
			for (int i = 0; i < B.length; i++) {
				B[i]=b[i];
				if(B[i]<0){				//�Ը������д���
					B[i]=B[i]+256;		//BYTE�ķ�Χ��-127��128����Ӧ��λ��ʮ����������ʮλ��8��8�Ժ�Ķ��Ǹ���
				}
			}
			/************�����������ԭ������2015.5.24 22:32*******************/
			int tmpp=((B[5]*16*16)+B[6]);
			int humm=((B[7]*16*16)+B[8]);
			int tq=tmpp/1000;
			int tb=tmpp%1000/100;
			int ts=tmpp%1000%100/10;
			int tg=tmpp%1000%100%10;
			int hq=humm/1000;
			int hb=humm%1000/100;
			int hs=humm%1000%100/10;
			int hg=humm%1000%100%10;
			String tmp=""+tq+""+tb+"."+ts+""+tg;
			String hum=""+hq+""+hb+"."+hs+""+hg;
			//String tmp=""+tmpp;
			//String hum=""+humm;
			String device_t="temperature";
			String device_h="humidity";
			switch(b[4]){
			case 1:
				DBall.update(device_t,1, tmp);
				DBall.update(device_h,1, hum);
				System.out.println("�¶��豸1��ֵ����Ϊ"+tmp);
				System.out.println("ʪ���豸1��ֵ����Ϊ"+hum);
				break;
			case 2:
				DBall.update(device_t,2, tmp);
				DBall.update(device_h,2, hum);
				System.out.println("�¶��豸2��ֵ����Ϊ"+tmp);
				System.out.println("ʪ���豸2��ֵ����Ϊ"+hum);
				break;
			case 3:
				DBall.update(device_t,3, tmp);
				DBall.update(device_h,3, hum);
				System.out.println("�¶��豸3��ֵ����Ϊ"+tmp);
				System.out.println("ʪ���豸3��ֵ����Ϊ"+hum);
				break;
			}
		}
	}

}
