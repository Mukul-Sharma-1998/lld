package com.example.lld.parkingLot.parkingSpotSearch;


import com.example.lld.parkingLot.parkingSpotSearch.ParkingSpotSearchDefault;
import com.example.lld.parkingLot.parkingSpotSearch.ParkingSpotSearchOptimised;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ParkingSpotSearchFactory {
    ParkingSpotSearchDefault parkingSpotSearchDefault;
    ParkingSpotSearchOptimised parkingSpotSearchOptimised;
}
