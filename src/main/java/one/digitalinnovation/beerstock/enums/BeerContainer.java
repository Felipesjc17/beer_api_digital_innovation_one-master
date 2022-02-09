package one.digitalinnovation.beerstock.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BeerContainer {

    CAN("Beer Can"),
    SMALL_BOTTLE("Beer Bottle 600ml"),
    BIG_BOTTLE("Beer Bottle 1L");

    private final String descriptionContainer;
}
