package co.com.sofka.calendar.services;

import co.com.sofka.calendar.model.ProgramDate;
import co.com.sofka.calendar.repositories.ProgramDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProgramDateService {

    @Autowired
    ProgramDateRepository programDateRepository;

    public Flux<ProgramDate> saveAll(Flux<ProgramDate> program) {
        return programDateRepository.saveAll(program);
    }

    public Flux<ProgramDate> getAll(){
        return programDateRepository.findAll();
    }
}
