package day5week2extentreport;



	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	public class LearnProperties {

		public static void main(String[] args) throws FileNotFoundException, IOException {
			Properties prop = new Properties();
			prop.load(new FileInputStream("./src/main/resources/Object.properties"));
			System.out.println(prop.getProperty("MyHomePage.leads.link"));
	}
}
