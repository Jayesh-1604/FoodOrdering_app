package com.example.eatup;

public class Restaurants {
    private int rImageResouseId;
    private String rRestaurantsName;
    private String rRatings;
    private String rLocation;

    public Restaurants(int ImageResouseId ,String RestaurantsName,String Ratings,String Location){
        this.rImageResouseId = ImageResouseId;
        this.rRestaurantsName = RestaurantsName;
        this.rRatings = Ratings;
        this.rLocation = Location;
    }

    public int getrImageResouseId() {
        return rImageResouseId;
    }

    public String getrRestaurantsName(){
        return rRestaurantsName;
    }

    public String getrRatings() {
        return rRatings;
    }

    public String getrLocation() {
        return rLocation;
    }
}
