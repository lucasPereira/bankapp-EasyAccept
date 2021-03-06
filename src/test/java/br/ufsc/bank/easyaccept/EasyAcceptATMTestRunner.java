package br.ufsc.bank.easyaccept;

import java.util.ArrayList;
import java.util.List;

import br.ufsc.bank.easyaccept.facade.ATMFacade;
import easyaccept.EasyAcceptFacade;

public class EasyAcceptATMTestRunner {
    public static void main(String[] args) throws Exception {
    	List<String> files = new ArrayList<String>();
    	files.add("C:/Users/ernani/git/bankapp-EasyAccept/src/test/java/br/ufsc/bank/easyaccept/scripts/atm/");
        ATMFacade atmFacade = new ATMFacade();
        EasyAcceptFacade eaFacade = new EasyAcceptFacade(atmFacade, files);
        eaFacade.executeTests();
        System.out.println(eaFacade.getCompleteResults());
    }

}

