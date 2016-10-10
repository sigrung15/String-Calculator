public class StringCalculator {
	public static int Add(String n){
		if(n.isEmpty())
			return 0;
		String[] numbers = n.split(",");
		if(numbers.length == 1)
			return Integer.valueOf(numbers[0]);
		return 0;
	}
	
	public static void main(String[] args){
		String empty = "";
		System.out.println("This should print out 0: " + Add(empty));
		String oneNr = "1";
		System.out.println("This should print out one number: " + Add(oneNr));
		oneNr = "72";
		System.out.println("This should print out one number: " + Add(oneNr));
	}
}
