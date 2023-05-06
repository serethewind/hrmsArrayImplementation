package RentalRepository;

import BaseClass.Property;
import Enums.PropertyCodeEnum;


import java.util.Arrays;


public class RentalRepository {
    private Property[] properties;
    int numberOfProperties;

    public RentalRepository(int capacity) {
        this.properties = new Property[capacity];
    }

    public void addProperty(Property property) {
        //check the length of the properties
        properties[numberOfProperties] = property;
        numberOfProperties++;
    }

    public String updateProperty(String PropertyCode, Property updatedProperty) {
        //search if the property to be updated is inside the properties array
        try {
            for (int i = 0; i < properties.length; i++) {
                if (properties[i] != null && properties[i].getPropertyCode().equals(PropertyCode)) {
                    properties[i] = updatedProperty;
                }
            }
            return "Property has been updated.";
        } catch (Exception e) {
            e.getMessage();
        }
        return "The specified property code is not present in our property list.";
    }

    //Delete implementation of CRUD: Delete Method
    public void removeProperty(String propertyCode) {
        for (int i = 0; i < properties.length; i++) {
            if (properties[i].getPropertyCode().equalsIgnoreCase(propertyCode)) {
                properties[i] = null;
            }
            for (int j = i; j < properties.length; j++) {
                properties[i] = properties[j];
            }
        }
        numberOfProperties--;
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


}




