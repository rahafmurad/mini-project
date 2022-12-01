package miniproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shahad mohammed
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item implements java.io.Serializable {

    @Id
    @Column(name = "itemName")
    private String item_Name;

    @Column(name = "itemQuantity")
    private int item_Quantity;
    
    
    @Column(name = "quantityUnit")
    private String quantity_Unit;


    @Column(name = "itemCategory")
    private String category;

    @Column(name = "expiryDate")
    private String expiryDate;

    

    public Item() {
        
    }

    public Item(String item_Name, int item_Quantity, String quantity_Unit, String category, String expiryDate) {
        this.item_Name = item_Name;
        this.item_Quantity = item_Quantity;
        this.quantity_Unit = quantity_Unit;
        this.category = category;
        this.expiryDate = expiryDate;
    }

    public String getItem_Name() {
        return item_Name;
    }

    public void setItem_Name(String item_Name) {
        this.item_Name = item_Name;
    }

    public int getItem_Quantity() {
        return item_Quantity;
    }

    public void setItem_Quantity(int item_Quantity) {
        this.item_Quantity = item_Quantity;
    }

    public String getQuantity_Unit() {
        return quantity_Unit;
    }

    public void setQuantity_Unit(String quantity_Unit) {
        this.quantity_Unit = quantity_Unit;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    


}
