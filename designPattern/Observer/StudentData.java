package designPattern.Observer;

import java.util.ArrayList;

public class StudentData {
		private String message;
		private ArrayList<Observer> observers;
		
		public StudentData() {
			observers = new ArrayList<>();
		}	
		public void registerObserver(Observer o) {
			observers.add(o);
		}
		public void removeObserver(Observer o) {
			observers.remove(o);
		}
		
		public void notifyObservers() {
			for(int i = 0; i < observers.size(); i++) {
				Observer obs = (Observer) observers.get(i);
				obs.update(message);
			}
		}
		
		public void setMessage(String msg) {
			this.message = msg;
		}
		
		public String getMessage() {
			return this.message;
		}
}
