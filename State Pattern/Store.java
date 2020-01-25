import java.time.LocalTime;

public class Store {
	
	private State state;

	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	public void open() {
		state.handleOpen(this);
	}
	
	public boolean timeToOpen() {
		return LocalTime.now().isAfter( LocalTime.parse( "07:00" ));
	}
	
	public void startAlarm() {
		//some logic here
	}
	
	public void deactivateAlarm() {
		//some logic here
	}
	
}
