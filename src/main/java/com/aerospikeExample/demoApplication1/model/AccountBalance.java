package com.aerospikeExample.demoApplication1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.aerospike.annotation.Indexed;
import org.springframework.data.aerospike.mapping.Document;
import org.springframework.data.annotation.Id;

import static com.aerospike.client.query.IndexCollectionType.DEFAULT;
import static com.aerospike.client.query.IndexType.STRING;
import static com.aerospike.client.query.IndexType.NUMERIC;


@Data
@Document
@AllArgsConstructor
public class AccountBalance {

    @Id
    private String pkv;
    @Indexed(type = STRING, collectionType = DEFAULT)
    private String acctId;
    @Indexed(type = STRING, collectionType = DEFAULT)
    private String acctType;
    @Indexed(type = NUMERIC, collectionType = DEFAULT)
    private Long acctBal;
    @Indexed(type = STRING, collectionType = DEFAULT)
    private String custId;
    @Indexed(type = STRING, collectionType = DEFAULT)
    private String acctName;
    @Indexed(type = STRING, collectionType = DEFAULT)
    private String acctCity;
    @Indexed(type = STRING, collectionType = DEFAULT)
    private String acctDetails;
}
