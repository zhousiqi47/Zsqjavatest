package zhousiqi;

public class CozaLozaWoza {
	 public static void main(String[] args) {
		 int lower=1;
		 int upper=110;
		 int count=1;
		 int num =1;
		 for(num=lower;num<=upper;num++,count++)
		 {
			 int thr=num%3;
			 int fiv=num%5;
			 int sev=num%7;
			 if(thr==0&&fiv!=0&&sev!=0)
			 {
				 System.out.print("Coze ");
			 }
			 else if(thr!=0&&fiv==0&&sev!=0)
			 {
				 System.out.print("Loze ");
			 }
			 else if(thr!=0&&fiv!=0&&sev==0)
			 {
				 System.out.print("Woze ");
			 }
			 else if(thr!=0&&fiv==0&&sev==0)
			 {
				 System.out.print("LozeWoze ");
			 }
			 else if(thr==0&&fiv!=0&&sev==0)
			 {
				 System.out.print("CozeWoze ");
			 }
			 else if(thr==0&&fiv==0&&sev!=0)
			 {
				 System.out.print("CozeLoze ");
			 }
			 else if(thr==0&&fiv==0&&sev==0)
			 {
				 System.out.print("CozeLozeWoze ");
			 }
			 else
			 {
				 System.out.print(num);
			 }
			 
			 if(count==11)
			 {
				 System.out.println();
				 count=0;
			 }
			 
		 }
	 }

}
