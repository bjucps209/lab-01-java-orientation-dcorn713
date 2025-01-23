import java.util.Scanner;

class Grader {
    public static void main(String[] args) {
        int number = 0;
        Scanner fileScanner = new Scanner(System.in);

        while (fileScanner.hasNextLine()) {      
                String inp = fileScanner.nextLine();
                int inpt = Integer.parseInt(inp);
                int num = inpt + 2;

                if (inpt < 38) {
                    number = inpt;}

                else if (inpt % 5 == 0) {
                    number = inpt;}

                else if (((inpt + 1) % 5 == 0)) {
                    number = inpt + 1;}

                else if ((inpt + 2) % 5 == 0) {
                    number = inpt + 2;}

                else if ((num + 1) % 5  == 0 || (num + 2) % 5 == 0) {
                    number = inpt;}
                System.out.println(number);                    
                } 
        }
}  