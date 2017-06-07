package dataToXML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import DB.DBUtil;

public class DBtoXML {
	public static void main(String[] args) {
		int i=0;
		System.out.println("���ڽ���DB-TO-XML");
		DBtoXML dtx=new DBtoXML();
		while(true){
			//System.out.println("1");
			DBUtil util=new DBUtil();
			/* ��ȡ��������*/
			String infrared1=util.query("infrared", "infrared1");
			String infrared2=util.query("infrared", "infrared2");
			String infrared3=util.query("infrared", "infrared3");
			String infrared4=util.query("infrared", "infrared4");
			String infrared5=util.query("infrared", "infrared5");
			/* ��ȡ�����Ŵ�����*/
			String magnetic1=util.query("magnetic", "magnetic1");
			String magnetic2=util.query("magnetic", "magnetic2");
			String magnetic3=util.query("magnetic", "magnetic3");
			String magnetic4=util.query("magnetic", "magnetic4");
			String magnetic5=util.query("magnetic", "magnetic5");
			/* ��ȡ������������*/
			String windowsBreak1=util.query("windowbreak", "windowbreak1");
			String windowsBreak2=util.query("windowbreak", "windowbreak2");
			String windowsBreak3=util.query("windowbreak", "windowbreak3");
			String windowsBreak4=util.query("windowbreak", "windowbreak4");
			/* ��ȡ��ζ����*/
			String smell1=dtx.ChargeSmell(util.query("smell", "smell1"));
			//System.out.println(smell1);
			String smell2=dtx.ChargeSmell(util.query("smell", "smell2"));
			//System.out.println(smell2);
			String smell3=dtx.ChargeSmell(util.query("smell", "smell3"));
			String smell4=dtx.ChargeSmell(util.query("smell", "smell4"));
			String smell5=dtx.ChargeSmell(util.query("smell", "smell5"));
			String smell6=dtx.ChargeSmell(util.query("smell", "smell6"));
//			String smell1=util.query("smell", "smell1");
//			String smell2=util.query("smell", "smell2");
//			String smell3=util.query("smell", "smell3");
//			String smell4=util.query("smell", "smell4");
//			String smell5=util.query("smell", "smell5");
//			String smell6=util.query("smell", "smell6");
			StringBuffer sb = new StringBuffer();
			
			sb.append("<type>");
			sb.append("<infrared>"+infrared1+"</infrared>");
			sb.append("<infrared>"+infrared2+"</infrared>");
			sb.append("<infrared>"+infrared3+"</infrared>");
			sb.append("<infrared>"+infrared4+"</infrared>");
			sb.append("<infrared>"+infrared5+"</infrared>");
			
			sb.append("<magnetic>"+magnetic1+"</magnetic>");
			sb.append("<magnetic>"+magnetic2+"</magnetic>");
			sb.append("<magnetic>"+magnetic3+"</magnetic>");
			sb.append("<magnetic>"+magnetic4+"</magnetic>");
			sb.append("<magnetic>"+magnetic5+"</magnetic>");
			
			sb.append("<windowsBreak>"+windowsBreak1+"</windowsBreak>");
			sb.append("<windowsBreak>"+windowsBreak2+"</windowsBreak>");
			sb.append("<windowsBreak>"+windowsBreak3+"</windowsBreak>");
			sb.append("<windowsBreak>"+windowsBreak4+"</windowsBreak>");
			
			sb.append("<smell>"+smell1+"</smell>");
			sb.append("<smell>"+smell2+"</smell>");
			sb.append("<smell>"+smell3+"</smell>");
			sb.append("<smell>"+smell4+"</smell>");
			sb.append("<smell>"+smell5+"</smell>");
			sb.append("<smell>"+smell6+"</smell>");
			sb.append("</type>");     

			
			 File fp=new File("D://MyEclipse/Workspaces/MyEclipse 9/WIA-PA5.3/WebRoot/DataXML/data.xml");			//����Ϊxml
		     PrintWriter pfp;
		     
			try {
				 pfp = new PrintWriter(fp,"utf-8");		  //�ؼ�����䣺Ҫ�� ��ָ�������ʽ�� ���췽��
			     pfp.print(sb);
			     pfp.close();
			     sb.delete(0, sb.length());			//������
			     //System.out.println("2");
			     try {
			            Thread.sleep(500);		//�ӳ�3S
			        } catch (InterruptedException e) {
			            // TODO Auto-generated catch block
			            e.printStackTrace();
			        }
			    // System.out.println(i++);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		     //System.err.println("�Ѵ���");
		}
	}
	 public  String ChargeSmell(String smell){
		if(smell.equals("1")){
			smell="��";
			//System.out.println("�������"+smell);
		}else if(smell.equals("2")){
			smell="�Ϻ�";
		}else if(smell.equals("3")){
			smell="һ��";
		}else if(smell.equals("4")){
			smell="��";
		}
		
		return smell;
	}

}
