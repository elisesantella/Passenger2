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

    //Find Passenger by name
    @GetMapping("/name/{name}")
    public Passenger2 getPassengerName(@PathVariable("name") String name)
    {
        return myService.findPassengerByName(name);
    }

    //Delete Operation
    @DeleteMapping("/delete/{count}")
    public void deletePassenger(@PathVariable("count") Long count)
    {
        myService.deletePassenger(count);
    }

    //http://localhost:8081/api/Passenger/age?age_start=1&age_end=60
    @GetMapping("/age")
    public List<Passenger2> getPassengerByAge(@RequestParam(name="age_start") int age1, @RequestParam(name="age_end") int age2)
    {
        return myService.findPassengerByAgeRange(age1,age2);
    }
}

