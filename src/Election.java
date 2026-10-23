import java.util.Map;
import java.util.TreeMap;

public class Election {

    // candidate -> number of votes
    private final Map<String, Integer> votes = new TreeMap<>();

    public void vote(String candidate) {
        int current = votes.getOrDefault(candidate, 0);
        votes.put(candidate, current + 1);
    }

    public int getTotalVotes() {
        int total = 0;
        for (int v : votes.values()) {
            total += v;
        }
        return total;
    }

    public String getWinner() {
        String winner = null;
        int max = 0;
        for (String candidate : votes.keySet()) {
            if (votes.get(candidate) > max) {
                max = votes.get(candidate);
                winner = candidate;
            }
        }
        return winner;
    }

    public void showResults() {
        for (String candidate : votes.keySet()) {
            System.out.println(candidate + ": " + votes.get(candidate) + " votes");
        }
    }

    // Extra: percentage of each candidate
    public void showPercentages() {
        int total = getTotalVotes();
        for (String candidate : votes.keySet()) {
            double percent = votes.get(candidate) * 100.0 / total;
            System.out.println(candidate + ": " + percent + "%");
        }
    }
}
