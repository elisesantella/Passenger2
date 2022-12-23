package ie.atu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/Passenger")

public class Passenger2Controller {
    Passenger2Service myService;

    public Passenger2Controller(Passenger2Service myService) {
        this.myService = myService;
    }

    @GetMapping
    public List<Passenger2> getPassenger() {
        return myService.getPassenger();
    }

    @GetMapping("/{PassengerID}")
    public Passenger2 getPassenger(@PathVariable String PassengerID) {
        return myService.getPassenger(PassengerID);
    }

    //Save Operation
    @PostMapping("")
    public void savePassenger(
            @RequestBody Passenger2 passenger)
    {
        myService.savePassenger(passenger);
    }
}

