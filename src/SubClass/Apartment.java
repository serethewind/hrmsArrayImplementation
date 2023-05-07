package SubClass;

import BaseClass.Property;
import Enums.PropertyCodeEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Apartment extends Property {
    private String floorNumber;

    public Apartment(PropertyCodeEnum prefix, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean isOccupiedStatus, String floorNumber) {
        super(prefix, location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, isOccupiedStatus);
        this.floorNumber = floorNumber;
    }

    @Override
    public double rentalIncome() {
        if (isOccupiedStatus()){
            return getNumberOfBedrooms() * getRentPerMonth();
        }
        return 0;
    }

    @Override
    public String toString() {
        return  super.toString() + "," + '\n' +
                "floorNumber: " + getFloorNumber() + "," + '\n' +
                "rentalIncome: " + rentalIncome() + "}" + '\n' + '\n';
    }

}
