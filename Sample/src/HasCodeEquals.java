import java.util.List;
import java.util.ArrayList;


public class HasCodeEquals {

	public static void main(String[] args) {
		
		
		List<CustomClass> list= new ArrayList<CustomClass>();
		
		
		list.add(new CustomClass("sarath",101,65000.00));
		list.add(new CustomClass("sarath",101,65000.00));
		list.add(new CustomClass("sarath",101,65000.00));
		list.add(new CustomClass("sarath",101,65000.00));
		list.add(new CustomClass("sarath",101,65000.00));
		System.out.println(list.size()+"  "+list.toString());
		

	}

}
