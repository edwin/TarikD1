package com.edw.kpu.grabber.service;

import com.edw.kpu.grabber.bean.D1;
import com.edw.kpu.grabber.config.MyBatisSqlSessionFactory;
import com.edw.kpu.grabber.mapper.D1Mapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

/**
 *
 * @author edwin < edwinkun at gmail dot com >
 */
public class D1Service {

    private Logger logger = Logger.getLogger(this.getClass());

    public void insert(D1 d1) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession(true);
            D1Mapper d1Mapper = sqlSession.getMapper(D1Mapper.class);
            d1Mapper.insert(d1);
        } catch (Exception e) {
            logger.error(e, e);
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
