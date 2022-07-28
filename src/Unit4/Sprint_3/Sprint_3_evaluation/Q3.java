package Sprint_3.Sprint_3_evaluation;

abstract class Evaluation{
    int numberOfQuestions;

    abstract void evaluationTiming();

    void printNoOfQuestions(int n) {
        System.out.println("No. of Questions in Evaluation is :" +n);
    }

}

class DsaEvaluation extends Evaluation{
    DsaEvaluation(int n){
        System.out.println("Its a DSA evaluation");
        printNoOfQuestions(n);
        evaluationTiming();
    }
    @Override
    void evaluationTiming(){
        System.out.println("Evaluation timing is 9:30 to 11:00");
    }
}
class CodingEvaluation  extends Evaluation{
    CodingEvaluation(int n){
        System.out.println("Its a DSA evaluation");
        printNoOfQuestions(n);
        evaluationTiming();
    }
    @Override
    void evaluationTiming(){
        System.out.println("Evaluation timing is 2:00 to 3:30");
    }
}


public class Q3 {
    public static void main(String[] args) {

        DsaEvaluation DSA = new DsaEvaluation(4);
        System.out.println("===============================================================");

        CodingEvaluation Coding = new CodingEvaluation(5);
        System.out.println("===============================================================");

    }
}
