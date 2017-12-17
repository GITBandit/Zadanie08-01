public enum Directions {

    NORTH("Północ"),
    EAST("Wschód"),
    SOUTH("Południe"),
    WEST("Zachód"),
    UNDEFINED("Nie ma takiego kierunku");

    String dir;

    Directions(String x){
        dir = x;
    }

    String getDirection(){
        return dir;
    }

    public static Directions convert (int num){
        switch (num){
            case 0:
                return NORTH;
            case 1:
                return EAST;
            case 2:
                return SOUTH;
            case 3:
                return WEST;
            default:
                return UNDEFINED;
        }

    }

}
