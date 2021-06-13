package Module_6;
import java.text.*;
import java.util.*;
public class date_and_time {
	public static void main(String args[]) {
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date date=new Date();
		System.out.print(formatter.format(date));
	}
}
