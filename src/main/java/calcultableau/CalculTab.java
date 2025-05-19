package calcultableau;

import java.util.*;

public class CalculTab {
    private List<Integer> notes = new ArrayList<>();

    public void ajouterNote(int note) {
        notes.add(note);
    }

    public int taille() {
        return notes.size();
    }

    public double moyenne() {
        if (notes.isEmpty()) return 0;
        int sum = 0;
        for (int note : notes) {
            sum += note;
        }
        return (double) sum / notes.size();
    }

    public double mediane() {
        if (notes.isEmpty()) return 0;
        List<Integer> sorted = new ArrayList<>(notes);
        Collections.sort(sorted);
        int n = sorted.size();
        if (n % 2 == 1) {
            return sorted.get(n / 2);
        } else {
            return (sorted.get(n / 2 - 1) + sorted.get(n / 2)) / 2.0;
        }
    }
}