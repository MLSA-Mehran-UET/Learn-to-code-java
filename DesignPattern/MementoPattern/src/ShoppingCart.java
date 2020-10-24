/**
 * This is the original object,
 * updated values are effected to this object.
 */
public class ShoppingCart {

    public int numOfItems = 0;
    public double totalPrice = 0.00d;
    public int version = 0;

    public ShoppingCartMemento createVersion(){
        ShoppingCartMemento shoppingCartMemento = new ShoppingCartMemento();
        shoppingCartMemento.numOfItems = this.numOfItems;
        shoppingCartMemento.totalPrice = this.totalPrice;
        shoppingCartMemento.version = this.version;
        return shoppingCartMemento;
    }

    public void restore(ShoppingCartMemento shoppingCartMemento){
        this.version = shoppingCartMemento.version;
        this.numOfItems = shoppingCartMemento.numOfItems;
        this.totalPrice = shoppingCartMemento.totalPrice;
    }

}
