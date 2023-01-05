package day90_lambda;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Item {

    private String itemName;
    private int price;

    public String toString() {
        return "Item [itemName=" + itemName + ", price=" + price + "]";

    }
}
