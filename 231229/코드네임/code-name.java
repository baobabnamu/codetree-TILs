import java.util.*;
import java.io.*;

class Agent {
    String agentName;
    int agentScore;

    public Agent() {
        this.agentName = "";
        this.agentScore = 0;
    }

    public Agent(String agentName, int agentScore) {
        this.agentName = agentName;
        this.agentScore = agentScore;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Agent[] agents = new Agent[5];
        for(int i=0; i<5; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            agents[i] = new Agent(name, score);
        }

        Agent minAgent = agents[0];
        for(int i=0; i<4; i++) {
            if(minAgent.agentScore > agents[i+1].agentScore) {
                minAgent = agents[i+1];
            }
        }
        
        System.out.printf("%s %d", minAgent.agentName, minAgent.agentScore);
    }
}