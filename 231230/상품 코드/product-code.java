import java.util.*;
import java.io.*;

class Product {
    String name;
    int code;

    public Product() {
        this.name = "codetree";
        this.code = 50;
    }

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String inputProductName = st.nextToken();
        int inputProductCode = Integer.parseInt(st.nextToken());
        
        Product product = new Product();
        System.out.printf("product %d is %s\n", product.code, product.name);
        product.name = inputProductName;
        product.code = inputProductCode;
        System.out.printf("product %d is %s", product.code, product.name);
    }
}