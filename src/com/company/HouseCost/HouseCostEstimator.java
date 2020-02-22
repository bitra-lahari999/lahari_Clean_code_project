package com.company.HouseCost;

import java.util.HashMap;

public class HouseCostEstimator {

        String materialStandard;
        Double area;
        boolean fully_automated;

        static HashMap<String, Double> PriceRate = new HashMap<String, Double>();
        PriceRate.put("SM",1200);
        PriceRate.put("ASM",1500);
        PriceRate.put("HSM",1800);


        HouseCostCalculation() {

        }

        HouseCostCalculation(String standard, Double area, boolean fully_automated) {
            this.materialStandard = standard;
            this.area = area;
            this.fully_automated = fully_automated;

        }

        void setStandard(String standard) {
            this.materialStandard = standard;
        }

        void setArea(Double area) {
            this.area = area;
        }

        void setFullAutomation(boolean fully_automated) {
            this.fully_automated = fully_automated;
        }

        String getMaterialStandard() {
            return this.materialStandard;
        }

        Double getArea() {
            return this.area;
        }

        int isFullyAutomated() {
            return this.fully_automated;
        }

        static Double getPriceRate(boolean fully_automated)
        {
            if(fully_automated &&this.materialStandard=="HSM")
            {
                return 2500;
            }
            else return PriceRate.get(this.materialStandard);
        }


        Double estimateHouseCost() {
            Double cost = 0.0;
            cost =getPriceRate()*this.area;

            return cost;
        }



}
