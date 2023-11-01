public class Cat extends AdoptableAnimal{
    public Cat(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    @Override
    public double getPrice() {
        return super.getPrice();
    }
    @Override
    public String getDescription() {
        return super.getDescription();
    }
    @Override
    public String getName() {
        return super.getName();
    }
}
