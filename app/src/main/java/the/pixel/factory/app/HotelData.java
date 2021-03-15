package the.pixel.factory.app;

public class HotelData {

private String hotelName,hotelAdd,hotelRating,hotelOffer;
private int image,rating;

    public HotelData(String hotelName, String hotelAdd, String hotelRating, String hotelOffer, int image, int rating) {
        this.hotelName = hotelName;
        this.hotelAdd = hotelAdd;
        this.hotelRating = hotelRating;
        this.hotelOffer = hotelOffer;
        this.image = image;
        this.rating = rating;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelAdd() {
        return hotelAdd;
    }

    public void setHotelAdd(String hotelAdd) {
        this.hotelAdd = hotelAdd;
    }

    public String getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(String hotelRating) {
        this.hotelRating = hotelRating;
    }

    public String getHotelOffer() {
        return hotelOffer;
    }

    public void setHotelOffer(String hotelOffer) {
        this.hotelOffer = hotelOffer;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
