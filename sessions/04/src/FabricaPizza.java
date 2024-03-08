public abstract class FabricaPizza {

    protected abstract Pizza crearPizza();

    public Pizza ordenar() {
        Pizza pizza = crearPizza();

        pizza.amasar();
        pizza.ponerIngredientes();
        pizza.honear();
        pizza.ponerCaja();

        return pizza;
    }
}
