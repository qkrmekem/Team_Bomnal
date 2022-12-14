package com.jobfinder.persistence;

import com.jobfinder.domain.Criteria;
import com.jobfinder.domain.Recruit;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface RecruitMapper {
    public Recruit notice(int r_seq);
    public ArrayList<Recruit> noticeList(int super_job_seq);
    public ArrayList<Recruit> allList(Criteria cri);
    public int countNotice(Criteria cri);

    public void insertJobPosting(Recruit recruit);

    public List<Recruit> getLatestRecruits();

    public Recruit getRecruit(int r_seq);

    public void updateJobPosting(Recruit recruit);

    public String getJobName(String r_part);

    public void deleteJobPosting(int r_seq);
}
