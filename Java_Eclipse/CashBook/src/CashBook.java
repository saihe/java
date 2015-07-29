import java.util.ArrayList;
import java.util.Collections;

public class CashBook {
	private ArrayList<Goal> goal;

	public CashBook(){
		goal = new ArrayList<Goal>();
	}

	public void addGoal(int y , int m , String g){
		goal.add(new Goal(y , m , g));
	}

	public String getAllGoal(){
		String r = "";
		for(int i = 0 ; i < goal.size() ; i++){
			r += goal.get(i).getGoal();
		}
		return r;
	}

	public void sortGoal(){
		Collections.sort(goal , new GoalComparator());
	}
}
