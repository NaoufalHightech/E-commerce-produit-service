package com.ecommerce.microservices.adapters.out.persistence.mappers;

import org.mapstruct.Mapper;

@Mapper
public interface TestMapper {
    Test TestDtoToTest(TestDto testDto);
    TestDto TestToTestDto(Test test);
}
