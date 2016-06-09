package com.packt.webstore.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table( name = "product" )
@XmlRootElement
public class Product {
    @Id
    @Column
    private String              productId;
    @Column
    private String              name;
    @Column
    private BigDecimal          unitPrice;
    @Column
    private String              description;
    @Column
    private String              manufacturer;
    @Column
    private String              category;
    @Column
    private long                unitsInStock;
    @Column
    private long                unitsInOrder;
    @Column
    private boolean             discontinued;
    @Column
    private String              condition;
    @Transient
    @ElementCollection( targetClass = String.class )
    private List<String>        imageSource;
    @Transient
    @JsonIgnore
    private List<MultipartFile> productImage;

    public Product() {
        super();
    }

    public Product( String productId, String name, BigDecimal unitPrice ) {
        this.productId = productId;
        this.name = name;
        this.setUnitPrice( unitPrice );
    }

    // add setters and getters for all the fields here

    @Override
    public boolean equals( Object obj ) {
        if ( this == obj )
            return true;
        if ( obj == null )
            return false;
        if ( getClass() != obj.getClass() )
            return false;
        Product other = (Product) obj;
        if ( productId == null ) {
            if ( other.productId != null )
                return false;
        } else if ( !productId.equals( other.productId ) )
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( productId == null ) ? 0 : productId.hashCode() );
        return result;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", name=" + name + "]";
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice( BigDecimal unitPrice ) {
        this.unitPrice = unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer( String manufacturer ) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory( String category ) {
        this.category = category;
    }

    public long getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock( long unitsInStock ) {
        this.unitsInStock = unitsInStock;
    }

    public long getUnitsInOrder() {
        return unitsInOrder;
    }

    public void setUnitsInOrder( long unitsInOrder ) {
        this.unitsInOrder = unitsInOrder;
    }

    public boolean isDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued( boolean discontinued ) {
        this.discontinued = discontinued;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition( String condition ) {
        this.condition = condition;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId( String productId ) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public List<String> getImageSource() {
        return imageSource;
    }

    public void setImageSource( List<String> imageSource ) {
        this.imageSource = imageSource;
    }

    @XmlTransient
    public List<MultipartFile> getProductImage() {
        return productImage;
    }

    public void setProductImage( List<MultipartFile> productImage ) {
        this.productImage = productImage;
    }

}
