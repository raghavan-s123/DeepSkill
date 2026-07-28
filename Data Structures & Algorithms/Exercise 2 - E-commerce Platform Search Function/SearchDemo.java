public class SearchDemo {
    public static Product linearSearch(Product[] products, String key) {
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(key)) {
                return p;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1,"Laptop","Electronics"),
            new Product(2,"Phone","Electronics"),
            new Product(3,"Shoes","Fashion")
        };
        Product p = linearSearch(products,"Phone");
        if(p!=null){
            System.out.println(p.id+" "+p.name+" "+p.category);
        }else{
            System.out.println("Not Found");
        }
    }
}
