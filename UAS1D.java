import java.util.ArrayList;


public class UAS1D {
    public static void main(String[] args) {
        String client_key = "wSCoGfxjRczziGCxJZKGOAHeDDDIAvZKXJOOVItiDyOOPjcd";
        String[] p = splitString(client_key, 4);
        ArrayList<Integer> s = new ArrayList<>();

        for (int index = 0; index < p.length; index++) {
            s.add(getCountTheSame(p[index]));
        }

        for (int index = 0; index < s.size(); index++) {
            System.out.println("key " + index + " is : " + s.get(index));
        }
    }

    public static String[] splitString(String str, int chunkSize) {
        int length = (int) Math.ceil((double) str.length() / chunkSize);
        String[] result = new String[length];

        int index = 0;
        for (int i = 0; i < length; i++) {
            result[i] = str.substring(index, Math.min(index + chunkSize, str.length()));
            index += chunkSize;
        }

        return result;
    }

    public static int getCountTheSame(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                count += 2;
            } else if (Character.isUpperCase(c)) {
                count += 3;
            }
        }

        return count;
    }
}
