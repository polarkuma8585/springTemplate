package com.dbal.app.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbal.app.board.Board;

@Service("boardService") //service
public class BoardServiceImpl {
	// 객체주입
	@Autowired
	BoardMapper boardMapper;

	public List<Board> getSelectall() {
		return this.boardMapper.selectall();
	}

	public Board getSelectone(int seq) {
		return this.boardMapper.selectone(seq);
	}

	public void insert(Board board) {
		this.boardMapper.insert(board);
	}

	public void update(Board board) {
		this.boardMapper.update(board);
	}

	public void delete(int seq) {
		this.boardMapper.delete(seq);
	}
}
