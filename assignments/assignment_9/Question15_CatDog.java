package assignments.assignment_9;

public class Question15_CatDog {

	public static void main(String[] args) {

		String str = "cat-cheetah-dog-cat";
		System.out.println(catDog(str));
	}
	public static boolean catDog(String str) {
	    int cdog = 0;
	    int ccat = 0;

	    for (int i = 0; i < str.length()-2; i++)
	    {
	        if (str.charAt(i)== 'c' && str.charAt(i+1)== 'a' && str.charAt(i+2)== 't')
	        {
	            ccat++;
	        }
	        else if(str.charAt(i) == 'd' && str.charAt(i+1)== 'o' && str.charAt(i+2)== 'g')
	        {
	            cdog++;
	        }
	    }
	    if (cdog == ccat)
	        return true;

	    else
	        return false;
	}
}
