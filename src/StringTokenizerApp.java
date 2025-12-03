import java.util.StringTokenizer;
    public class StringTokenizerApp {
        public static void main(String[] args) {
            String name ="Abdul Gofur Tiflen";
            StringTokenizer st = new StringTokenizer(name, " ");

            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                System.out.println(token);
            }
    }
}
