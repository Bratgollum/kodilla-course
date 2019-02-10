package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {


    private final List<Continent>  worldWithContinents = new ArrayList<>();

    public void addContinent(Continent continent){
        worldWithContinents.add(continent);
    }
    public void removeContinent(Continent continent){
        worldWithContinents.remove(continent);
    }
    public BigDecimal getPeopleQuantity(){
        BigDecimal totalPeopleQuantity = worldWithContinents.stream()
                .flatMap(continent -> continent.getContinentCountrys().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum , current) -> sum = sum.add(current));


        return totalPeopleQuantity;

    }

}
