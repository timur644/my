package my.HomeWork.dz4;

public class Car{
    private int id;
    private String brand;
    private int god;
    private String color;
    private int price;
    private int regNum;

    public Car(int id, String brand, int god, String color, int price, int regNum) {
        this.id = id;
        this.brand = brand;
        this.god = god;
        this.color = color;
        this.price = price;
        this.regNum = regNum;
    }
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getGod() {
        return god;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getRegNum() {
        return regNum;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setGod(int god) {
        this.god = god;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    @Override
    public String toString() {
        return "Авто{" +
                "id=" + id +
                ", Марка='" + brand +
                ", Год=" + god +
                ", Цвет='" + color +
                ", Цена=" + price +
                ", Номер=" + regNum +
                '}';
    }
}