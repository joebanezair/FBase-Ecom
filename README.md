# Incident Toolkit — Java + C#

A small cross-language portfolio project that demonstrates **Java OOP** and **C#/.NET** with a realistic IT incident-management use case.

## What it does

The project contains two simple tools that work around the same incident model:

- **Java Incident Triage** — classifies incidents by urgency and impact, then calculates a support priority.
- **C# SLA Reporter** — evaluates incidents against response-time targets and prints a concise operational report.

## Skills demonstrated

- Object-Oriented Programming
- Classes, enums, collections, validation, and business rules
- Java console application structure
- C#/.NET console application structure
- Incident management and SLA concepts
- Clean, readable code designed for extension

## Java

```bash
cd java
javac Main.java Incident.java
java Main
```

## C#

```bash
cd csharp
dotnet run
```

## Example business rules

- Critical impact + high urgency => P1
- High impact or high urgency => P2
- Medium conditions => P3
- Everything else => P4

The C# tool then checks each incident against sample SLA targets and reports whether it is within target.

## Why this project matters

This mirrors the type of logic used in service desk, application support, and operations systems. It demonstrates that business requirements can be converted into clear program logic in more than one language.

## Next improvements

- Read incidents from JSON or a database
- Add unit tests
- Expose the Java logic through Spring Boot
- Expose the C# reporting layer through ASP.NET Core
- Add a small web dashboard
