package com.oracle.tna.user.dao;

import java.util.List;

import com.oracle.tna.domain.Score;


public interface scoremapper {

		// 增
		public void insert(Score score);

		// 改
		public Score selectByid(int sid);
		
		public Score selectByUid(int USER_UID);
		
		//更新
		public void update(Score score);

		//选择
		public List<Score> select();

		// 删
		public void delete(int sid);
}
