package io.javapractice.generalproblems;




	public class ThreadClassAccountSync implements Runnable{
		
		long amount;
		
		AccountSync accountSync;
		
		public ThreadClassAccountSync(long amount,AccountSync acc) {
			// TODO Auto-generated constructor stub
			this.amount=amount;
			this.accountSync=acc;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			synchronized (accountSync) {
				
			
			try{
				
				System.out.println(amount);
				accountSync.depositAmount(amount);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			}
			
			
			
			
		}
		
	
	
	public static void main(String[] args){
		AccountSync accountSync=new AccountSync();
		ThreadClassAccountSync threadClass=new ThreadClassAccountSync(4000,accountSync);
		ThreadClassAccountSync threadClassAccountSync=new ThreadClassAccountSync(200,accountSync);
		
		Thread thread=new Thread(threadClass);
		Thread thread2=new Thread(threadClassAccountSync);
		
		thread.start();
		thread2.start();
		
	}
}
