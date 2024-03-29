package org.upblogz.models;



import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.Id;
        import javax.validation.constraints.NotNull;
        import javax.validation.constraints.Size;

@Entity
public class Post {

    @Id



    @NotNull
    @Size(min = 3, max = 500)
    private String description;



    public Post() { }

    public Post(String description) {

        this.description = description;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}