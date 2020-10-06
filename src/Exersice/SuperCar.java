package Exersice;

public class SuperCar {

    //attributes
    private String CarBrand;
    private String CarColor;
    private String CarEngingSize;
    private int MaxSupeed;
    private int CountryOfOrigin;
   public SuperCar (){
   }

    //constructor

    public SuperCar(String carBrand, String carColor, String carEngingSize, int maxSupeed, int countryOfOrigin, String superCar) {
        CarBrand = carBrand;
        CarColor = carColor;
        CarEngingSize = carEngingSize;
        MaxSupeed = maxSupeed;
        CountryOfOrigin = countryOfOrigin;

}

    //getter and setter

    public String getCarBrand() {
        return CarBrand;
    }

    public void setCarBrand(String carBrand) {
        CarBrand = carBrand;
    }

    public String getCarColor() {
        return CarColor;
    }

    public void setCarColor(String carColor) {
        CarColor = carColor;
    }

    public String getCarEngingSize() {
        return CarEngingSize;
    }

    public void setCarEngingSize(String carEngingSize) {
        CarEngingSize = carEngingSize;
    }

    public int getMaxSupeed() {
        return MaxSupeed;
    }

    public void setMaxSupeed(int maxSupeed) {
        MaxSupeed = maxSupeed;
    }

    public int getCountryOfOrigin() {
        return CountryOfOrigin;
    }

    public void setCountryOfOrigin(int countryOfOrigin) {
        CountryOfOrigin = countryOfOrigin;
    }



    //toString


    @Override
    public String toString() {
        return "SuperCar{" +
                "CarBrand='" + CarBrand + '\'' +
                ", CarColor='" + CarColor + '\'' +
                ", CarEngingSize='" + CarEngingSize + '\'' +
                ", MaxSupeed=" + MaxSupeed +
                ", CountryOfOrigin=" + CountryOfOrigin +
                '}';
    }
}
