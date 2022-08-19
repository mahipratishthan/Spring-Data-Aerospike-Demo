package com.aerospikeExample.demoApplication1.repository;

import com.aerospikeExample.demoApplication1.model.AccountBalance;
import org.springframework.data.aerospike.repository.AerospikeRepository;

public interface UserInterface extends AerospikeRepository<AccountBalance,Object> {

//    Optional<List<AccountBalance123>> findAllByAcctNameOrAcctCity(String acctName,String acctCity);


}
