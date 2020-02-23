package day52.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {
    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();
        accountList.add(   new Account("John Snow", 10000)   );
        accountList.add(   new Account("Vald", 11000)   );
        accountList.add(   new Account("Muge", 13000)   );
        accountList.add(   new Account("Muhammad", 8000)   );
        accountList.add(   new Account("Emme", 17000)   );
        accountList.add(   new Account("Ata", 15000)   );
        System.out.println("accountList before = \n" + accountList);
        Collections.sort(accountList);
        System.out.println("accountList after = \n" + accountList);

        Account myAccount = new Account("Svetlana Gorokhova", 0);

        for( Account each : accountList){
            each.transferAll(myAccount);
        }
        System.out.println("myAccount = " + myAccount);
        System.out.println("accountList = "+ accountList);

        /**
         * What can be a data type of a1?
         * Account a1;
         * Compatible a1;
         * Transferable a1 ;
         * Object a1;
         *
         * An Object can be referred by:
         *
         * it's own type
         * it's super class type
         * interface type that is implemented
         *
         *
         */
        Account a1 = new Account ("Polymorphism", 10000) ;
        Transferable t1 = new Account ("Polymorphism2", 10000) ;
        Comparable c1 = new Account ("Polymorphism4", 10000) ;
        Object o1 = new Account ("Polymorphism3", 10000) ;


    }


}
