package hust.soict.pfiev.aims.media;

import java.util.Objects;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbMedias = 0;

    public Media(String title, String category, float cost) {
        id = ++nbMedias;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isMatch(int id) {
        if(this.id == id) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isMatch(String title) {
        if(this.title == title) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {
        // Bước 1: Kiểm tra tham chiếu (reflexive check)
        if (this == obj) return true;

        // Bước 2: Kiểm tra đối tượng null và kiểu lớp
        if (obj == null || getClass() != obj.getClass()) return false;

        // Bước 3: Ép kiểu đối tượng
        Media media = (Media) obj;

        // Bước 4: So sánh thuộc tính title
        return Objects.equals(title, media.title);
    }
}