

public class Kadai01 {
    public static void main(String... args) {
        
    	String grade, result;

    	int score = Integer.parseInt(args[0]);

       
        if (score >= 90 && score <= 100) {
            grade = "A";
            result = "���i";
        } else if (score >= 80 && score < 90) {
            grade = "B";
            result = "���i";
        } else if (score >= 70 && score < 80) {
            grade = "C";
            result = "���i";
        } else if (score >= 60 && score < 70) {
            grade = "D";
            result = "���i";
        } else if (score >= 0 && score < 60) {
            grade = "E";
            result = "�s���i";
        } else {
            grade = "Invalid";
            result = "Invalid score";
        }

    	System.out.println(grade + " " + result);
        

       
       
    }
}
