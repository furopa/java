import java.util.Date;
import java.text.SimpleDateFormat;
class DateandTime
{
	public static void main(String arg[])
	{
		Date d=new Date();
		SimpleDateFormat sdf;

		sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Current date is:="+sdf.format(d));

		sdf=new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Current date is:="+sdf.format(d));
                
		sdf=new SimpleDateFormat("EEEE MMMM dd yyyy");
		System.out.println("Current date is:-="+sdf.format(d));
		System.out.println("Current date and time is:="+d);

		sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss aaa Z");
		System.out.println("Current date and time is:="+sdf.format(d));
		
		sdf=new SimpleDateFormat("hh:MM:SS");
		System.out.println("\n Current time is:="+sdf.format(d));

		sdf=new SimpleDateFormat("w");
		System.out.println("Current week of the year:="+sdf.format(d));

		sdf=new SimpleDateFormat("W");
		System.out.println("Current week of the month:="+sdf.format(d));

		sdf=new SimpleDateFormat("D");
		System.out.println("Current day of the year:="+sdf.format(d));
	}
}


