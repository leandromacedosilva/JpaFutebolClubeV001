
package com.jpafutebolclube.driver;

import com.jpafutebolclube.dao.TimeDAO;
import com.jpafutebolclube.model.Time;
import java.util.List;

/**
 *
 * @author itccolina
 */
public class MainTeamQueryList {
    public static void main(String[] args) {
        TimeDAO timeDAO = new TimeDAO();
        List<Time> times = timeDAO.allTeams();
        System.out.println("");
        System.out.println("...................... TEAM OF LIST ............................................................");
        System.out.println("" + times);
        System.out.println("................................................................................................");
        System.out.println("");
    }
}
