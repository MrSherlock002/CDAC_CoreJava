package com.acts.tasks;

public class OddEvenTask implements Runnable{

	private int max;
	private SharedPrinter printer;
	private boolean isEvenNumber;

	public OddEvenTask(SharedPrinter print, int max, boolean isEvenNumber){
		this.printer = print;
		this.max = max;
		this.isEvenNumber = isEvenNumber;
	}

	@Override
	public void run() {

		System.out.println("Run method");
		int number = isEvenNumber == true ? 2 : 1;
		while(number <= max){

			if(isEvenNumber){
				printer.printEven(number);
			}   
			else {
				printer.printOdd(number);
			}
			number+=2;
		}
	}
}
