package com.springboot.webservices.entities.DTO;

import java.util.ArrayList;
import java.util.List;


public class ProductDto{
  
  private Long id;
  private String name;
  private String description;
  private Double price;
  private String imgUrl;
  private List<Integer> category = new ArrayList<>();

  public ProductDto() {

  }


  public ProductDto(Long id, String name, String description, Double price, String imgUrl, List<Integer> category) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
    this.imgUrl = imgUrl;
    this.category = category;
  }


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


  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    this.price = price;
  }


  public String getImgUrl() {
    return imgUrl;
  }


  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }


  public List<Integer> getCategory() {
    return category;
  }


  public void setCategory(List<Integer> category) {
    this.category = category;
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ProductDto other = (ProductDto) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }


  @Override
  public String toString() {
    return "ProductDto [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", imgUrl="
        + imgUrl + ", category=" + category + "]";
  }

  


  

  









  


  


  


  
  

  
}
