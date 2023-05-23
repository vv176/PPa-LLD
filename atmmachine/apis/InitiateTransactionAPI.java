package atmmachine.apis;

import atmmachine.atm.ATM;

public class InitiateTransactionAPI {

    public int initiateTransaction(String machineId) {
        if (machineId == null || machineId.length() == 0)
            throw new IllegalArgumentException("machineId can't be null or empty");
        ATM atm = new ATM(machineId);
        return atm.init();
    }

}
