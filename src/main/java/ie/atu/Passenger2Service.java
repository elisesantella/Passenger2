package ie.atu;

import ie.atu.Passenger2;
import ie.atu.Passenger2Repo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@AllArgsConstructor
@Service
public class Passenger2Service {

    private final Passenger2Repo PassengerRepo;

    public List<Passenger2> getPassenger() {
        return PassengerRepo.findAll();

    }

    public Passenger2 getPassenger(String PassengerID) {
        Passenger2 myPassenger = new Passenger2("Ms", "Elise", "G003871700", "0830152926", 23);
        return myPassenger;
    }

    public void savePassenger(Passenger2 passenger)
    {
        PassengerRepo.save(passenger);

    }

    public Passenger2 findPassengerByName(String name){
        return PassengerRepo.findPassengerByName(name);
    }

    public void deletePassenger(Long count)
    {
        PassengerRepo.deleteById(count);
    }
}