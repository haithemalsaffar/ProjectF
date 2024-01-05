package f;

public class DemoF {
	
	    public static void main(String[] args) {
	        DemoF tester = new DemoF();
	        System.out.println(tester.repeatFront("abcdef", 3));  // Output: "abcabca"
	        System.out.println(tester.repeatFront("Java", 2));    // Output: "JaJ"
	        System.out.println(tester.repeatFront("hello", 0));   // Output: ""
	    }

	    public String repeatFront(String str, int n) {
	        String result = "";

	        if (n == 0) {
	            result = "";
	        } else {
	            for (int i = n; i >= 0; i--) {
	                result += str.substring(0, i);
	            }
	        }

	        return result;
	    }
}


