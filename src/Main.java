
// JDK25
void main() {
    String[] ballots = {"Ana", "Rui", "Ana", "Eva", "Rui", "Ana", "Eva", "Ana"};

    Election election = new Election();
    for (String name : ballots) {
        election.vote(name);
    }

    election.showResults();
    IO.println("Total: " + election.getTotalVotes());
    IO.println("Winner: " + election.getWinner());

    // Extra
    election.showPercentages();
}
