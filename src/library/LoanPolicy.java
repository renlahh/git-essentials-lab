package library;

public class LoanPolicy {
    public int maxBooks(MemberType type) { return type == MemberType.STUDENT ? 3 : (type == MemberType.FACULTY ? 5 : 2); }
    public int loanDays() { return 14; }
    public int overdueFee(int daysLate) { return Math.max(0, daysLate) * 100; }
}