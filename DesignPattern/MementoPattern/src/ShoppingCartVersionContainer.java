import java.util.ArrayList;
import java.util.List;

public class ShoppingCartVersionContainer {

    List<ShoppingCartMemento> shoppingCartVersions = new ArrayList<>();

    public void addToContainer(ShoppingCartMemento shoppingCartMemento){
        this.shoppingCartVersions.add(shoppingCartMemento);
    }

    public ShoppingCartMemento getVersion(int version) {
        for (ShoppingCartMemento shoppingCartMemento : shoppingCartVersions) {
            if (shoppingCartMemento.version == version){
                return shoppingCartMemento;
            }
        }
        return null;
    }
}
