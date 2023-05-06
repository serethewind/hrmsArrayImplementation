package RentalRepository;

import BaseClass.Property;
import Enums.PropertyCodeEnum;
import Utility.PropertyName;


import java.util.Arrays;


public class RentalRepository {
    private Property[] properties;
    int numberOfProperties;

    public RentalRepository(int capacity) {
        this.properties = new Property[capacity];
    }

    public String addProperty(Property property) {
        //check the length of the properties

        numberOfProperties++;
        String response = "";
        if (numberOfProperties < properties.length) {
            properties[numberOfProperties] = property;
            response = "New property successfully added to properties database.";
        } else {
            response = "Database capacity is full. New Property not added.";
        }
        return response;

    }

    public String updateProperty(String PropertyCode, Property updatedProperty) {
        //search if the property to be updated is inside the properties array
        int count = 0;
        for (int i = 0; i < properties.length; i++) {
            if (properties[i] != null && properties[i].getPropertyCode().equals(PropertyCode)) {
                count++;
                properties[i] = updatedProperty;
            }
        }
        return count == 0 ? "Property has been updated." : "The specified property code is not present in our property list.";
    }

    //Delete implementation of CRUD: Delete Method
    public String removeProperty(String propertyCode) {
        int count = -1; //cannot initialize count to zero because index of array starts with zero.
        for (int i = 0; i < properties.length; i++) {
            if (properties[i] != null && properties[i].getPropertyCode().equalsIgnoreCase(propertyCode)) {
                properties[i] = null;
                count = i;
            }
        }
        for (int j = count; j < properties.length - 1; j++) {
            properties[j] = properties[j + 1];
        }
        numberOfProperties--;

        return (count == -1) ? "Property not found." : "Successfully deleted property with property code " + propertyCode;
    }

    public String viewAllProperties() {
        Property[] storage = new Property[numberOfProperties];

        for (int i = 0; i < storage.length; i++) {
            storage[i] = properties[i];
        }
        return Arrays.toString(storage);
    }

    public String viewSpecificPropertySubclass(PropertyCodeEnum prefix) {

        int count = 0;
        for (int i = 0; i < properties.length; i++) {
            if (properties[i] != null && properties[i].getPrefix().equals(prefix)) {
                count++;
            }
        }
        Property[] storage = new Property[count];
        int index = 0;
        for (int i = 0; i < properties.length; i++) {
            if (properties[i] != null && properties[i].getPrefix().equals(prefix)) {
                storage[index] = properties[i];
                index++;
            }
        }
        return Arrays.toString(storage);
    }

    public String viewByPropertyCode(String propertyCode) {
        int index = 0;
        Property[] storage = new Property[1];
        for (int i = 0; i < properties.length; i++) {
            if (properties[i] != null && properties[i].getPropertyCode().equalsIgnoreCase(propertyCode)) {
                storage[index] = properties[i];
                index++;
            }
        }
        return (index == 0) ?
                "Property with " + propertyCode + " not present in database." :
                Arrays.toString(storage);

    }

    public String viewPropertyOccupied(boolean status) {
        int count = 0;
        for (Property property : properties) {
            if (property != null && property.isOccupiedStatus() == status) count++;
        }
        Property[] storage = new Property[count];
        int index = 0;
        for (int i = 0; i < properties.length; i++) {
            if (properties[i] != null && properties[i].isOccupiedStatus() == status) {
                storage[index] = properties[i];
                index++;
            }
        }
        return (index == 0) ? "No property in the database has the occupied status as " + ((status)) : Arrays.toString(storage);

    }

    public String viewPropertyByLocation(String propertyLocation) {
        int count = 0;
        for (Property property : properties) {
            if (property != null && property.getLocation().equalsIgnoreCase(propertyLocation)) count++;
        }
        Property[] storage = new Property[count];
        int index = 0;
        for (int i = 0; i < properties.length; i++) {
            if (properties[i] != null && properties[i].getLocation().equalsIgnoreCase(propertyLocation)) {
                storage[index] = properties[i];
                index++;
            }
        }
        return (index == 0) ? "There are no properties in the database in " + propertyLocation.toUpperCase() : Arrays.toString(storage);
    }

    public int totalNumberOfProperties() {
        Property[] storage = new Property[numberOfProperties];

        for (int i = 0; i < storage.length; i++) {
            storage[i] = properties[i];
        }
        return storage.length;
    }

    public int totalNumberOfSpecifiedPropertySubclass(PropertyCodeEnum prefix) {
        int count = 0;
        for (int i = 0; i < properties.length; i++) {
            if (properties[i] != null && properties[i].getPrefix().equals(prefix)) {
                count++;
            }
        }
        return count;
    }

    public int totalNumberOfBedroomsInSpecifiedPropertySubclass(PropertyCodeEnum prefix) {
        int count = 0;
        for (Property property : properties) {
            if (property != null && property.getPrefix().equals(prefix)) count += property.getNumberOfBedrooms();
        }
        return count;
    }

    public int totalNumber0fBathroomsInSpecifiedPropertySubclass(PropertyCodeEnum prefix) {
        int count = 0;
        for (Property property : properties) {
            if (property != null && property.getPrefix().equals(prefix)) count += property.getNumberOfBathrooms();
        }
        return count;
    }

    public Double totalRentalIncomeForSpecifiedPropertySubclass(PropertyCodeEnum prefix) {
        double count = 0;
        for (Property property : properties) {
            if (property != null && property.getPrefix().equals(prefix)) count += property.getRentPerMonth();
        }
        return count;
    }

    public int totalNumberOfOccupiedPropertiesInSpecifiedPropertySubclass(PropertyCodeEnum prefix) {
        int count = 0;
        for (Property property : properties) {
            if (property != null && property.getPrefix().equals(prefix) && property.isOccupiedStatus()) count++;
        }
        return count;
    }

    public int totalNumberOfUnoccupiedPropertiesInSpecifiedPropertySubclass(PropertyCodeEnum prefix) {
        int count = 0;
        for (Property property : properties) {
            if (property != null && property.getPrefix().equals(prefix) && !property.isOccupiedStatus()) count++;
        }
        return count;
    }

    public String toString(PropertyCodeEnum prefix) {
        return "Total Number of all properties: " + totalNumberOfProperties() + '\n' +
                "Total Number of all " + PropertyName.propertyName(prefix) + " : " + totalNumberOfSpecifiedPropertySubclass(prefix) + '\n' +
                "Total Number of bedrooms: " + totalNumberOfBedroomsInSpecifiedPropertySubclass(prefix) + '\n' +
                "Total Number of bathrooms: " + totalNumber0fBathroomsInSpecifiedPropertySubclass(prefix) + '\n' +
                "Total rental income per month: " + totalRentalIncomeForSpecifiedPropertySubclass(prefix) + '\n' +
                "Total Number of occupied properties: " + totalNumberOfOccupiedPropertiesInSpecifiedPropertySubclass(prefix) + '\n' +
                "Total Number of unoccupied properties: " + totalNumberOfUnoccupiedPropertiesInSpecifiedPropertySubclass(prefix) + '\n'
                ;
    }
}




