package ie.atu.productv6;

public class ProductDb {

        public static Productable getProduct(String productCode) {
            // In a more realistic application, this code would
            // get the data for the product from a file or database
            // For now, this code just uses if/else statements
            // to return the correct product data

            Productable p = null;

            if (productCode.equalsIgnoreCase("java")) {
                Book myBook = new Book();
                myBook.setCode(productCode);
                myBook.setDescription("ATU Java Programming");
                myBook.setPrice(57.50);
                myBook.setAuthor("Joe Brown");
                p = myBook;
            } else if (productCode.equalsIgnoreCase("jsp")) {
                Book myBook = new Book();
                myBook.setCode(productCode);
                myBook.setDescription("Java Servlets and JSP");
                myBook.setPrice(57.50);
                myBook.setAuthor("Mike White");
                p = myBook;
            } else if (productCode.equalsIgnoreCase("mysql")) {
                Book myBook = new Book();
                myBook.setCode(productCode);
                myBook.setDescription("Lennon's MySQL");
                myBook.setPrice(54.50);
                myBook.setAuthor("Jim Lennon");
                p = myBook;
            }


            if (productCode.equalsIgnoreCase("studios")) {
                Software mySoftware = new Software();
                mySoftware.setCode(productCode);
                mySoftware.setDescription("Visual Studios");
                mySoftware.setPrice(57.50);
                mySoftware.setVersion("Microsoft 1.1");
                p = mySoftware;
            } else if (productCode.equalsIgnoreCase("eclipse")) {
                Software mySoftware = new Software();
                mySoftware.setCode(productCode);
                mySoftware.setDescription("Build Java apps");
                mySoftware.setPrice(57.50);
                mySoftware.setVersion("Eclipse Neon");
                p = mySoftware;
            } else if (productCode.equalsIgnoreCase("oracle")) {
                Software mySoftware = new Software();
                mySoftware.setCode(productCode);
                mySoftware.setDescription("Latest MySQL");
                mySoftware.setPrice(54.50);
                mySoftware.setVersion("Oracle 3.0");
                p = mySoftware;
            }
            if (productCode.equalsIgnoreCase("red")) {
                Tv myTv = new Tv();
                myTv.setCode(productCode);
                myTv.setDescription("Smart tv");
                myTv.setPrice(657.50);
                myTv.setSize("50 inches");
                p = myTv;
            }
            if (productCode.equalsIgnoreCase("pink")) {
                music mymusic = new music();
                mymusic.setCode(productCode);
                mymusic.setDescription("a grouo from America");
                mymusic.setPrice(57.50);
                mymusic.setArtist("by Pink floyd");
                p = mymusic;


                return p;
            }

        }
    }
}
