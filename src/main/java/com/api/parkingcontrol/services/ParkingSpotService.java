package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ParkingSpotService {

    final
    ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }

    public ParkingSpotModel testSave() {
        ParkingSpotModel parkingSpotModel2 = new ParkingSpotModel();

        parkingSpotModel2.setParkingSpotNumber("203B");
        parkingSpotModel2.setLicensePlateCar("RRS8563");
        parkingSpotModel2.setBrandCar("toyota");
        parkingSpotModel2.setModelCar("hylux");
        parkingSpotModel2.setColorCar("white");
        parkingSpotModel2.setResponsibleName("Carlos Daniel");
        parkingSpotModel2.setApartment("203");
        parkingSpotModel2.setBlock("B");

        return parkingSpotModel2;
    }
}
