package SubClass;

import BaseClass.Property;
import Enums.PropertyCodeEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class House extends Property {

    private int numberOfFloors;
    private double yardSize;

    public House(PropertyCodeEnum prefix, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean isOccupiedStatus, int numberOfFloors, double yardSize) {
        super(prefix, location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, isOccupiedStatus);
        this.numberOfFloors = numberOfFloors;
        this.yardSize = yardSize;
    }

    @Override
    public double rentalIncome() {
        if (isOccupiedStatus()) {
            return getNumberOfFloors() * getNumberOfBedrooms() * getRentPerMonth();
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "," + '\n' +
                "numberOfFloors: " + getNumberOfFloors() + "," + '\n' +
                "yardSize: " + getYardSize() + "}"
                + '\n' + '\n';
    }
}
