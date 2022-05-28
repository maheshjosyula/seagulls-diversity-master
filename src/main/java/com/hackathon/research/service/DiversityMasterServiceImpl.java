package com.hackathon.research.service;

import com.hackathon.research.model.DiversityMasterRequest;
import com.hackathon.research.model.DiversityMasterResponse;
import org.springframework.stereotype.Service;

@Service
public class DiversityMasterServiceImpl implements DiversityMasterService{

    @Override
    public DiversityMasterResponse getDiversityData(DiversityMasterRequest diversityMasterRequest) {
        //call DB API
        DiversityMasterResponse diversityMasterResponse=new DiversityMasterResponse();
        diversityMasterResponse.setCompanyName(diversityMasterRequest.getCompanyName());
        diversityMasterResponse.setFemaleOwnedIndicator(true);
        diversityMasterResponse.setMinorityOwnedIndicator(true);
        diversityMasterResponse.setStatus("completed");
        diversityMasterResponse.setOwnershipEthnicity("HISPANIC");
        if(!"completed".equalsIgnoreCase(diversityMasterResponse.getStatus())){
            //call Image scanner
            diversityMasterResponse.setFemaleOwnedIndicator(true);
            diversityMasterResponse.setMinorityOwnedIndicator(true);
            diversityMasterResponse.setStatus("completed");
            diversityMasterResponse.setOwnershipEthnicity("HISPANIC");
        }
        if(!"completed".equalsIgnoreCase(diversityMasterResponse.getStatus())){
            //call NLP service
            diversityMasterResponse.setFemaleOwnedIndicator(true);
            diversityMasterResponse.setMinorityOwnedIndicator(true);
            diversityMasterResponse.setStatus("in progress");
            diversityMasterResponse.setOwnershipEthnicity("HISPANIC");
        }
        return diversityMasterResponse;
    }
}
