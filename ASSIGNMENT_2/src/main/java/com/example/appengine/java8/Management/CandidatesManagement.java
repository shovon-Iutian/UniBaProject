package com.example.appengine.java8.Management;

import com.example.appengine.java8.DTO.Candidates;
import com.example.appengine.java8.Entity.CandidatesEntity;
import com.example.appengine.java8.Service.CandidateManagementService;
import com.google.appengine.api.datastore.Entity;

import java.util.logging.Logger;

public class CandidatesManagement extends AbstractCrudManagement<Candidates> implements CandidateManagementService<Candidates> {
    private static Logger logger = Logger.getLogger(CandidatesManagement.class.getName());

    private CandidatesEntity candidatesEntity = new CandidatesEntity();

    @Override
    public Entity convertDtoToEntity(Candidates candidates) {
        Entity candidateEntity = new Entity(candidatesEntity.getCandidateKind(), candidatesEntity.getCandidateKey());
        candidateEntity.setProperty(candidatesEntity.getCandidateFirstProperty(), candidates.getFirstName());
        candidateEntity.setProperty(candidatesEntity.getCandidateSecondProperty(), candidates.getSurName());
        candidateEntity.setProperty(candidatesEntity.getCandidateThirdProperty(), candidates.getFaculty());
        return candidateEntity;
    }

    @Override
    public Candidates convertEntityToDto(Entity entity) {
        Candidates candidates = new Candidates();
        candidates.setKey(entity.getKey());
        candidates.setFirstName((String) entity.getProperty(candidatesEntity.getCandidateFirstProperty()));
        candidates.setSurName((String) entity.getProperty(candidatesEntity.getCandidateSecondProperty()));
        candidates.setFaculty((String) entity.getProperty(candidatesEntity.getCandidateThirdProperty()));
        return candidates;
    }
}
