
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double itemPrice = 85.57;
		double amountInWallet = 137.76;
		double amountAfterPurchase = (amountInWallet - itemPrice);
		
		int numberOfFriends = 17;
		int age = 43;
		double averageFriendsPerYear = ((double) numberOfFriends / age);
		
		String firstName = "Alex";
		String lastName = "Nelson";
		char middleInitial = 'W';
		String fullName = (firstName + " " + middleInitial + " " + lastName);
				
		System.out.println("I " + fullName + " had $" + amountInWallet + " until I spent $" + itemPrice + " at the bar.");
		System.out.println("Realizing I only had $" + amountAfterPurchase + " I figured I'd hit up a friend for some cash.");
		System.out.println("As I looked through my phone I realized, Im " + age + " years old,");
		System.out.println("and I've only made " + numberOfFriends + " friends. The first ten on the list I met back in");
		System.out.println("the marine corp, all called me " + lastName + ", and lived far away.");
		System.out.println("The next six at least called me by my first name " + firstName + ", but I knew they were broke.");
		System.out.println("Joe! Joe could help. Oddly he always called me " + middleInitial + ". Strange guy, Joe.");
		System.out.println("Really makes you think though, " + age + " years, and I've only made " + numberOfFriends + " friends.");
		System.out.println("That means I only make " + averageFriendsPerYear + " friends a year. Crazy!");
	}

}
