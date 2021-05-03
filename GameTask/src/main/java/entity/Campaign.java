package entity;

public class Campaign {
    private Integer id;
    private String name;
    private int amount;

    public Campaign() {
    }

    public Campaign(Integer id, String name, int amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public Campaign setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Campaign setName(String name) {
        this.name = name;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public Campaign setAmount(int amount) {
        this.amount = amount;
        return this;
    }
}
