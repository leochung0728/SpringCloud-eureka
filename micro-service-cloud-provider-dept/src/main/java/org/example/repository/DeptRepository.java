package org.example.repository;

import org.example.po.DeptPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepository extends JpaRepository<DeptPo, Long> {

    @Query(value = "select * from DEPT where dept_no = ?1", nativeQuery = true)
    DeptPo findByDeptNo(Integer deptNo);
}
