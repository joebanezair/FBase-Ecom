record Incident(int Id, string Title, string Priority, int ResponseMinutes);

var incidents = new List<Incident>
{
    new(101, "Production login outage", "P1", 8),
    new(102, "VPN access problem", "P2", 24),
    new(103, "Printer offline", "P4", 180)
};

var slaTargets = new Dictionary<string, int>
{
    ["P1"] = 15,
    ["P2"] = 30,
    ["P3"] = 120,
    ["P4"] = 240
};

Console.WriteLine("SLA Compliance Report");
Console.WriteLine(new string('=', 68));

foreach (var incident in incidents)
{
    var target = slaTargets[incident.Priority];
    var withinSla = incident.ResponseMinutes <= target;
    Console.WriteLine(
        $"#{incident.Id} {incident.Title,-24} {incident.Priority} " +
        $"response={incident.ResponseMinutes,3}m target={target,3}m " +
        $"{(withinSla ? "PASS" : "BREACH")}");
}

var compliance = incidents.Count == 0
    ? 100
    : incidents.Count(i => i.ResponseMinutes <= slaTargets[i.Priority]) * 100.0 / incidents.Count;

Console.WriteLine($"\nOverall SLA compliance: {compliance:F1}%");
