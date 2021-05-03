package entity;

public class Game {
    private Integer id;
    private String name;
    private Double price;

    public Game() {
    }

    public Game(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public Game setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Game setName(String name) {
        this.name = name;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Game setPrice(Double price) {
        this.price = price;
        return this;
    }
}
