// @SpringBootApplication
// public class SpringLearnApplication {

//     public static void main(String[] args) {
//         System.out.println("Inside main");
//         SpringApplication.run(SpringLearnApplication.class, args);
//     }
// }

// import java.text.SimpleDateFormat;
// import java.util.Date;
// import org.springframework.context.ApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

// @SpringBootApplication
// public class SpringLearnApplication {

//     public static void main(String[] args) {
//         SpringApplication.run(SpringLearnApplication.class, args);
//         displayDate();
//     }

//     public static void displayDate() {
//         ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
//         SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

//         try {
//             Date date = format.parse("31/12/2018");
//             System.out.println(date);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        LOGGER.info("START main()");
        SpringApplication.run(SpringLearnApplication.class, args);
        displayDate();
        LOGGER.info("END main()");
    }

    public static void displayDate() {
        LOGGER.info("START displayDate()");
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

        try {
            Date date = format.parse("31/12/2018");
            LOGGER.debug("Parsed Date: {}", date);
        } catch (Exception e) {
            LOGGER.error("Parse Error", e);
        }
        LOGGER.info("END displayDate()");
    }
}
public static void displayCountry() {
    LOGGER.info("START displayCountry()");
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
    Country country = context.getBean("country", Country.class);
    LOGGER.debug("Country : {}", country.toString());
    LOGGER.info("END displayCountry()");
}
public static void displayCountries() {
    LOGGER.info("START displayCountries()");
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
    List<Country> countries = (List<Country>) context.getBean("countryList");
    LOGGER.debug("Countries : {}", countries);
    LOGGER.info("END displayCountries()");
}
