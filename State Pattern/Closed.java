
public class Closed extends State {

	@Override
	public void handleOpen(Store store) {
		if(store.timeToOpen()) {
			store.deactivateAlarm();
			store.setState(new Open());
		} else {
			store.startAlarm();
			store.setState(new Alarm());
		}	
	}
	
	public String toString(){
	      return "Closed State";
	   }
	
}
