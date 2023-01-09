package chapterFour.selfAssessment.tipCalculateor;

public class Product {

    private String productName;
    private String productSize;
    private int productPrice;
    private int productQuantity;

    public Product(String productName, int productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public static int square(int num, int numb){
        return num*numb;
    }
    public double square(double num, int numb){
        
        return num*numb;
    }
    public Product(){}

    public void setProductName(String productName){
        this.productName = productName;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductSize(String productName, String productSize){
        if (productName.equalsIgnoreCase(this.productName)){
        this.productSize = productSize;
        }
    }

    public int getProductPrice(){
        return productPrice;
    }
    public void setProductQuantity(String productName, String productSize, int productQuantity){
        if (productName.equalsIgnoreCase(this.productName)&&productSize.equalsIgnoreCase(this.productSize)&&productQuantity > 0){
        this.productQuantity = productQuantity;
        }
    }
    public String getGetProductSize(){
        return productSize;
    }




}
