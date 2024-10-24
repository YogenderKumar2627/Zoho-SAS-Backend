package day1;

public class EmployeeManagentConsDest {
    public static void main(String[] args) {
        TeamManagement team = new TeamManagement("Frontend", "Making pixels dance");
        team.displayTask();
        team = null;
        System.gc();
    }
}

class TeamManagement {
    public String teamname;
    public String work;

    TeamManagement(String teamname, String work) {
        this.teamname = teamname;
        this.work = work;
        System.out.println("Team created: " + teamname);
    }

    public void displayTask() {
        System.out.println("The team: " + teamname);
        System.out.println("The task: " + work);
    }

    /**
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("The team " + teamname + " is demolished (finalize called)");
    }
}

