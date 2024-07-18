import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.PriorityQueue;

public class myMain {

    // Method to format a date string into a Date object
    public static Date format(int day, int month, int year, int hours, int minutes, int seconds) {
        String dateString = String.format("%d/%d/%d %d:%d:%d", day, month, year, hours, minutes, seconds);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {

        // Create a priority queue for the flights
        PriorityQueue<FlightNode> flights = new PriorityQueue<>();

        // Read the contents of planes.csv and add the flights to the priority queue
        try {
            BufferedReader reader = new BufferedReader(new FileReader("planes.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t");
                String registration = data[0];
                String[] departureDate = data[1].split(" ");
                String[] departureTime = departureDate[1].split(":");
                Date departure = format(Integer.parseInt(departureDate[0].split("/")[0]),
                        Integer.parseInt(departureDate[0].split("/")[1]), Integer.parseInt(departureDate[0].split("/")[2]),
                        Integer.parseInt(departureTime[0]), Integer.parseInt(departureTime[1]),
                        Integer.parseInt(departureTime[2]));
                String[] duration = data[2].split(":");
                long arrivalTime = departure.getTime() + (Integer.parseInt(duration[0]) * 3600000L)
                        + (Integer.parseInt(duration[1]) * 60000L) + (Integer.parseInt(duration[2]) * 1000L);
                Date arrival = new Date(arrivalTime);
                FlightNode flight = new FlightNode(registration, arrival);
                flights.add(flight);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        // Display the flights ordered by arrival time
        while (!flights.isEmpty()) {
            System.out.println(flights.poll().toString());
        }
    }

}
