package assignments.day_10_assignment5;

public class Question8 {

	public static void main(String[] args) {
		
//		for example:
//			player = 21
//			house = 8
//			output: bust
//
//			player = 7
//			house = 10
//			output: player loss
//
//			player = 4
//			house = 4
//			output: its a tie
//
//			player = 12
//			house = 7
//			output: player wins
		int player=12;
		int house=16;
		
		if(player>house) {System.out.println("player wins");}
		else if(player<house) {System.out.println("player loss");
		if(player==house) {System.out.println("its a tie");}
		else if((player+house)>21) {System.out.println("bust");}
			
		}
		
		
	}

}
