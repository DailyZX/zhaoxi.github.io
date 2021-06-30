package com.zhaoxi.Java1.pojo;

/**
 * @author shkstart
 * @create2021-01-1611:09
 */
/**
 * 书名:<input type="text" name="bookName"/><br/>
 作者:<input type="text" name="author"/><br/>
 价格:<input type="text" name="price"/><br/>
 库存:<input type="text" name="stock"/><br/>
 销量:<input type="text" name="sales"/><br/>
 * @author lfy
 *
 */
public class book {
    private String bookName;
    private String author;
    private Double price;
    private Integer stock;
    private Integer sales;
    private address address;

    public com.zhaoxi.Java1.pojo.address getAddress() {
        return address;
    }

    public void setAddress(com.zhaoxi.Java1.pojo.address address) {
        this.address = address;
    }
//无参构造器


    public book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", sales=" + sales +
                ", address=" + address +
                '}';
    }
}
