class ParkingSystem {
    private int[] cars;

    public ParkingSystem(int big, int medium, int small) {
        cars = new int[]{big, medium, small};
    }
    
    public boolean addCar(int carType) {
        int index = carType - 1;
        if (index < 0 || index >= cars.length) {
            throw new IllegalArgumentException("invalid");
        }
        if (cars[index] > 0) {
            cars[index]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
