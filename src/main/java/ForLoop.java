
public class ForLoop {
    
	public static void main(String[] args) {
		String[] movies = new String[6];

		Scanner scanner= new Scanner(System.in);
				for (int i = 0; i < 6 ; i++) {
					 movies[i]= scanner.nextLine();
	}
				System.out.println();
				for (int i = 0; i < movies.length; i++) {
					System.out.println(movies[i]);
				}

}
	
}

