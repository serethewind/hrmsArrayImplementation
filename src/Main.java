
import Enums.PropertyCodeEnum;
import PropertyTypes.Apartment;
import PropertyTypes.Condo;
import PropertyTypes.House;
import RentalRepository.RentalRepository;

public class Main {

    public static void main(String[] args) throws Exception {

        RentalRepository rentalRepository = new RentalRepository(15);
        rentalRepository.addProperty(new Apartment(PropertyCodeEnum.APA, "ABUJA", 4, 4, 125.5, false, "1"));
        rentalRepository.addProperty(new Apartment(PropertyCodeEnum.APA, "ABUJA", 5, 4, 125.5, false, "1"));
        rentalRepository.addProperty(new Apartment(PropertyCodeEnum.APA, "ABUJA", 6, 4, 125.5, false, "1"));
        rentalRepository.addProperty(new Apartment(PropertyCodeEnum.APA, "ABUJA", 7, 4, 125.5, false, "1"));
        rentalRepository.addProperty(new Apartment(PropertyCodeEnum.APA, "ABUJA", 4, 4, 125.5, false, "1"));
        rentalRepository.addProperty(new House(PropertyCodeEnum.HOU, "Lagos", 7, 9, 78.85, false, 12, 46.5));
        rentalRepository.addProperty(new House(PropertyCodeEnum.HOU, "Lagos", 7, 9, 78.85, false, 12, 46.5));
        rentalRepository.addProperty(new House(PropertyCodeEnum.HOU, "Lagos", 7, 9, 78.85, false, 12, 46.5));
        rentalRepository.addProperty(new Condo(PropertyCodeEnum.CON, "Port Harcourt", 6, 8, 56.99, false, 8, "Gym, Pool, Bar"));
        rentalRepository.addProperty(new Condo(PropertyCodeEnum.CON, "Port Harcourt", 6, 8, 56.99, false, 8, "Gym, Pool, Bar"));
        rentalRepository.addProperty(new Condo(PropertyCodeEnum.CON, "Port Harcourt", 6, 8, 56.99, false, 8, "Gym, Pool, Bar"));
        rentalRepository.addProperty(new Condo(PropertyCodeEnum.CON, "Port Harcourt", 6, 8, 56.99, false, 8, "Gym, Pool, Bar"));
        System.out.println(rentalRepository.addProperty(new Condo(PropertyCodeEnum.CON, "Port Harcourt", 6, 8, 56.99, false, 8, "Gym, Pool, Bar")));
        System.out.println(rentalRepository.addProperty(new Condo(PropertyCodeEnum.CON, "Port Harcourt", 6, 8, 56.99, false, 8, "Gym, Pool, Bar")));
        System.out.println(rentalRepository.addProperty(new Condo(PropertyCodeEnum.CON, "Port Harcourt", 6, 8, 56.99, false, 8, "Gym, Pool, Bar")));
        System.out.println(rentalRepository.addProperty(new Condo(PropertyCodeEnum.CON, "Port Harcourt", 6, 8, 56.99, false, 8, "Gym, Pool, Bar")));
//        System.out.println(rentalRepository.viewAllProperties());
//        System.out.println(rentalRepository.updateProperty("APA001", new Apartment(PropertyCodeEnum.APA, "LAGOS", 5, 4, 125.5, false, "1")));
//        System.out.println(rentalRepository.viewSpecificPropertySubclass(PropertyCodeEnum.HOU));
//        rentalRepository.removeProperty("APA001");
//        System.out.println(rentalRepository.viewByPropertyCode("HOU001"));
//        System.out.println(rentalRepository.viewPropertyOccupied(false));
//        System.out.println(rentalRepository.viewPropertyByLocation("BENIN"));
//        System.out.println(rentalRepository.toString(PropertyCodeEnum.HOU));
    }

}