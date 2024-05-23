public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int i = 100;
        while (i != 0){
            if (i % 2 == 0){
                i = i / 2;
            } else {
                i -= 1;
            }
            count += 1;
        }
        System.out.println(count);
    }

}
