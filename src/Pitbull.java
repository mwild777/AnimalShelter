public class Pitbull extends Dog {
    public Pitbull (String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    @Override
    public String getBreed() {
        return getClass().getName();
    }
}
