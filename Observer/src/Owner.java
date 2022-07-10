import java.util.ArrayList;

public class Owner{
    // Observable 발행자
    private ArrayList<Observer> animals;

    public Owner(){
        animals = new ArrayList<>();
    }

    public void register(Observer pet){
        animals.add(pet);
    }

    public void unregister(Observer pet){
        animals.remove(pet);
    }

    public void check(){
        for(int i=0; i<this.animals.size();i++){
            animals.get(i).update();
        }
    }
}