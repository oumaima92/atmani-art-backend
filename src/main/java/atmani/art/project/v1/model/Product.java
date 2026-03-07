package atmani.art.project.v1.model;

import java.net.URI;
import java.util.Objects;
import atmani.art.project.v1.model.Category;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Product
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.5.0")
public class Product {

  private Long id;

  private String name;

  private String imagePath;

  private String description;

  /**
   * Gets or Sets colors
   */
  public enum ColorsEnum {
    RED("RED"),
    
    BLUE("BLUE"),
    
    GREEN("GREEN"),
    
    BLACK("BLACK"),
    
    WHITE("WHITE"),
    
    YELLOW("YELLOW"),
    
    PURPLE("PURPLE"),
    
    OTHER("OTHER");

    private String value;

    ColorsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ColorsEnum fromValue(String value) {
      for (ColorsEnum b : ColorsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<ColorsEnum> colors = new ArrayList<>();

  private Category category;

  /**
   * Gets or Sets shape
   */
  public enum ShapeEnum {
    CIRCULAR("Circular"),
    
    OVAL("Oval"),
    
    SQUARESHAPED("SquareShaped"),
    
    RECTANGULAR("Rectangular"),
    
    IRREGULAR("Irregular"),
    
    OTHER("Other");

    private String value;

    ShapeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ShapeEnum fromValue(String value) {
      for (ShapeEnum b : ShapeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ShapeEnum shape;

  private Long price;

  public Product() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Product(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Product id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for a product.
   * @return id
  */
  @NotNull 
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The product's name.
   * @return name
  */
  @NotNull 
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product imagePath(String imagePath) {
    this.imagePath = imagePath;
    return this;
  }

  /**
   * The image's path.
   * @return imagePath
  */
  
  @JsonProperty("imagePath")
  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }

  public Product description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The product's description.
   * @return description
  */
  
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Product colors(List<ColorsEnum> colors) {
    this.colors = colors;
    return this;
  }

  public Product addColorsItem(ColorsEnum colorsItem) {
    if (this.colors == null) {
      this.colors = new ArrayList<>();
    }
    this.colors.add(colorsItem);
    return this;
  }

  /**
   * Get colors
   * @return colors
  */
  
  @JsonProperty("colors")
  public List<ColorsEnum> getColors() {
    return colors;
  }

  public void setColors(List<ColorsEnum> colors) {
    this.colors = colors;
  }

  public Product category(Category category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @Valid 
  @JsonProperty("category")
  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public Product shape(ShapeEnum shape) {
    this.shape = shape;
    return this;
  }

  /**
   * Get shape
   * @return shape
  */
  
  @JsonProperty("shape")
  public ShapeEnum getShape() {
    return shape;
  }

  public void setShape(ShapeEnum shape) {
    this.shape = shape;
  }

  public Product price(Long price) {
    this.price = price;
    return this;
  }

  /**
   * The product's price.
   * @return price
  */
  
  @JsonProperty("price")
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.imagePath, product.imagePath) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.colors, product.colors) &&
        Objects.equals(this.category, product.category) &&
        Objects.equals(this.shape, product.shape) &&
        Objects.equals(this.price, product.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, imagePath, description, colors, category, shape, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    colors: ").append(toIndentedString(colors)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

