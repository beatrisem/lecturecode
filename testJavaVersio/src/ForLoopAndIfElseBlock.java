
public class ForLoopAndIfElseBlock {

	public static void main(String[] args) {
		int[] dates = {2, 3,5, 6};
		int checkDate = 5;
		
		for(int i = 0; i < dates.length; i++) {
			if(dates[i] == checkDate) {
				System.out.println("number found");
				break;
			}else if (dates.length != checkDate){
				System.out.println("not found");
				
			}
			
		}	

	}

}
