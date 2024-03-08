public Sucursal1 extends FabricaPizza {

    Pizza crearPizza() {
        String pedido = ; //...;

        switch (pedido) {
        case "Hawaiana":
            pizza = new PizzaHawaiana();
            break;
        case "Peperoni":
            pizza = new PizzaPeperoni();
            break;
        case "BandejaPaisa":
            pizza = new PizzaBandejaPaisa();
            break;
            //

        }
    }
}
