package com.atlantasanad.healthinsurance;
import java.util.ArrayList;
import java.util.List;



public class ContractManager {

    private List<Contract> contracts;

    public ContractManager() {
        this.contracts = new ArrayList<>();
    }
    public void createContract(int number) {
        Contract contract = new Contract(number);
         contracts.add (contract);
    }
    public void deleteContract(Contract contract) {
        if (contract.getMembers().isEmpty()) {
            contracts.remove(contract);
        } else {
            throw new RuntimeException("Cannot delete contract with members.");
        }
    }
}
