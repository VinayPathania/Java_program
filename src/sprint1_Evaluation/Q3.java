package sprint1_Evaluation;
class lion{
    String name;
    boolean isHungry;
    int age;
    static int totalDeaths;

    public void thinking(){
        if(!isHungry){
            System.out.println(name+" is sleeping");
        }
        else if(isHungry && age > 12){
            totalDeaths+=2;
            System.out.println(name+" has eaten two animal");
        }
        else if(isHungry && age >= 2){
            totalDeaths+=1;
            System.out.println(name+" has eaten one animal");
        }
        else if(isHungry){
            System.out.println(name+" is calling mom");
        }
    }
    public void printKilling(){
        System.out.println("Total killings by lions in jungle = "+totalDeaths);
    }

}
public class Q3 {


    public static void main(String[] args) {
        lion lion1 = new lion();
        lion1.name = "lion1";
        lion1.age = 13;
        lion1.isHungry = true;
        lion1.thinking();
        lion1.printKilling();
    }
}
