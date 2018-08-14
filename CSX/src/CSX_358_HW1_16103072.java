import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class CSX_358_HW1_16103072
{
	
	public static void main(String arg[]) throws Exception
	{
		File file=new File("C:\\Users\\SAHIL SHARMA\\Desktop\\HW1\\HW1-data");
		Scanner sc=new Scanner(file);
		FileWriter fw=new FileWriter("C:\\Users\\\\SAHIL SHARMA\\\\Desktop\\HW1\\HW1-Output_16103072.txt");
		fw.write("Stdnt Id Ex ------- Assignments --------- Tot Mi Fin CL Pts Pct Gr");
		fw.write("\r\n");
		fw.write("-------- -- ----------------------------- --- -- --- -- --- --- --");
		fw.write("\r\n");
		Student std=new Student();
		Arrays.fill(std.ar, 0);
	while(sc.hasNextLine())
	{
		
		String s=sc.nextLine();
	String k = s.replaceAll("( )+", " ");
		 String m[]=k.split(" ");
		 fw.write(m[0]);
		 fw.write(' ');
		 fw.write(m[1]);
		
		std.initialize();
		fw.write(' ');
		int i=2;
		int c=m.length;
		std.calc_total(m,c);
		while(i<=11)
		{
			m[i]=String.format("%2s",m[i]);
			fw.write(m[i]);
			fw.write(' ');
			i++;
		}
	String a=Integer.toString(std.tot);
    a=String.format("%3s", a);
    fw.write(a);
		while(i<(m.length))
		{
			fw.write(' ');
			if(i==13) {
			a=String.format("%3s",m[i]);
			fw.write(a);}
			else
			{
				a=String.format("%2s",m[i]);
				fw.write(a);	
			}
			i++;
		}
		fw.write(' ');
		a=Integer.toString(std.pts);
		a=String.format("%3s",std.pts);
		fw.write(a);
		char b=std.cal_grade();
		  fw.write(' ');
	  
	    a=Integer.toString(std.pct);
	    a=String.format("%3s",a);
        fw.write(a);
	    fw.write(' ');
	    fw.write(b);
	    fw.write("\r\n");
	}
	   std.avg=((std.avg)/50);
	    fw.write("Average total point percent of all students:"+std.avg+"\r\n" );
	    fw.write("Number of A's="+std.ar[0]+"\r\n");
	    fw.write("Number of B's="+std.ar[1]+"\r\n");
	    fw.write("Number of C's="+std.ar[2]+"\r\n");
	    fw.write("Number of D's="+std.ar[3]+"\r\n");
	    fw.write("Number of F's="+std.ar[4]+"\r\n");
	    fw.write("\r\n"+"Maximum points="+std.max);
	    sc.close();
		fw.close();
	
	}
}