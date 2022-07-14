public class Facade {
    private final Wash wash;
    private final Bubble bubble;
    private final Air air;

    public Facade(){
        this.wash = new Wash();
        this.bubble = new Bubble();
        this.air = new Air();
    }

    public void washing(){
        this.wash.startWash();
        this.bubble.startBubble();
        this.air.startAir();
    }
}
