package dasz;

public class Kata {
    public static String[] towerBuilder(int nFloors) {
        String[] result = new String[nFloors];
        for (int i = 1; i <= nFloors; i++) {
            int stars = (2 * i) - 1;
            int spacesOnOneSide = (2 * nFloors - 1 - stars) / 2;
            StringBuilder sb = new StringBuilder();
            sb.append(" ".repeat(Math.max(0, spacesOnOneSide)));
            sb.append("*".repeat(Math.max(0, stars)));
            sb.append(" ".repeat(Math.max(0, spacesOnOneSide)));
            result[i - 1] = sb.toString();
        }
        return result;
    }
}