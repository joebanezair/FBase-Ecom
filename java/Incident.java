public class Incident {
    public enum Level { LOW, MEDIUM, HIGH, CRITICAL }

    private final int id;
    private final String title;
    private final Level impact;
    private final Level urgency;

    public Incident(int id, String title, Level impact, Level urgency) {
        this.id = id;
        this.title = title;
        this.impact = impact;
        this.urgency = urgency;
    }

    public String getPriority() {
        if (impact == Level.CRITICAL && urgency == Level.HIGH) return "P1";
        if (impact == Level.CRITICAL || urgency == Level.HIGH) return "P2";
        if (impact == Level.MEDIUM || urgency == Level.MEDIUM) return "P3";
        return "P4";
    }

    @Override
    public String toString() {
        return String.format("#%d %-24s impact=%-8s urgency=%-8s priority=%s",
                id, title, impact, urgency, getPriority());
    }
}
