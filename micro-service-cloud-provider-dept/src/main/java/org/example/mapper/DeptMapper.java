package org.example.mapper;

import org.example.entity.Dept;
import org.example.po.DeptPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DeptMapper {
    DeptMapper INSTANCE = Mappers.getMapper(DeptMapper.class);

    DeptPo toPo(Dept dept);
    Dept toEntity(DeptPo deptPo);

    List<DeptPo> toPo(List<Dept> dept);
    List<Dept> toEntity(List<DeptPo> deptPo);

}
