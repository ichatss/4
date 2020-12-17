/**
 * Сущьность - подразделение.
 */

public class Division {

    private int id;
    private String name;

    public Division(String name) {
        id = name.hashCode();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
