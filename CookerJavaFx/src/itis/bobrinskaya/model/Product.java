package itis.bobrinskaya.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Product {

    private final StringProperty id;
    private final StringProperty name;
    private final IntegerProperty price;
    private final StringProperty description;
    private final StringProperty photo;



	public Product() {

        id = new SimpleStringProperty("");
        name = new SimpleStringProperty("");
        price = new SimpleIntegerProperty();
        description = new SimpleStringProperty("");
        photo = new SimpleStringProperty("");
    }

	public Product(String id, String name, String photo, String description, Integer price) {
		this.photo = new SimpleStringProperty(photo);
		this.id = new SimpleStringProperty(id);
		this.name = new SimpleStringProperty(name);
		this.price = new SimpleIntegerProperty(price);
		this.description = new SimpleStringProperty(description);
	}
	
	public String getId() {
		return id.get();
	}

	public void setId(String id) {
		this.id.set(id);
	}
	
	public StringProperty idProperty() {
		return id;
	}

	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}
	
	public StringProperty nameProperty() {
		return name;
	}

	public Integer getPrice() {
		return price.get();
	}

	public void setPrice(Integer price) {
		this.price.set(price);
	}
	
	public IntegerProperty priceProperty() {
		return price;
	}

	public String getDescription() {
		return description.get();
	}

	public void setDescription(String description) {
		this.description.set(description);
	}
	
	public StringProperty descriptionProperty() {
		return description;
	}
    public String getPhoto() {
        return photo.get();
    }

    public StringProperty photoProperty() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo.set(photo);
    }



}