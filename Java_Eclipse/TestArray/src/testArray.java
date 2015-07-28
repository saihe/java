import java.util.ArrayList;
import java.util.HashMap;

public class testArray {
	public static void main(String[] args){
		ArrayList<HashMap<String , String>> list = new ArrayList<HashMap<String , String>>();
		HashMap<String , String> data = new HashMap<String , String>();
		String s = "0";
		data.put("日付", "15");
		data.put("科目" , "りんご");
		data.put("入金" , "300");
		data.put("出金" , "300");
		data.put("残金" , s);
		list.add(data);

		for(HashMap<String , String> aa : list){
			System.out.print(aa.get("日付") + "日\t\t");
			System.out.print(aa.get("科目") + "\t\t");
			System.out.print(aa.get("入金") + "円\t\t");
			System.out.print(aa.get("出金") + "円\t\t");
			System.out.println(aa.get("残金") + "円\t\t");
		}
	}
}
