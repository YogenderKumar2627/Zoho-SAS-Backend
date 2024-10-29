package day2;

class Team{
    private String TeamName;
    private String Goal;
    private String Head;

    public Team(String teamName, String goal, String head) {
        this.TeamName = teamName;
        this.Goal = goal;
        this.Head = head;
    }
    class TeamMember{
        private String memberName;
        private String role;

        public TeamMember(String memberName, String role) {
            this.memberName = memberName;
            this.role = role;
        }

        public void displayMemberInfo() {
            System.out.println("Team: " + TeamName);
            System.out.println("Goal: " + Goal);
            System.out.println("Head: " + Head);
            System.out.println("Member Name: " + memberName);
            System.out.println("Role: " + role);
        }
    }

}
public class TeamNestedClass {
    public static void main(String[] args) {
        Team team=new Team("AAPSY","Ekart","Sandee");
        Team.TeamMember teamMember=team.new TeamMember("Abhi","SysAdmin");
        teamMember.displayMemberInfo();
    }

}
