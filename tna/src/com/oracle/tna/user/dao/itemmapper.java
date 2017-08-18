package com.oracle.tna.user.dao;

import java.util.List;

import com.oracle.tna.domain.Item;

public interface itemmapper {

	// 增
		public void insert(Item item);

		// 改
		public Item selectByid(int qid);

		//更新
		public void update(Item item);

		//选择
		public List<Item> select();

		// 删
		public void delete(int qid);
}
