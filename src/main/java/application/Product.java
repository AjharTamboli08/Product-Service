package application;

public class Product{
    private  int productId;
    private String ProductName;
    private double ProductPrice;
    private int ProductQty;

    public Product() {
    }

    public Product(int productId, String productName, double productPrice, int ProductQty) {
        this.productId = productId;
        this.ProductName = productName;
        this.ProductPrice = productPrice;
        this.ProductQty = ProductQty;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        this.ProductName = productName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double productPrice) {
        this.ProductPrice = productPrice;
    }

    public int getProductQty() {
        return ProductQty;
    }

    public void setProductQty(int ProductQty) {
        this.ProductQty = ProductQty;
    }
}
