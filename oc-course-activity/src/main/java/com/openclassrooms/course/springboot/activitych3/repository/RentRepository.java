package com.openclassrooms.course.springboot.activitych3.repository;

import com.openclassrooms.course.springboot.activitych3.Rent;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;


@Service
public class RentRepository {

    private List<Rent> rents;
    public RentRepository() {
        try {
            this.initializeCitiesList();
        } catch (IOException e) {
            System.out.println("Initialization of cities list failed");
        }
    }




    public Rent findByCity(String city) {
        return rents.stream().filter(r -> r.getCity().equalsIgnoreCase(city)).findFirst().orElse(null);
    }

    private void initializeCitiesList() throws IOException {
        InputStream resource = new ClassPathResource("rents.csv").getInputStream();
        rents = new CsvToBeanBuilder<Rent>(new BufferedReader(
                new InputStreamReader(resource))).withType(Rent.class).build().parse();
    }




}
