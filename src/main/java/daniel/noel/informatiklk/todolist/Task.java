package daniel.noel.informatiklk.todolist;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
    String titel;
    String beschreibung;
    LocalDate faelligkeitsdatum;
    String status;

    public Task(String titel, String beschreibung, LocalDate faelligkeitsdatum, String status) {
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.faelligkeitsdatum = faelligkeitsdatum;
        this.status = status;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public LocalDate getFaelligkeitsdatum() {
        return faelligkeitsdatum;
    }

    public void setFaelligkeitsdatum(LocalDate faelligkeitsdatum) {
        this.faelligkeitsdatum = faelligkeitsdatum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = faelligkeitsdatum.format(formatter);
        return String.format("%s : %s | Fälligkeitsdatum: %s | Status: %s", 
                titel, beschreibung, formattedDate, status);
    }
}
