package org.zerock.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Builder
@AllArgsConstructor
@Data//setter getter 자동 생성
public class PageRequestDTO {
    private int page, size;
    private String type, keyword;
    public PageRequestDTO(){ //기본 생성자.
        page =1;
        size =10;
    }
    public Pageable getPageable(Sort sort){
        return PageRequest.of(page-1, size, sort);
    }
}