package atmmachine.db;


import atmmachine.atm.ATM;
import atmmachine.card.CardDetails;
import atmmachine.card.TransactionStatus;
import atmmachine.state.ATMState;

public class DBAccessor {

    private DBAccessor() {}

    public static ATMState getATMState(String machineId) {
        return ATMState.READY;
    }

    public static int createNewTransaction(String machineId) {
        return 1;
    }

    public static void updateATMState(String machineId, ATMState state) {

    }

    public static void persistCardDetails(CardDetails cardDetails, String machineId) {

    }

    public static void disapproveTransaction(String machineId) {

    }

    public static void cancelTransaction(int transId) {

    }

    public static void persistWithDetails(int transId, float amount, TransactionStatus status) {

    }

    public static float markAsExec(int transId) {return 0;}

}
