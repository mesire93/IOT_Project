package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface BoardMapper {
	
	//  @Select("select * from board order by bno desc")
	public List<BoardVO> getList();

}
