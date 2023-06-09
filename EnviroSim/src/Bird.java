public class Bird extends AnimalAttributes implements Animal {
    int x = 0;
    int y = 0;
    int[] coordinates = {x, y};
    @Override
    public int[] move() {
        final String DIRECTION = getRandomDirection();

            switch (DIRECTION) {
                case "N":
                    y += 1;
                    coordinates[1] = y; // added these lines because the program wasn't applying x/y's new value to 'coordinates'
                    break;
                case "S":
                    y -= 1;
                    coordinates[1] = y;
                    break;
                case "E":
                    x += 1;
                    coordinates[0] = x;
                    break;
                case "W":
                    x -= 1;
                    coordinates[0] = x;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + DIRECTION);
            }

        return coordinates;
    }

    @Override
    public int[] getPosition() {
        return coordinates;
    }

    @Override
    public boolean getDeadOrAlive() { // still need to figure this part out; how to tell if animal is dead/alive
        return isAlive;
    }
}
