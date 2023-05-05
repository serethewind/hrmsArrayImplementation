package PropertyTypes;

import BaseClass.Property;
import Enums.OccupiedStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Condo extends Property {
    private int numberOfFloors;
    private String amenities;


    public Condo(String propertyCode, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean occupiedStatus, int numberOfFloors, amenities) {
        super(propertyCode, location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, occupiedStatus);
        this.numberOfFloors = numberOfFloors;
        this.amenities = amenities;
    }

    @Override
    public String toString() {
        return "Condo{" +
                "propertyCode : " + super.getPropertyCode() +
                "\nlocation : " + super.getLocation() + '\'' +
                "\nnumberOfBedrooms : " + super.getNumberOfBedrooms() +
                "\nnumberOfBathrooms : " + super.getNumberOfBathrooms() +
                "\nrentPerMonth : " + super.getRentPerMonth()+
                "\nnumberOfFLoors : " + getNumberOfFloors() +
                "\nAmenities : " + getAmenities() +
                "\noccupiedStatus : " + super.isOccupiedStatus() +
                "}\n\n";
    }
}
