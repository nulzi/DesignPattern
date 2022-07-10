public class FishAdapter implements Animal{
    Fish fish;

    public FishAdapter(Fish fish){
        this.fish = fish;
    }
    @Override
    public void walk(){
        this.fish.swim();
    }
}