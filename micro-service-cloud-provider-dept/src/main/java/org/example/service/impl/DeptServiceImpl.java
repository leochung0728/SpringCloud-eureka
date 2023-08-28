package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.entity.Dept;
import org.example.mapper.DeptMapper;
import org.example.po.DeptPo;
import org.example.repository.DeptRepository;
import org.example.service.DeptService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    private DeptRepository deptRepository;

    public DeptServiceImpl(DeptRepository deptRepository) {
        this.deptRepository = deptRepository;
    }

    @Override
    public Dept get(Integer deptNo) {
        DeptPo dept = deptRepository.findByDeptNo(deptNo);
        return DeptMapper.INSTANCE.toEntity(dept);
    }

    @Override
    public List<Dept> selectAll() {
        List<DeptPo> depts = deptRepository.findAll();
        return DeptMapper.INSTANCE.toEntity(depts);
    }
}
