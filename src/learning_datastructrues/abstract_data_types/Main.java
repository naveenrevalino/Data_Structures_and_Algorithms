package learning_datastructrues.abstract_data_types;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter myCounter = new Counter("myCounter");
		myCounter.increment();
		myCounter.increment();
		System.out.println(myCounter.getCurrentValue());
		System.out.println(myCounter.toString());
		

	}

}
