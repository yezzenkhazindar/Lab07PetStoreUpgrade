
public class Dog extends Pets {
    public Dog(String name, String breed){
        super(name, breed);
    }
    @Override
    public String makeNoise() {
        return "bark";
    }

    public String playFetch(int num){
        num *= 7;
        if (num % 2 == 0){
            return "returned the ball";
        }
        return "won't give it back";
    }

    public static void main(String[] args){

    }
}