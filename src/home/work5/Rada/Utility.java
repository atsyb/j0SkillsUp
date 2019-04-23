package home.work5.Rada;

import java.util.*;

public class Utility {

    public Random randomno = new Random();


    /**
     * @param rada - party list
     * @param name - deputy name
     */
    public void takeBribe(Map<String, Party> rada, String name) {
        Set<Map.Entry<String, Party>> radaEntry = rada.entrySet();
        for (Map.Entry<String, Party> nameOfDeputy : radaEntry) {
            for (Deputy deputy : nameOfDeputy.getValue().getDeputyList()) {
                if (deputy.getName().equals(name)) {
                    deputy.setBribeTaker(true);
                }
            }
        }
    }

    public void takeBribeAtRandomForRada(Map<String, Party> rada) {
        Set<Map.Entry<String, Party>> radaEntry = rada.entrySet();
        for (Map.Entry<String, Party> dep : radaEntry) {
            for (Deputy deputy : dep.getValue().getDeputyList()) {
                if (randomno.nextBoolean()) {
                    deputy.setBribeTaker(true);
                }
            }
        }
    }


    public void takeBribeAtRandomForParty(Party party) {
        List<Deputy> deputiesInParty = party.getDeputyList();
        ListIterator listIterator = deputiesInParty.listIterator();
        while (listIterator.hasNext()) {
            if (randomno.nextBoolean()) {
                deputiesInParty.get(listIterator.nextIndex()).setBribeTaker(true);
            }
            listIterator.next();
        }
    }

    public void getDepBribe(Map<String, Party> rada) {
        Set<Map.Entry<String, Party>> radaEntry = rada.entrySet();
        for (Map.Entry<String, Party> dep : radaEntry) {
            for (Deputy deputy : dep.getValue().getDeputyList()) {
                if (deputy.isBribeTaker()) {
                    System.out.println(deputy.toString() + " :(");
                }
            }
        }
    }

    public void removeDeputyBribe(Map<String, Party> rada) {
        Set<Map.Entry<String, Party>> radaEntry = rada.entrySet();
        for (Map.Entry<String, Party> dep : radaEntry) {
            for (Iterator<Deputy> iterator = dep.getValue().getDeputyList().iterator(); iterator.hasNext(); ) {
                Deputy deputy = iterator.next();
                if (deputy.isBribeTaker()) {
                    iterator.remove();
                }
            }
            radaEntry.remove(removePartyBribe(rada));
        }

        if (rada.values().isEmpty()) {
            System.out.println("Dissolution of the  Rada!!!");
        }
    }

    public Party removePartyBribe(Map<String, Party> rada) {
        Party p = null;
        Set<Map.Entry<String, Party>> radaEntry = rada.entrySet();
        for (Map.Entry<String, Party> nameOfParty : radaEntry) {
            List<Deputy> PartyForRemove = nameOfParty.getValue().getDeputyList();
            if (PartyForRemove.isEmpty()) {
                System.out.println("remove==" + nameOfParty.toString());
                p = rada.get(PartyForRemove);
            }
        }
        return p;
    }


}