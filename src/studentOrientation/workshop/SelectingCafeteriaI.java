package studentOrientation.workshop;

public interface SelectingCafeteriaI extends DurationI,EffortI,CostI,CarbonFootprintI{
    void setCost(int cost);
    int getCost();
}
