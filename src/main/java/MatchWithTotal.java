public class MatchWithTotal {
    private double totalOverKof;
    private int total;

    public MatchWithTotal(double totalOverKof, int total) {
        this.totalOverKof = totalOverKof;
        this.total = total;
    }

    public double getTotalOverKof() {
        return totalOverKof;
    }

    public boolean isTotalOver() {
        return total > 2.5;
    }
}
