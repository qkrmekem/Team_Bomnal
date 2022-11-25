package com.jobfinder.service;

import com.jobfinder.domain.Job;
import com.jobfinder.persistence.MainMapper;
import com.jobfinder.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {
    @Autowired
    MainRepository mainRepository;

    @Override
    public List<Job> getList() {
        List<Job> job_list = mainRepository.getList();
        return job_list;
    }

    @Override
    public List<Job> getJobDetail(int super_seq) {
        List<Job> getJobDetail = mainRepository.getJobDetail(super_seq);
        return getJobDetail;
    }
}