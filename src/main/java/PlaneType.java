public enum PlaneType {

    BOEING747(416,183),
    AIRBUSA380(525,589),
    BOEING737(85,41);


    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacityFromPlane() {
        return capacity;
    }

    public int getWeightFromPlane() {
        return weight;
    }
}
