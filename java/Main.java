import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Incident> incidents = List.of(
            new Incident(101, "Production login outage", Incident.Level.CRITICAL, Incident.Level.HIGH),
            new Incident(102, "VPN access problem", Incident.Level.HIGH, Incident.Level.MEDIUM),
            new Incident(103, "Printer offline", Incident.Level.LOW, Incident.Level.LOW)
        );

        System.out.println("Incident Triage Report");
        System.out.println("=".repeat(78));
        incidents.forEach(System.out::println);
    }
}
