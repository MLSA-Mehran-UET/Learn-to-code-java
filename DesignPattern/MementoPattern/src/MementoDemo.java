/**
 * Memento can be used for
 * 1. maintain history of shopping cart transactions
 * 2. provide recovery mechanism , if transaction fail
 * 3. rollback to any previous state.
 */
public class MementoDemo {

    public static void main(String[] args) {
        ShoppingCartVersionContainer versionContainer = new ShoppingCartVersionContainer();

        //adding first product to shopping cart. set state as version 1
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.version = 1;
        shoppingCart.numOfItems = 1;
        shoppingCart.totalPrice = 100;
        ShoppingCartMemento shoppingCartV1 = shoppingCart.createVersion();
        versionContainer.addToContainer(shoppingCartV1);

        //adding second product to shopping cart. set state as version 2
        shoppingCart.version = 2;
        shoppingCart.numOfItems = 10;
        shoppingCart.totalPrice = 500;
        ShoppingCartMemento shoppingCartV2 = shoppingCart.createVersion();
        versionContainer.addToContainer(shoppingCartV2);

        //adding third product to shopping cart. set state as version 3
        shoppingCart.version = 3;
        shoppingCart.numOfItems = 30;
        shoppingCart.totalPrice = 3500;
        ShoppingCartMemento shoppingCartV3 = shoppingCart.createVersion();
        versionContainer.addToContainer(shoppingCartV3);

        //restore shopping cart to 2nd version
        ShoppingCartMemento previousShoppingCartMemento = versionContainer.getVersion(2);
        shoppingCart.restore(previousShoppingCartMemento);
        System.out.println(shoppingCart.version);
        System.out.println(shoppingCart.numOfItems);
        System.out.println(shoppingCart.totalPrice);

        //rollback 2nd version to latest (3rd) version
        ShoppingCartMemento latestShoppingCartMemento = versionContainer.getVersion(3);
        shoppingCart.restore(latestShoppingCartMemento);
        System.out.println(shoppingCart.version);
        System.out.println(shoppingCart.numOfItems);
        System.out.println(shoppingCart.totalPrice);

    }
}
