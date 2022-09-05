package com.example.demo.shejimoshi.chuangjianxing;

public class 建造者模式 {

    public Product create(){
        return new ConreteBuilder().addName().addType().build();
    }
}

interface Builder{
    Product build();
}

class ConreteBuilder implements Builder{
    private Product product =  new Product();

    public ConreteBuilder addName(){
        product.setName("");
        return this;
    }

    public ConreteBuilder addType(){
        product.setType("");
        return this;
    }

    public Product build(){
        return product;
    }

}


class Product{

    String name;

    String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
