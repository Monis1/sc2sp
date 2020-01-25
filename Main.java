
public class Main {

	public static void main(String[] args) {
		 Store store = new Store();

	      Closed closed = new Closed();
	      closed.handleOpen(store);

	      System.out.println(store.getState().toString());
	}

}