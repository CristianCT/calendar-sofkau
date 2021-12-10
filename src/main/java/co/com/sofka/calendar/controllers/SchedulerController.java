package co.com.sofka.calendar.controllers;

import co.com.sofka.calendar.model.ProgramDate;
import co.com.sofka.calendar.services.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class SchedulerController {

    @Autowired
    private SchedulerService schedulerService;

    @GetMapping("/{id}/{date}")
    public Flux<ProgramDate> getPrograms(@PathVariable("id") String id, @PathVariable("date") String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        return schedulerService.generateCalendar(id, localDate);
    }
}
