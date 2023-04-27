import domain.Bucket;
import domain.Product;
import domain.User;
import services.BucketService;
import services.ProductService;
import services.UserService;
import services.impl.BucketServiceImpl;
import services.impl.ProductServiceImpl;
import services.impl.UserServiceImpl;

import java.sql.Date;


public class MainTest {
    public static void main(String[] args) {

        /*
        UserService us = new UserServiceImpl();
        us.create(new User("test", "test", "test", "test", "test"));

        ProductService ps = new ProductServiceImpl();
        ps.create(new Product("testName", "testDescription", 0.9));

        BucketService bs = new BucketServiceImpl();
        long millis=System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        bs.create(new Bucket(1, 1, date));
         */

        UserService us = new UserServiceImpl();
        ProductService ps = new ProductServiceImpl();
        BucketService bs = new BucketServiceImpl();







    }
}
