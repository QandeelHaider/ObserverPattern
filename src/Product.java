import java.util.ArrayList;

public class Product implements Subject {
	
private ArrayList<Observer> observes;
private int iphone;
private String Name;
private boolean Available;



public Product(){
	observes= new ArrayList<Observer>();
}

@Override
public void register(Observer register) {
	observes.add(register);
	
}

@Override
public void unregister(Observer unregister) {
	int index=observes.indexOf(unregister);
	System.out.println("Observer : " + (index+1) + "Deleted" );
	observes.remove(unregister);
}

@Override
public void notifyObserver() {
	 for(Observer observer: observes){
		 observer.update(Name);
	 }
	
}

public void setAvailable(boolean available){
	this.Available=available;
	if(available==true){
		notifyObserver();
	}
}


	
}
