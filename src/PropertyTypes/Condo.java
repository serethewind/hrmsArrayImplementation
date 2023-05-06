package PropertyTypes;

import BaseClass.Property;
import Enums.PropertyCodeEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Condo extends Property {

    private int numberOfFloors;
    private String amenities;

    public Condo(PropertyCodeEnum prefix, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean isOccupiedStatus, int numberOfFloors, String amenities) {
        super(prefix, location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, isOccupiedStatus);
        this.numberOfFloors = numberOfFloors;
        this.amenities = amenities;
    }


    //    private PropertyCode propertyCode = PropertyCode.CON;
//
//
//    private int count = 1;
//    public String generatePropertyCode() {
//        String code = "CON" + String.format("%03d", count++);
//        return code;
//    }
    @Override
    public double rentalIncome() {
        if (isOccupiedStatus()){
            return getNumberOfFloors() * getNumberOfBedrooms() * getRentPerMonth();
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "," + '\n' +
                "numberOfFloors: " + getNumberOfFloors() + "," + '\n' +
                "amenities: " + getAmenities() + "}" + '\n' + '\n';
    }
}
