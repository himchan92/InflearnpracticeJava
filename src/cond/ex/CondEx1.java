package cond.ex;

public class CondEx1 {

    public static void main(String[] args) {
        int score = 59;

        if(score >= 90) {
            System.out.println("A");
        }
        else if(score >= 80 && score < 90) {
            System.out.println("B");
        }
        else if(score >= 70 && score < 80) {
            System.out.println("C");
        }
        else if(score >= 60 && score < 70) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
