package entity;

import myanotation.Column;
import myanotation.Entity;
import myanotation.Id;
import myanotation.Validate;

@Entity(tableName = "foods")
public class Food {
    @Id(autoIncreament = true)
    @Column(columnName = "id", columnType = "int")
    @Validate(required = true, requiredMessage = "Id is required")
    private int id;

    @Column(columnName = "name", columnType = "varchar(255)")
    @Validate(required = true, requiredMessage = "Name is required")
    private String name;

    @Column(columnName = "category", columnType = "int")
    @Validate(required = true, requiredMessage = "Category is required")
    private int category;

    @Column(columnName = "description", columnType = "text")
    @Validate(required = true, requiredMessage = "Description is required")
    private String description;

    @Column(columnName = "thumbnail", columnType = "text")
    private String thumbnail;

    @Column(columnName = "price", columnType = "double")
    @Validate(required = true, requiredMessage = "Price is required")
    private double price;

    @Column(columnName = "createdAt", columnType = "datetime")
    private String createdAt;

    @Column(columnName = "updatedAt", columnType = "datetime")
    private String updatedAt;

    @Column(columnName = "status", columnType = "int")
    private int status;

    public Food(String name, int category, String description, String thumbnail, double price, String createdAt, String updatedAt, int status) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.thumbnail = thumbnail;
        this.price = price;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
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

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", description=" + description +
                ", thumbnail=" + thumbnail +
                ", price=" + price +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", status=" + status +
                '}';
    }
}
