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

    public void takeBribeForAllRada(Map<String, Party> rada) {
        Set<Map.Entry<String, Party>> radaEntry = rada.entrySet();
        for (Map.Entry<String, Party> dep : radaEntry) {
            for (Deputy deputy : dep.getValue().getDeputyList()) {
                deputy.setBribeTaker(true);
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
            dep.getValue().getDeputyList().removeIf(Deputy::isBribeTaker);
        }

        if (rada.values().isEmpty()) {
            System.out.println("Dissolution of the Rada!!!");
        }
    }

    public void removePartyBribe(Map<String, Party> rada) {
        Iterator<Map.Entry<String, Party>> iterator = rada.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Party> partyEntry = iterator.next();
            if (partyEntry.getValue().getDeputyList().isEmpty())
                iterator.remove();
        }
        for (String name : rada.keySet()) {
            String key = name;
            Party value = rada.get(name);
            if (!value.getDeputyList().isEmpty()) {
                System.out.println("::Survived::\n" + key + " " + value);
            }
        }
    }


    public void removeAllParty(Map<String, Party> rada) {
        Set<String> keySet = rada.keySet();
        List<String> partyArrayList = new ArrayList<>();
        for (String key : keySet) {
            partyArrayList.add(key);
        }
        for (String key : partyArrayList) {
            rada.remove(key);
        }
        System.out.println("<<***>> " + rada.toString());
    }

    public void removePartyIfAllDeputyBribe(Map<String, Party> rada) {
        Set<Map.Entry<String, Party>> radaEntry = rada.entrySet();
        for (Map.Entry<String, Party> nameOfDeputy : radaEntry) {
            boolean flagPartyBribe = true;
            for (Deputy deputy : nameOfDeputy.getValue().getDeputyList()) {
                if (!deputy.isBribeTaker() & Objects.nonNull(deputy)) {
                    flagPartyBribe = false;
                    break;
                }
            }
            if (flagPartyBribe) {
                System.out.println(">>>For removing: " + nameOfDeputy.getKey());
                radaEntry.remove(nameOfDeputy.getValue());
            }
        }
        System.out.println("***((" + rada.toString());
    }

    public void removePartyIfAllDeputyBribeIterator(Map<String, Party> rada) {
        Set<Map.Entry<String, Party>> radaEntry = rada.entrySet();
        Iterator<Map.Entry<String, Party>> iterator = radaEntry.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Party> partyEntry = iterator.next();
            boolean flagPartyBribe = true;
            for (Deputy deputy : partyEntry.getValue().getDeputyList()) {
                if (!deputy.isBribeTaker()) {
                    flagPartyBribe = false;
                    break;
                }
            }
            if (flagPartyBribe) {
                System.out.println(">>>For removing: " + partyEntry.getKey());
                iterator.remove();
            }
        }
        System.out.println(rada.toString());
    }


    public Map<String, Party> removePartyIfAllAreBibeTakers(Map<String, Party> rada) {
        Set<String> keys = rada.keySet();
        List<String> partyNameWhereAllIsBribers = new ArrayList<>();
        for (String key : keys) {
            boolean inPartyIsAllBibered = rada.get(key)
                    .getDeputyList()
                    .stream()
                    .allMatch(Deputy::isBribeTaker);
            if (inPartyIsAllBibered) {
                partyNameWhereAllIsBribers.add(key);
            }
        }
        for (String key : partyNameWhereAllIsBribers) {
            rada.remove(key);
        }
        return rada;
    }


}