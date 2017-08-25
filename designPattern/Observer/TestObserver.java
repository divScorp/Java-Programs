package designPattern.Observer;

public class TestObserver {

	public static void main(String[] args) {
		StudentData data = new StudentData();
		Observer std = new Student(data);
		String msg = "Hello World";
		data.setMessage(msg);
		
		if(!data.getMessage().equals("")) {
			data.notifyObservers();
		}
		
		data.removeObserver(std);
		if(!data.getMessage().equals("")) {
			data.notifyObservers();
		}

	}

}
