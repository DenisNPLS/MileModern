public class BonusMilesService {
    public int calculate(int cost) {

        int rublesMiles = 20;
        int miles = cost / rublesMiles;
        return miles;
    }
}
