package test.entity;

public class GoodsEntity {
    private Long id;
    private String name;
    private double price;
    private String address;
    private String image;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public GoodsEntity() {
    }

    public GoodsEntity(Long id, String name, double price, String address, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.address = address;
        this.image = image;
    }

    @Override
    public String toString() {
        return "GoodsEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
