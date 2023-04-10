public class Hamster extends Pets {
    public Hamster(String name, String breed){
        super(name,breed);
    }

    @Override
    public String makeNoise() {
        return "Squeak";
    }

    public boolean wheelRun(String[] run){
        for (String i : run) {
            if (i.equals("tired")){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

    }
}