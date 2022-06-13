public class MilkDecorator extends Decorator{
    public MilkDecorator(Component coffeeComponent) {
        super(coffeeComponent);
    }

    @Override
    public String coffeeAdd() {
        return super.coffeeAdd() + " + 우유";
    }
}
