import java.util.Random;

public class TestShaker{
    public static void main(String[] args){
    Shaker theShaker = new Shaker();
    for(int i = 1; i <= 10; i++){
        theShaker.shake();
        System.out.println(theShaker);
        if(theShaker.isEven() == true)
        System.out.println("Doubles!");
}
    }
}