package assignments.day_13_assignment6;

public class Question10 {

	public static void main(String[] args) {
//		##
//		# #
//		#  #
//		#   #
//		#    #
//		#     #
//		#      #

		for (int i = 1; i < 8; i++) {
			System.out.print("#");
			for (int j = 2; j<=i; j++) {
				System.out.print(" ");
			}
			System.out.print("#");
			System.out.println();
		}
	}
}
