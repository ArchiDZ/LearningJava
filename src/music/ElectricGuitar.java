package music;

public class ElectricGuitar {
    String brand;
    int numOfPickup;
    boolean rockStarUseIt;

    String getBrand(){
        return brand;
    }
    void setBrand(String aBrand){
        brand = aBrand;
    }
    int getNumOfPickup(){
        return numOfPickup;
    }
    void setNumOfPickup(int num){
        numOfPickup = num;
    }
    boolean getRockStartUseIt(){
        return rockStarUseIt;
    }
    void  setRockStarUseIt(boolean yesOrNo){
        rockStarUseIt = yesOrNo;
    }

}
