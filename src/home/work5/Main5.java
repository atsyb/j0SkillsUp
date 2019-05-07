package home.work5;

import home.work5.Rada.Deputy;
import home.work5.Rada.Party;
import home.work5.Rada.Utility;

import java.util.*;

public class Main5 {

    public static void main(String[] args) {
        System.out.println("__SkillsUp:HomeWork5__(java collections map)\n");

        Map<String, Party> rada = new HashMap();

        List<Deputy> deputyListX = new ArrayList<>();
        List<Deputy> deputyListY = new ArrayList<>();
        List<Deputy> deputyListZ = new ArrayList<>();

        Party partyX = new Party(deputyListX);
        Party partyY = new Party(deputyListY);
        Party partyZ = new Party(deputyListZ);

        Deputy deputy1 = new Deputy("Deputy1", false);
        Deputy deputy2 = new Deputy("Deputy2", false);
        Deputy deputy3 = new Deputy("Deputy3", false);
        Deputy deputy4 = new Deputy("Deputy4", false);
        Deputy deputy5 = new Deputy("Deputy5", false);
        Deputy deputy6 = new Deputy("Deputy6", false);
        Deputy deputy7 = new Deputy("Deputy7", false);
        Deputy deputy8 = new Deputy("Deputy8", false);

        Utility u = new Utility();

        deputyListX.add(deputy1);
        deputyListX.add(deputy2);
        deputyListX.add(deputy3);
        deputyListX.add(deputy4);
        deputyListY.add(deputy5);
        deputyListY.add(deputy6);
        deputyListY.add(deputy7);
        deputyListY.add(deputy8);

        rada.put("Koalition (X)", partyX);
        rada.put("Oposition (Y)", partyY);
        rada.put("Nonpartisan (Z)", partyZ);
//-----------
        u.takeBribe(rada, deputy1.getName());
        u.takeBribeAtRandomForRada(rada);
        u.takeBribeAtRandomForParty(partyX);

        System.out.println(rada.toString());
        //System.out.println(partyX.toString());
        u.getDepBribe(rada);
        u.removeDeputyBribe(rada);
        System.out.println(rada.toString());
        //u.removePartyBribe(rada);
        //u.takeBribeForAllRada(rada);
        //u.removePartyIfAllDeputyBribeIterator(rada);
        u.removePartyIfAllDeputyBribe(rada);
        //u.removeAllParty(rada);
        System.out.println("_______Those who stayed__________");
        System.out.println(rada.toString());
    }
}
