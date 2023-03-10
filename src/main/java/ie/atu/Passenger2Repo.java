package ie.atu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface Passenger2Repo extends JpaRepository<Passenger2, Long> {
    public Passenger2 findPassengerByName(String name);

    @Query("SELECT p FROM Passenger p WHERE p.age > ?1 and p.age < ?2")
    public List<Passenger2> findPassengerByAge(int age, int age2);

}

