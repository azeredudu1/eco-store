package com.packt.webstore.domain.repository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.exception.ProductNotFoundException;

@Repository
@Component( value = "OutMemory" )
public class OutMemoryProductRepository implements ProductRepository {
    private List<Product> listOfProducts = new ArrayList<Product>();

    public OutMemoryProductRepository() {

        Product dellStreak = new Product( "dellStreak", "Dell-streak-7", new BigDecimal( 500 ) );

        dellStreak
                .setDescription(
                "Introducing Dell\u2122 Streak 7. Share photos, videos and movies together. It\u2019s small enough to carry around, big enough to gather around. Android\u2122 2.2-based tablet with over-the-air upgrade capability for future OS releases.  A vibrant 7-inch, multitouch display with full Adobe\u00ae Flash 10.1 pre-installed.  Includes a 1.3 MP front-facing camera for face-to-face chats on popular services such as Qik or Skype.  16 GB of internal storage, plus Wi-Fi, Bluetooth and built-in GPS keeps you in touch with the world around you.  Connect on your terms. Save with 2-year contract or flexibility with prepaid pay-as-you-go plans"
                );
        dellStreak.setCategory( "Tablet" );
        dellStreak.setManufacturer(
                "Dell" );
        dellStreak.setUnitsInStock( 1000 );
        List<String> imageSource =
                new ArrayList<String>();
        imageSource.add( "dell-streak-7.0.jpg" );
        imageSource.add( "dell-streak-7.1.jpg" );
        imageSource.add( "dell-streak-7.2.jpg" );
        imageSource.add( "dell-streak-7.3.jpg" );
        imageSource.add( "dell-streak-7.4.jpg" );
        dellStreak.setImageSource( imageSource );

        Product dellVenue = new Product( "dellVenue", "Dell-venue", new
                BigDecimal( 700 ) );
        dellVenue
                .setDescription( "The Venue is the perfect one-touch, Smart Phone providing instant access to everything you love. All of Venue's features make it perfect for on-the-go students, mobile professionals, and active social communicators who love style and performance.\n\nElegantly designed, the Venue offers a vibrant, curved glass display that\u2019s perfect for viewing all types of content. The Venue\u2019s slender form factor feels great in your hand and also slips easily into your pocket.  A mobile entertainment powerhouse that lets you download the latest tunes from Amazon MP3 or books from Kindle, watch video, or stream your favorite radio stations.  All on the go, anytime, anywhere." );
        dellVenue.setCategory( "Smartphone" );
        dellVenue.setManufacturer(
                "Dell" );
        dellVenue.setUnitsInStock( 1000 );
        List<String> imageSource1 = new ArrayList<String>();
        imageSource1.add( "dell-venue.0.jpg" );
        imageSource1.add( "dell-venue.1.jpg" );
        imageSource1.add( "dell-venue.2.jpg" );
        imageSource1.add( "dell-venue.3.jpg" );
        imageSource1.add( "dell-venue.4.jpg" );
        imageSource1.add( "dell-venue.5.jpg" );
        dellVenue.setImageSource( imageSource1 );

        Product motorolaAtrix4g = new Product( "motorolaAtrix4g", "Motorola-atrix-4g", new
                BigDecimal( 300 ) );
        motorolaAtrix4g
                .setDescription(
                "MOTOROLA ATRIX 4G gives you dual-core processing power and the revolutionary webtop application. With webtop and a compatible Motorola docking station, sold separately, you can surf the Internet with a full Firefox browser, create and edit docs, or access multimedia on a large screen almost anywhere."
                );
        motorolaAtrix4g.setCategory( "Smartphone" );
        motorolaAtrix4g.setManufacturer( "Motorola" );
        motorolaAtrix4g.setUnitsInStock( 1000 );

        List<String> imageSource2 = new ArrayList<String>();
        imageSource2.add( "motorola-atrix-4g.0.jpg" );
        imageSource2.add( "motorola-atrix-4g.1.jpg" );
        imageSource2.add( "motorola-atrix-4g.2.jpg" );
        imageSource2.add( "motorola-atrix-4g.3.jpg" );
        motorolaAtrix4g.setImageSource( imageSource2 );

        Product nexusS = new Product( "nexusS", "Nexus-s", new
                BigDecimal( 300 ) );
        nexusS
                .setDescription(
                "Nexus S is the next generation of Nexus devices, co-developed by Google and Samsung. The latest Android platform (Gingerbread), paired with a 1 GHz Hummingbird processor and 16GB of memory, makes Nexus S one of the fastest phones on the market. It comes pre-installed with the best of Google apps and enabled with new and popular features like true multi-tasking, Wi-Fi hotspot, Internet Calling, NFC support, and full web browsing. With this device, users will also be the first to receive software upgrades and new Google mobile apps as soon as they become available. For more details, visit http://www.google.com/nexus."
                );
        nexusS.setCategory( "Smartphone" );
        nexusS.setManufacturer( "Nexus" );
        nexusS.setUnitsInStock( 1000 );

        List<String> imageSource3 = new ArrayList<String>();
        imageSource3.add( "nexus-s.0.jpg" );
        imageSource3.add( "nexus-s.1.jpg" );
        imageSource3.add( "nexus-s.2.jpg" );
        imageSource3.add( "nexus-s.3.jpg" );
        nexusS.setImageSource( imageSource3 );

        Product samsungGalaxyTab = new Product( "samsungGalaxyTab", "Samsung-galaxy-tab", new
                BigDecimal( 300 ) );
        samsungGalaxyTab
                .setDescription(
                "Feel Free to Tab\u2122. The Samsung Galaxy Tab\u2122, the tablet device that delivers enhanced capabilities with advanced mobility, has a large, perfectly sized, 7.0\" screen that offers plenty of room for the thousands of interactive games and apps available for the Android\u2122 platform, and its slim design makes it perfect for travel and one-handed grip. Use the Galaxy Tab to relax and enjoy an e-book, watch rich video or full web content with its Adobe\u00ae Flash\u00ae Player compatibility, video chat using the front-facing camera, or send user-generated content wirelessly to other devices like your TV via AllShare\u2122.  With so many options for customization and interactivity, the Galaxy Tab gives you everything you want, anywhere you go\u2026Feel Free to Tab\u2122."
                );
        samsungGalaxyTab.setCategory( "Tablet" );
        samsungGalaxyTab.setManufacturer( "Samsung" );
        samsungGalaxyTab.setUnitsInStock( 1000 );

        List<String> imageSource4 = new ArrayList<String>();
        imageSource4.add( "samsung-galaxy-tab.0.jpg" );
        imageSource4.add( "samsung-galaxy-tab.1.jpg" );
        imageSource4.add( "samsung-galaxy-tab.2.jpg" );
        imageSource4.add( "samsung-galaxy-tab.3.jpg" );
        imageSource4.add( "samsung-galaxy-tab.4.jpg" );
        imageSource4.add( "samsung-galaxy-tab.5.jpg" );
        imageSource4.add( "samsung-galaxy-tab.6.jpg" );

        samsungGalaxyTab.setImageSource( imageSource4 );

        Product samsungGem = new Product( "samsungGem", "Samsung-gem", new
                BigDecimal( 300 ) );
        samsungGem
                .setDescription(
                "The Samsung Gem\u2122 maps a route to a smarter mobile experience. By pairing one of the fastest processors in the category with the Android\u2122 platform, the Gem delivers maximum multitasking speed and social networking capabilities to let you explore new territory online. A smart phone at an even smarter price is a real find, so uncover the Gem and discover what\u2019s next."
                );
        samsungGem.setCategory( "Tablet" );
        samsungGem.setManufacturer( "Samsung" );
        samsungGem.setUnitsInStock( 1000 );

        List<String> imageSource5 = new ArrayList<String>();
        imageSource5.add( "samsung-gem.0.jpg" );
        imageSource5.add( "samsung-gem.1.jpg" );
        imageSource5.add( "samsung-gem.2.jpg" );

        samsungGem.setImageSource( imageSource5 );

        Product lgAxis = new Product( "lgAxis", "Lg-axis", new
                BigDecimal( 300 ) );
        lgAxis
                .setDescription(
                "Android plus QWERTY is a powerful duo. LG Axis melds a speedy UI with the limitless micro-entertainment of 80,000+ apps including voice-activated Google. Feel the tactile vibration on its tempered glass touchscreen. Take the fuzziness out of your fun with a 3.2MP camera that does 360\u00b0 panoramics. And customize your home screens with shortcuts to your apps, favorites, and widgets. It's the centerpiece of your life."
                );
        lgAxis.setCategory( "Smartphone" );
        lgAxis.setManufacturer( "Lg" );
        lgAxis.setUnitsInStock( 1000 );

        List<String> imageSource6 = new ArrayList<String>();
        imageSource6.add( "lg-axis.0.jpg" );
        imageSource6.add( "lg-axis.1.jpg" );
        imageSource6.add( "lg-axis.2.jpg" );

        lgAxis.setImageSource( imageSource6 );

        Product sanyoZio = new Product( "lgAxis", "Sanyo-zio", new
                BigDecimal( 300 ) );
        sanyoZio
                .setDescription(
                "Zio uses CDMA2000 1xEV-DO rev. A and Wi-Fi technologies and features a 3.5-inch WVGA touch-screen display as a backdrop for a fully customizable mobile multimedia experience.  Along with the touch-screen, a trackball helps users navigate features such as the 3.2 MP camera with video record/playback, media player and full HTML Web browser.  Zio supports up to 32GB through its external microSD memory slot."
                );
        sanyoZio.setCategory( "Smartphone" );
        sanyoZio.setManufacturer( "Lg" );
        sanyoZio.setUnitsInStock( 1000 );

        List<String> imageSource7 = new ArrayList<String>();
        imageSource7.add( "sanyo-zio.0.jpg" );
        imageSource7.add( "sanyo-zio.1.jpg" );
        imageSource7.add( "sanyo-zio.2.jpg" );
        sanyoZio.setImageSource( imageSource7 );

        listOfProducts.add( dellStreak );
        listOfProducts.add( dellVenue );
        listOfProducts.add( motorolaAtrix4g );
        listOfProducts.add( nexusS );
        listOfProducts.add( samsungGalaxyTab );
        listOfProducts.add( samsungGem );
        listOfProducts.add( lgAxis );
        listOfProducts.add( sanyoZio );
    }

    @Override
    public List<Product> getAllProducts() {
        return listOfProducts;
    }

    @Override
    public Product getProductById( String productid ) {
        Product productById = null;
        for ( Product product : listOfProducts ) {
            if ( product != null && product.getProductId() != null && product.getProductId().equals( productid ) ) {
                productById = product;
                break;
            }
        }
        if ( productById == null ) {
            throw new ProductNotFoundException( productid );
        }
        return productById;
    }

    @Override
    public List<Product> getProductsByCategory( String category ) {
        List<Product> productsByCategory = new ArrayList<Product>();
        for ( Product product : listOfProducts ) {
            if ( category.equalsIgnoreCase( product.getCategory() ) )
                productsByCategory.add( product );
        }

        return productsByCategory;
    }

    @Override
    public Set<Product> getProductsByFiler( Map<String, List<String>> filterParams ) {

        Set<Product> productsByBrand = new HashSet<Product>();
        Set<Product> productsByCategory = new HashSet<Product>();

        Set<String> criterias = filterParams.keySet();

        if ( criterias.contains( "brand" ) ) {
            for ( String brandName : filterParams.get( "brand" ) ) {
                for ( Product product : listOfProducts ) {
                    if ( brandName.equalsIgnoreCase( product.getManufacturer() ) ) {
                        productsByBrand.add( product );
                    }

                }
            }
        }

        if ( criterias.contains( "category" ) ) {
            for ( String categoryName : filterParams.get( "category" ) ) {
                productsByCategory.addAll( this.getProductsByCategory( categoryName ) );
            }
        }

        productsByCategory.retainAll( productsByBrand );

        return productsByCategory;
    }

    @Override
    public void addProduct( Product product ) {
        listOfProducts.add( product );
    }
}
