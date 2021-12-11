package co.com.sofka.calendar.repositories;

import co.com.sofka.calendar.model.ProgramDate;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProgramDateRepository extends ReactiveMongoRepository<ProgramDate, String> {
}
