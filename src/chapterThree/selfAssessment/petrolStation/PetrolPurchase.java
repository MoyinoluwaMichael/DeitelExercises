package chapterThree.selfAssessment.petrolStation;

public class PetrolPurchase {

    private String stationLocation;
    private String typeOfPetrol;
    private int quantity;
    private double pricePerLiter;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String typeOfPetrol, int quantity, double pricePerLiter, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.typeOfPetrol = typeOfPetrol;
        this.quantity = quantity;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }
    public void setStationLocation(String stationLocation, String typeOfPetrol){
        this.stationLocation = stationLocation;
        this.typeOfPetrol = typeOfPetrol;
    }
    public String getStationLocation(){
        return this.stationLocation;
    }
    public void setTypeOfPetrol(String typeOfPetrol){
        this.typeOfPetrol = typeOfPetrol;
    }
    public String getTypeOfPetrol(){
        return this.typeOfPetrol;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setPricePerLiter(double pricePerLiter){
        this.pricePerLiter = pricePerLiter;
    }
    public double getPricePerLiter(){
        return this.pricePerLiter;
    }
    public void setPercentageDiscount(double percentageDiscount){
        this.percentageDiscount = percentageDiscount;
    }
    public double getPercentageDiscount(){
        return (getQuantity() * getPricePerLiter()) * percentageDiscount;
    }
    public double getPurchaseAmount(){
        return (double)((getQuantity() * getPricePerLiter()) - getPercentageDiscount());
    }
}
