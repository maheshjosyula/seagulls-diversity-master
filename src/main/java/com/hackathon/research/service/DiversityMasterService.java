package com.hackathon.research.service;

import com.hackathon.research.model.DiversityMasterRequest;
import com.hackathon.research.model.DiversityMasterResponse;

public interface DiversityMasterService {
    public DiversityMasterResponse getDiversityData(DiversityMasterRequest diversityMasterRequest);
}
