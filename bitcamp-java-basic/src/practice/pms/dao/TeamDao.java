package practice.pms.dao;

import practice.pms.domain.Team;

public class TeamDao {
    Team[] teams = new Team[1000];
    int teamIndex = 0;
    
    public void insert(Team team) {
        this.teams[this.teamIndex++] = team;
    }
    
    public Team[] list() {
        Team[] arr = new Team[this.teamIndex];
        for (int i = 0 ; i < this.teamIndex ; i++) 
            arr[i] = this.teams[i];
        return arr;
    }
    
    private int getTeamIndex(String name) {
        for (int i = 0 ; i < this.teamIndex; i++) {
            if (this.teams[i] == null) continue;
            if (name.equals(this.teams[i].name.toLowerCase())) {
                return i;
            }
        }return -1;
    }
    
   
}
