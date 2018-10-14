package io.javapractice.generalproblems;

public class MultiThreadingPrg1 implements Runnable{
	
	private String greet;
	
	public  MultiThreadingPrg1(String greet) {
		this.greet=greet;
	}
	

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("Greeting hello "+greet);
			System.out.println(Thread.currentThread().getId());
		}
		
	}
	
	public static void main(String[] args) {
		String[] greetings= {"India","US","London","Russia"};
		
		for(String countries : greetings) {
			MultiThreadingPrg1 multiThreadingPrg1=new MultiThreadingPrg1(countries);
			new Thread(multiThreadingPrg1,countries).start();
		}
	}

}
