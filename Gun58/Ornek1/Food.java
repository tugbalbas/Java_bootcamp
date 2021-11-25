package Gun58.Ornek1;

public abstract class Food {

    public String name;
//
//    public Food() {
//    }
//
//    public Food(String name) {
//        this.name = name;
//    }

    public abstract void madeIn();
    public abstract void taste();

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
