package io.javapractice.generalproblems;

public class AssignmentProb1 {
	int numb;
	public static void main(String[] args){
		int a=6,b=7,c=9;
		c=b=a=3;
		
		System.out.println(c);
		int[] arr={1,2,3,4,5};
		new AssignmentProb1().print(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
			AssignmentProb1 assignmentProb1=new AssignmentProb1();
			assignmentProb1.numb=10;
			String[] xy=new String[0];
//			xy[0]="pardeep";
//			
//			assignmentProb1.changeNumb(assignmentProb1);
//			assignmentProb1.changeString(xy);
//			System.out.println();
//			System.out.println(assignmentProb1.numb);
//			System.out.println(xy[0]);
			
			String ab="pardeep";
			String ac="pardeep";
			System.out.println(ab.equals(ac));
			System.out.println(ab==ac);
			
			String a1=new String("ab");
			String a2=new String("ab");
			System.out.println(a1.equals(a2));
			System.out.println(a1==a2);
			
			for(int i=0;i<6;++i){
				System.out.println("str"+i);
			}
			
			int count=0;
			
			try{
				count++;
				try{
					count++;
					try{
						count++;
						throw new Exception();
					}
					catch(Exception e){
						count++;
						throw new Exception();
					}
				}
				catch(Exception e){
					count++;
					
				}
			}
			catch(Exception e){
				count++;
			}
			
			System.out.println(count);
		
	}
	
	
	
	private void changeString(String[] xy) {
		// TODO Auto-generated method stub
		xy[0]="hello";
		
	}

	void changeNumb(AssignmentProb1 assignmentProb1) {
		// TODO Auto-generated method stub
		AssignmentProb1 assignmentProb12=(AssignmentProb1)assignmentProb1;
		assignmentProb12.numb=15;
		
	}

	void print(int[] ar){
		ar[0]=9;
	}
}
