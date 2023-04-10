
public class Cat extends Pets {
    String badName;
    public Cat(String name, String breed, String badName){
        super(name, breed);
        this.badName = badName;
    }

    @Override
    public String makeNoise() {
        return "meow";
    }

    @Override
    public String getName(){
        return name + " aka " + badName;
    }

    public static void main(String[] args){

    }
}