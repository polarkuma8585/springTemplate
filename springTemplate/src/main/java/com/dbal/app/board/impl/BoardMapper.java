package com.dbal.app.board.impl;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.dbal.app.board.Board;

@Repository // Dao
@MapperScan
public interface BoardMapper {
	List<Board> selectall();
	Board selectone(int seq);
	void insert(Board board);
	void update(Board board);
	void delete(int seq);
}
