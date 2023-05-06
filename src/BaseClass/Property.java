package BaseClass;

//import Enums.OccupiedStatus;
import Enums.PropertyCodeEnum;
import Utility.PropertyCodeGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract  class Property {

    private PropertyCodeEnum prefix;
    private String propertyCode;
    private String location;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private double rentPerMonth;
    private boolean isOccupiedStatus;


    public Property(PropertyCodeEnum prefix, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean isOccupiedStatus) {
        this.prefix = prefix;
        this.propertyCode = PropertyCodeGenerator.getCode(prefix);
        this.location = location;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.rentPerMonth = rentPerMonth;
        this.isOccupiedStatus = isOccupiedStatus;
    }

    public void setPropertyCode(String propertyCode) {
        this.propertyCode = PropertyCodeGenerator.getCode(prefix);

    }

    public PropertyCodeEnum getPrefix() {
        return prefix;
    }

    public abstract double rentalIncome();

    @Override
    public String toString() {
        return "{propertyCode: " + getPropertyCode() + "," + '\n' +
                "location: " + getLocation() + "," + '\n' +
                "numberOfBedrooms: " + getNumberOfBedrooms() + "," + '\n' +
                "numberOfBathrooms: " + getNumberOfBathrooms() + "," + '\n' +
                "rentPerMonth: " + getRentPerMonth() + "," + '\n' +
                "isOccupiedStatus: " + isOccupiedStatus();
    }
}
