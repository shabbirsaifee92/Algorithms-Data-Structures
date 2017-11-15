

public class UsingThreadClass extends Thread {
		
	@Override
	public void run() {
		
		for(int i =0;i<10;i++){
			System.out.println("Hello "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public static void main(String[] args) {
		
		UsingThreadClass thread1 = new UsingThreadClass();
		thread1.start();
		
		UsingThreadClass thread2 = new UsingThreadClass();
		thread2.start();
	}
	
}
