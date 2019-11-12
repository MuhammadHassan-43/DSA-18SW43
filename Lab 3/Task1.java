public class Task1{

	static int returnCharIndex(char[] array, char item ){

		for(int x=0; x<array.length; x++){
			
			if(array[x] == item){
				return x; // returns index of item
			}
		}

		return -1; // if item not found returns -1
	}
	
	static int returnStringIndex(String[] array, String item ){

		for(int x=0; x<array.length; x++){
			
			if(array[x] == item){
				return x; // returns index of item
			}
		}

		return -1; // if item not found returns -1
	}	



	public static void main(String[] args) {
		
		char[] characArray = {'a','b','c','d','e','f','g','h','i'};
		System.out.print(Task1.returnCharIndex(characArray, 'i'));

		String[] subjects = {"Mathematics", "English", "Biology", "Chemistry", "Sociology", "Geography", "History", "Literature"};
		System.out.print(Task1.returnStringIndex(subjects, "Literature"));		
	}

}