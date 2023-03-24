package basicprograms;

public class AdditionOfTwoNumber {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        AdditionOfTwoNumber additionOfTwoNumber = new AdditionOfTwoNumber();
        int num1 = 10;
        int num2 = 20;
        System.out.println("Addition of " + num1 + " and " + num2 + " = " + additionOfTwoNumber.add(num1   , num2));
    }

}
