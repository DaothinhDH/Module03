package BAITAP.Sapxepdoibong;

public class FootballTeam {
    private int Id;
    private String Name;
    private int numberOfPlayers;
    private int score;

    public FootballTeam(){}
    public FootballTeam(int id, String name, int numberOfPlayers, int score) {
        Id = id;
        Name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "FootballTeam " +
                " Mã số: " + Id +
                ", Tên: \"" + Name + "\"" +
                ", Số lượng cầu thủ: " + numberOfPlayers +
                ", Điểm số: " + score + "||";
    }
}
