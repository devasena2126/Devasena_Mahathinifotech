package traning28_4;

import java.util.ArrayList;

public class Lift implements LiftService {
	private int last_position=0;
	private int current_position;
	String lift_name;
	
	ArrayList<Integer> hist= new ArrayList<>();
	
	public int getLast_position() {
		return last_position;
	}
	public void setLast_position(int last_position) {
		this.last_position = last_position;
	}
	public int getCurrent_position() {
		return current_position;
	}
	public void setCurrent_position(int current_position) {
		this.current_position = current_position;
	}
	
    @Override
    public void move(Lift lift, int position) {
    	if(lift.getLast_position() == position) {
    		System.out.println("Lift is in the same floor");
    	}else {
    		lift.setCurrent_position(position);
            System.out.println("Lift moved from " +lift.getLast_position() +" to floor " + position);
            lift.hist.add(position);
            lift.setLast_position(position);
    	}
    }
    @Override
    public void move(Lift lift) {
    	lift.setCurrent_position(lift.getLast_position());
        System.out.println("Lift moved to last position " + lift.getCurrent_position());
    }
}
