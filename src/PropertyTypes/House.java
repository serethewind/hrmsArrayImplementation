package PropertyTypes;

import BaseClass.Property;
import Enums.OccupiedStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class House extends Property {
    private double yardSize;
    private int numberOfFloors;

    public House(String propertyCode, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean occupiedStatus, double yardSize, int numberOfFloors) {
        super(propertyCode, location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, occupiedStatus);
        this.yardSize = yardSize;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "propertyCode : " + super.getPropertyCode() +
                "\nlocation : " + super.getLocation() + '\'' +
                "\nnumberOfBedrooms : " + super.getNumberOfBedrooms() +
                "\nnumberOfBathrooms : " + super.getNumberOfBathrooms() +
                "\nrentPerMonth : " + super.getRentPerMonth()+
                "\nyardSize : " + getYardSize() +
                "\nnumberOfFloors : " + getNumberOfFloors() +
                "\noccupiedStatus : " + super.isOccupiedStatus() +
                "}\n\n";
    }
}
