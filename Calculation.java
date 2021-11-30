package threading;

import java.util.concurrent.TimeUnit;


	class Addition extends Thread {
		int a = 500;
		int b = 200;

		public void run() {
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Addition of a and b :  " + (a + b));
		}
	}

	class Substraction extends Thread {
		int a = 500;
		int b = 200;
		public void run() {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Substraction of a and b : " + (a - b));
		}
		
	}

	class Multiplication extends Thread {
		int a = 500;
		int b = 200;
		public void run() {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Multiplication of a and b : " + (a * b));
		}
	}

	class Division extends Thread {
		int a = 500;
		int b = 200;
		public void run() {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Division of a and b : " + (a / b));
		}
	}
	public class Calculation {

		public static void main (String[] args) {

			Addition objAdd = new Addition();
			objAdd.start();

			Substraction objSubstract =  new Substraction();
			objSubstract.start();
			
			Multiplication objMultiply =  new Multiplication();
			objMultiply.start();
			
			try {
				objSubstract.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Division objDivide =  new Division();
			objDivide.start();

		}
}
