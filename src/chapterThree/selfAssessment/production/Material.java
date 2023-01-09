package chapterThree.selfAssessment.production;

public class Material{

	private String name;
	private int stockBalance;

	public Material(String materialName, int quantity){
		name = materialName;
	}
	public void receive(int quantityReceived){
		if (quantityReceived > 0){
			stockBalance = stockBalance + quantityReceived;
		}
	}
	public void supply(int quantitysupplied){
		if (quantitysupplied > 0){
			stockBalance = stockBalance - quantitysupplied;
		}
	}
	public int getStockBalance(){
		return stockBalance;
	}
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}











}