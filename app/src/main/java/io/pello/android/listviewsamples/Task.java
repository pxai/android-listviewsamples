package io.pello.android.listviewsamples;

/**
 * Created by PELLO_ALTADILL on 05/10/2016.
 */
public class Task {
    private Integer id;
    private String name;
    private String description;
    private Integer type;

    public Task () {}

    public Task(Integer id, String name, String description, Integer type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                '}';
    }
}
