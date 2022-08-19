package com.aerospikeExample.demoApplication1.service;

import com.aerospikeExample.demoApplication1.model.AccountBalance;
import com.aerospikeExample.demoApplication1.model.accountbalance1;
import com.aerospikeExample.demoApplication1.repository.UserInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    @Autowired
    UserInterface userInterface;
    public accountbalance1 readUserById(String pkv) {
        Optional<AccountBalance> accountbalance = userInterface.findById(pkv);
        System.out.println(accountbalance);
        accountbalance1 accountbalance1 = new accountbalance1();
        accountbalance1.setAcctBal(accountbalance.get().getAcctBal());
        accountbalance1.setAcctType(accountbalance.get().getAcctType());
        accountbalance1.setAcctId(accountbalance.get().getAcctId());
//        Optional<List<AccountBalance123>> accountbalan=userInterface.findAllByAcctNameOrAcctCity("Praneeth3335","Bng");
//        System.out.println(accountbalan);
        return accountbalance1;
    }
    public void addUser(AccountBalance accountbalance) {
        userInterface.save(accountbalance);
    }
    public void removeUserById(String id) {
        userInterface.deleteById(id);
    }
}
